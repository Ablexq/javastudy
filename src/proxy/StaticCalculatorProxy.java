package proxy;

public class StaticCalculatorProxy implements Calculator {
    Calculator obj;

    public StaticCalculatorProxy(Calculator obj) {
        this.obj = obj;
    }

    @Override
    public Integer add(Integer num1, Integer num2) {
        System.out.println("in StaticCalculatorProxy, before invocation");
        Integer ret = obj.add(num1, num2);
        System.out.println("in StaticCalculatorProxy, after invocation");
        return ret;
    }

    @Override
    public Integer minus(Integer num1, Integer num2) {
        System.out.println("in StaticCalculatorProxy, before invocation");
        Integer ret = obj.minus(num1, num2);
        System.out.println("in StaticCalculatorProxy, after invocation");
        return ret;
    }

}