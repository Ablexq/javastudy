package factory;

/**
 * http://blog.csdn.net/jason0539/article/details/44976775
 * 抽象工厂模式是工厂方法模式的升级版本，他用来创建一组相关或者相互依赖的对象。
 * 比如宝马320系列使用空调型号A和发动机型号A，
 * 而宝马230系列使用空调型号B和发动机型号B，那么使用抽象工厂模式，
 * 在为320系列生产相关配件时，就无需制定配件的型号，它会自动根据车型生产对应的配件型号A。
 * 客户类：
 */
public class Customer4 {
    public static void main(String[] args) {
        //生产宝马320系列配件
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        factoryBMW320.createEngine();
        factoryBMW320.createAircondition();

        //生产宝马523系列配件
        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
        factoryBMW523.createEngine();
        factoryBMW523.createAircondition();
    }

    //----------------工厂类：-----------------------
    //创建工厂的接口
    public static interface AbstractFactory {
        //制造发动机
        public Engine createEngine();

        //制造空调
        public Aircondition createAircondition();
    }


    //为宝马320系列生产配件
    public static class FactoryBMW320 implements AbstractFactory {

        @Override
        public Engine createEngine() {
            return new EngineA();
        }

        @Override
        public Aircondition createAircondition() {
            return new AirconditionA();
        }
    }

    //宝马523系列
    public static class FactoryBMW523 implements AbstractFactory {

        @Override
        public Engine createEngine() {
            return new EngineB();
        }

        @Override
        public Aircondition createAircondition() {
            return new AirconditionB();
        }
    }

    //-----------------产品类：---------------------
    //发动机以及型号
    public interface Engine {

    }

    public static class EngineA implements Engine {
        public EngineA() {
            System.out.println("制造-->EngineA");
        }
    }

    public static class EngineB implements Engine {
        public EngineB() {
            System.out.println("制造-->EngineB");
        }
    }

    //空调以及型号
    public interface Aircondition {

    }

    public static class AirconditionA implements Aircondition {
        public AirconditionA() {
            System.out.println("制造-->AirconditionA");
        }
    }

    public static class AirconditionB implements Aircondition {
        public AirconditionB() {
            System.out.println("制造-->AirconditionB");
        }
    }
}
