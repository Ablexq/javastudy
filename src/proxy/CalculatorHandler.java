package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CalculatorHandler implements InvocationHandler {

    private Object obj; //被代理类

    //绑定委托对象，并返回代理类
    public Object bind(Object obj) {
        this.obj = obj;
        //绑定该类实现的所有接口，取得代理类
        return Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("in calculatorhandler, before invocation");

        Object ret = method.invoke(obj, args);  //执行被代理类方法

        System.out.println("in calculationhandler, after invocation");
        return ret;
    }

}