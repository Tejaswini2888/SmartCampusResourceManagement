
public interface Controllable {

    void turnOn();

    void turnOff();

    default void showStatus() {
        System.out.println("Resource operational control is available.");
    }
}
