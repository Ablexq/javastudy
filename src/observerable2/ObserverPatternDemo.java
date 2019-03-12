package observerable2;

import observerable2.observer.BinaryObserver;
import observerable2.observer.HexaObserver;
import observerable2.observer.OctalObserver;
import observerable2.observerable.Observerable;

/*
*
* 观察者模式
* http://www.runoob.com/design-pattern/observer-pattern.html
* */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Observerable observerable = new Observerable();

        new HexaObserver(observerable);
        new OctalObserver(observerable);
        new BinaryObserver(observerable);

        System.out.println("First state change: 15");
        observerable.setState(15);
        System.out.println("Second state change: 10");
        observerable.setState(10);
    }
}
