
public class SmartClassroom implements EnergyMonitor, Controllable {

    private final String name;
    private final double energyConsumed;
    private boolean isOn;

    public SmartClassroom(String name, double energyConsumed) {
        this.name = name;
        this.energyConsumed = energyConsumed;
        this.isOn = false;
    }

    @Override
    public void reportEnergy() {
        System.out.println("Resource: " + name);
        System.out.println("Energy consumed: "
                + energyConsumed + " kWh");
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(name + " lights and AC switched ON.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(name + " lights and AC switched OFF.");
    }

    @Override
    public void showStatus() {
        EnergyMonitor.super.showStatus();
        System.out.println("Operational status: "
                + (isOn ? "ON" : "OFF"));
    }
}
