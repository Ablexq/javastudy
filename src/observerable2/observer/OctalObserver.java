package observerable2.observer;

import observerable2.observerable.Observerable;

public class OctalObserver extends Observer{

    public OctalObserver(Observerable observerable){
        this.observerable = observerable;
        this.observerable.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( observerable.getState() ) );
    }
}