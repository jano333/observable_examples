package sk.hudak.obs;

import sk.hudak.obs.events.MyEvent;
import sk.hudak.obs.events.YourEvent;
import sk.hudak.obs.observers.MyObserver;
import sk.hudak.obs.observers.YourObserver;

public class MainExample {

    // https://www.concretepage.com/java/example-observer-observable-java

    public static void main(String[] args) {

        // vytvorim si instanciu ktora drzi info
        MyObservable observable = new MyObservable();

        // zaregistrujem 2 porozorvatelov(listenerov)
        observable.addObserver(new MyObserver());
        observable.addObserver(new YourObserver());

        // vygenerujem 'MyEvent' event a notifihujem
        observable.notify(new MyEvent("my udalost"));

        // vygenerujem 'YourEvent' event
        observable.notify(new YourEvent("your udalost"));
    }

}
