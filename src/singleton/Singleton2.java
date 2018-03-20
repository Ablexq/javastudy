package singleton;

/**
 * 懒汉式单例
 */
public class Singleton2 {

    private Singleton2() {
    }

    private static Singleton2 single = null;

    //静态工厂方法，加同步synchronized
    //在方法调用上加了同步，虽然线程安全了，但是每次都要同步，会影响性能，毕竟99%的情况下是不需要同步的
    public static synchronized Singleton2 getInstance() {
        if (single == null) {
            single = new Singleton2();
        }
        return single;
    }
}
