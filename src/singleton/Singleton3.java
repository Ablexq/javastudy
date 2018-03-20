package singleton;

/**
 * 懒汉式单例
 */
public class Singleton3 {

    private Singleton3() {
    }

    private static Singleton3 single = null;

    //双重检查锁定
    //在getInstance中做了两次null检查，确保了只有第一次调用单例的时候才会做同步，
    // 这样也是线程安全的，同时避免了每次都同步的性能损耗
    public static Singleton3 getInstance() {
        if (single == null) {
            synchronized (Singleton3.class) {
                if (single == null) {
                    single = new Singleton3();
                }
            }
        }
        return single;
    }
}
