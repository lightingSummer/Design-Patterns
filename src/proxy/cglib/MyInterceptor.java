package proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author light
 * @date 16/6/2020 下午 9:44
 */
public class MyInterceptor implements MethodInterceptor {

    public Object getInstance(Class clazz) throws Exception {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        // 设置回调
        enhancer.setCallback(this);
        // 第一步、生成源代码
        // 第二步、编译成class文件
        // 第三步、加载到JVM中，并返回被代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
            throws Throwable {
        System.out.println("调用前");
        methodProxy.invokeSuper(o, objects);
        System.out.println("调用后");
        return null;
    }
}
