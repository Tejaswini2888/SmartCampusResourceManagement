
public interface EnergyMonitor {

    void reportEnergy();

    default void showStatus() {
        System.out.println("Energy monitoring is active.");
    }
}
