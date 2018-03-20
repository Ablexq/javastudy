package factory;

/**
 * http://blog.csdn.net/jason0539/article/details/23020989
 */
public class Customer1 {
    public static void main(String[] args) {
        BMW320 bmw320 = new BMW320();
        BMW523 bmw523 = new BMW523();
    }

    public static class BMW320 {
        public BMW320() {
            System.out.println("制造-->BMW320");
        }
    }

    public static class BMW523 {
        public BMW523() {
            System.out.println("制造-->BMW523");
        }
    }
}
