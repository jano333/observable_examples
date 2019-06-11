package sk.hudak.obs.observers;

import sk.hudak.obs.events.YourEvent;

import java.util.Observable;
import java.util.Observer;

public class YourObserver implements Observer {

    @Override
    public void update(Observable o, Object event) {

        // tu reagujem len na jednu event

        if (event instanceof YourEvent) {
            YourEvent yourEvent = (YourEvent) event;
            System.out.println("YourObserver reagujeme na udalost " + yourEvent);
        }

    }
}
