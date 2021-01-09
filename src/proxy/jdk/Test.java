package proxy.jdk;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @author light
 * @date 13/6/2020 下午 5:48
 */
public class Test {
    public static void main(String[] args) throws Exception {
        //
        Person p = (Person) new TestProxy().getInstance(new Teacher());
        p.study();

        // 获取proxy文件
        byte[] data = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]
                {Person.class});
        FileOutputStream fs = new FileOutputStream("D:/$Proxy0.class");
        fs.write(data);
        fs.close();
    }
}
