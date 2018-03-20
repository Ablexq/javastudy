package singleton;

/**
 * 饿汉式单例类.在类初始化时，已经自行实例化
 *
 * 饿汉式在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以天生是线程安全的。
 */
public class Singleton5 {

    private Singleton5() {
    }

    private static final Singleton5 single = new Singleton5();

    //静态工厂方法
    public static Singleton5 getInstance() {
        return single;
    }
}