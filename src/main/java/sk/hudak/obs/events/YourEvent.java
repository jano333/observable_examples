package sk.hudak.obs.events;

public class YourEvent {

    private String text;

    public YourEvent(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "YourEvent{" +
                "text='" + text + '\'' +
                '}';
    }
}
