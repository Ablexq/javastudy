package observerable2.observer;

import observerable2.observerable.Observerable;

public abstract class Observer {
    protected Observerable observerable;
    public abstract void update();
}
