package singleton;

/**
 * 懒汉式单例
 * 静态内部类：既实现了线程安全，又避免了同步带来的性能影响。
 */
public class Singleton4 {

    private static class LazyHolder {
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    private Singleton4() {
    }

    //利用了classloader的机制来保证初始化instance时只有一个线程，
    // 所以也是线程安全的，同时没有性能损耗，所以推荐使用这一种。
    public static final Singleton4 getInstance() {
        return LazyHolder.INSTANCE;
    }
}
