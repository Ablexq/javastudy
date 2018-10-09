package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类，实现InvocationHandler 接口
 */
public class ProxyObject implements InvocationHandler {

    //要代理的真实对象
    private Object target;

    public ProxyObject(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        if ("getName".equals(method.getName())) {
            System.out.println("++++++before " + method.getName() + "++++++");
            Object result = method.invoke(target, args);
            System.out.println("++++++after " + method.getName() + "++++++");
            return result;
        } else {
            System.out.println("-----before " + method.getName() + "-----");
            Object result = method.invoke(target, args);
            System.out.println("-----after " + method.getName() + "-----");
            return result;
        }

    }
}
