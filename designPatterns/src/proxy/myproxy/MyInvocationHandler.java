package proxy.myproxy;

import java.lang.reflect.Method;

/**
 * @author light
 * @date 13/6/2020 下午 9:21
 */
public interface MyInvocationHandler {
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
