
public class EVChargingStation implements
        EnergyMonitor, Controllable, CostCalculable {

    private final String name;
    private final double energyConsumed;
    private final double tariff;
    private boolean isOn;

    public EVChargingStation(
            String name,
            double energyConsumed,
            double tariff) {

        this.name = name;
        this.energyConsumed = energyConsumed;
        this.tariff = tariff;
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
        System.out.println(name + " switched ON.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(name + " switched OFF.");
    }

    @Override
    public void showStatus() {
        EnergyMonitor.super.showStatus();
        System.out.println("Operational status: "
                + (isOn ? "ON" : "OFF"));
    }

    @Override
    public double calculateCost(
            double energyConsumed,
            double tariff) {

        return energyConsumed * tariff;
    }

    public void displayCost() {
        System.out.printf(
                "Electricity cost: ₹%.2f%n",
                calculateCost(energyConsumed, tariff)
        );
    }
}

