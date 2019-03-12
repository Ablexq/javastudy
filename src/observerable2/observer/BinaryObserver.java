package observerable2.observer;

import observerable2.observerable.Observerable;

public class BinaryObserver extends Observer{

    public BinaryObserver(Observerable observerable){
        this.observerable = observerable;
        this.observerable.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( observerable.getState() ) );
    }
}