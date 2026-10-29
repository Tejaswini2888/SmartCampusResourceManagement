
public class SolarPowerUnit implements
        EnergyMonitor, RenewableEnergy {

    private final String name;
    private final double energyGenerated;

    public SolarPowerUnit(
            String name,
            double energyGenerated) {

        this.name = name;
        this.energyGenerated = energyGenerated;
    }

    @Override
    public void reportEnergy() {
        System.out.println("Resource: " + name);
        System.out.println("Energy generated: "
                + energyGenerated + " kWh");
    }

    @Override
    public void reportEnergyGeneration() {
        System.out.println("Renewable energy generation report:");
        System.out.println("Solar power generated: "
                + energyGenerated + " kWh");
    }

    @Override
    public double calculateSavings(
            double energyGenerated,
            double avoidedCost) {

        return energyGenerated * avoidedCost;
    }

    public void displaySavings(double avoidedCost) {
        System.out.printf(
                "Electricity cost savings: ₹%.2f%n",
                calculateSavings(energyGenerated, avoidedCost)
        );
    }
}

