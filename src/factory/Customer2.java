package factory;

/**
 * http://blog.csdn.net/jason0539/article/details/23020989
 * 简单工厂模式：
 * 把创建宝马的操作细节都放到了工厂里面去,客户直接使用工厂的创建工厂方法,
 * 传入想要的宝马车型号就行了,而不必去知道创建的细节
 * 客户类：
 */
public class Customer2 {
    public static void main(String[] args) {
        Factory factory = new Factory();
        BMW bmw320 = factory.createBMW(320);
        BMW bmw523 = factory.createBMW(523);
    }

    //----------------工厂类：-----------------------
    public static class Factory {
        public BMW createBMW(int type) {
            switch (type) {
                case 320:
                    return new BMW320();

                case 523:
                    return new BMW523();

                default:
                    break;
            }
            return null;
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
