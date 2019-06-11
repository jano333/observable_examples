package sk.hudak.obs.events;

public class MyEvent {

    private String text;

    public MyEvent(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "MyEvent{" +
                "text='" + text + '\'' +
                '}';
    }
}
