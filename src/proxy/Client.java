package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by lenovo on 2018/6/1.
 */
public class Client {

    public static void main(String[] args) {

        CalculatorImpl calculatorImpl = new CalculatorImpl();//被代理类
//        CalculatorHandler calculatorHandler = new CalculatorHandler();
//        Calculator calculator = (Calculator) calculatorHandler.bind(calculatorImpl);//代理类
//        System.out.println(calculator.add(1,2));
//        System.out.println(calculator.minus(1, 2));

        StaticCalculatorProxy staticCalculatorProxy = new StaticCalculatorProxy(calculatorImpl);
        System.out.println(staticCalculatorProxy.add(1,2));
        System.out.println(staticCalculatorProxy.minus(1, 2));

        //被代理对象
        CustomInterface realObject = new RealObject();
        //代理对象
        InvocationHandler proxyObject = new ProxyObject(realObject);
        ClassLoader classLoader = realObject.getClass().getClassLoader();
        Class<?>[] interfaces = realObject.getClass().getInterfaces();//被代理对象的实际接口
        CustomInterface proxyInstance = (CustomInterface) Proxy.newProxyInstance(classLoader, interfaces, proxyObject);

        System.out.println(proxyInstance.getName(1));
        System.out.println(proxyInstance.getAge(1));
    }

}
