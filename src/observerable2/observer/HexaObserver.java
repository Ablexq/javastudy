package observerable2.observer;

import observerable2.observerable.Observerable;

public class HexaObserver extends Observer{

    public HexaObserver(Observerable observerable){
        this.observerable = observerable;
        this.observerable.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString( observerable.getState() ).toUpperCase() );
    }
}