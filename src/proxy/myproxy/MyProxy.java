package proxy.myproxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author light
 * @date 16/6/2020 上午 10:00
 */
public class MyProxy {

    /**
     * 回车符号
     */
    private static String ln = "\r\n";

    /**
     * 获取动态代理的类
     * @param loader 自己的类加载器
     * @param interfaces 代理类继承的接口
     * @param h 处理类
     * @return 动态生成的类
     */
    public static Object newProxyInstance(MyClassLoader loader,
                                          Class<?>[] interfaces,
                                          MyInvocationHandler h) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        // 生成源代码
        String src = generateSrc(interfaces[0]);

        // 输出到文件
        String filePath = MyProxy.class.getResource("").getPath();
        File file = new File(filePath + "$Proxy0.java");
        FileWriter fw = new FileWriter(file);
        fw.write(src);
        fw.flush();
        fw.close();

        // 编译源代码
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
        // 编译单元
        Iterable iterable = manager.getJavaFileObjects(file);
        // 编译任务
        JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
        task.call();
        manager.close();

        // 将class文件中的内容，动态加载到JVM中来


        Class proxyClass = loader.findClass("$Proxy0");
        Constructor c = proxyClass.getConstructor(MyInvocationHandler.class);
        file.delete();
        //5.返回被代理后的代理对象
        return c.newInstance(h);
    }

    /**
     * 生成代理类的源代码
     * @param interfaces 实现的接口
     * @return 代码
     */
    private static String generateSrc(Class<?> interfaces) {
        StringBuffer src = new StringBuffer();
        src.append("package proxy.myproxy;" + ln);
        src.append("import java.lang.reflect.Method;" + ln);
        src.append("public class $Proxy0 implements " + interfaces.getName() + "{" + ln);

        src.append("MyInvocationHandler h;" + ln);

        src.append("public $Proxy0(MyInvocationHandler h) {" + ln);
        src.append("this.h = h;" + ln);
        src.append("}" + ln);

        for (Method m : interfaces.getMethods()) {
            src.append("public " + m.getReturnType().getName() + " " + m.getName() + "(){" + ln);

            src.append("try{" + ln);
            src.append("Method m = " + interfaces.getName() + ".class.getMethod(\"" + m.getName() + "\",new Class[]{});" + ln);
            src.append("this.h.invoke(this,m,null);" + ln);
            src.append("}catch(Throwable e){e.printStackTrace();}" + ln);
            src.append("}" + ln);
        }

        src.append("}");
        return src.toString();
    }
}
