package sk.hudak.obs.observers;

import sk.hudak.obs.events.MyEvent;
import sk.hudak.obs.events.YourEvent;

import java.util.Observable;
import java.util.Observer;

public class MyObserver implements Observer {

    @Override
    public void update(Observable o, Object event) {

        // tu reagujem na obe oventy

        if (event instanceof MyEvent) {
            MyEvent myEvent = (MyEvent) event;
            System.out.println("MyObserver reagujeme na udalost " + myEvent);
        }

        if (event instanceof YourEvent) {
            YourEvent yourEvent = (YourEvent) event;
            System.out.println("MyObserver reagujeme na udalost " + yourEvent);
        }

    }
}
