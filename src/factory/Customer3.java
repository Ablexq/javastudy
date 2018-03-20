package factory;

/**
 * http://blog.csdn.net/jason0539/article/details/23020989
 *工厂方法模式:
 * 工厂方法模式去掉了简单工厂模式中工厂方法的静态属性，使得它可以被子类继承。
 * 这样在简单工厂模式里集中在工厂方法上的压力可以由工厂方法模式里不同的工厂子类来分担。
 * 客户类：
 */
public class Customer3 {
    public static void main(String[] args) {
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        BMW320 bmw320 = factoryBMW320.createBMW();

        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
        BMW523 bmw523 = factoryBMW523.createBMW();
    }

    //----------------工厂类：-----------------------
    static interface FactoryBMW {
        BMW createBMW();
    }

    public static class FactoryBMW320 implements FactoryBMW {
        @Override
        public BMW320 createBMW() {
            return new BMW320();
        }
    }

    public static class FactoryBMW523 implements FactoryBMW {
        @Override
        public BMW523 createBMW() {
            return new BMW523();
        }
    }

    //-----------------产品类：---------------------
    static abstract class BMW {
        public BMW() {

        }
    }

    public static class BMW320 extends BMW {
        public BMW320() {
            System.out.println("制造-->BMW320");
        }
    }

    public static class BMW523 extends BMW {
        public BMW523() {
            System.out.println("制造-->BMW523");
        }
    }
}
