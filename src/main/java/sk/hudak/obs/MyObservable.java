package sk.hudak.obs;

import java.util.Observable;

public class MyObservable extends Observable {

    public void notify(Object event) {
        // nastavim ze nastala zmena
        setChanged();
        // notifigujem vsetkych zaregistrovanych pozorovatelov (observerov)
        notifyObservers(event);
    }
}
