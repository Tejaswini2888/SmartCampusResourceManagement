
public interface RenewableEnergy {

    void reportEnergyGeneration();

    double calculateSavings(double energyGenerated, double avoidedCost);
}
