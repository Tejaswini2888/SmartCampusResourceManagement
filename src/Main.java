
public class Main {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" SMART CAMPUS RESOURCE AND ENERGY MANAGEMENT");
        System.out.println("==============================================");

        // Create campus resources
        SmartClassroom classroom =
                new SmartClassroom("Smart Classroom", 12.5);

        ComputerLaboratory laboratory =
                new ComputerLaboratory(
                        "Computer Laboratory", 35.0, 8.0);

        EVChargingStation evStation =
                new EVChargingStation(
                        "EV Charging Station", 20.0, 10.0);

        SolarPowerUnit solarUnit =
                new SolarPowerUnit("Solar Power Unit", 50.0);

        // Smart Classroom
        System.out.println("\n--- SMART CLASSROOM ---");
        classroom.reportEnergy();
        System.out.printf(
                "Electricity cost: Rs. %.2f%n",
                12.5 * 8.0
        );
        classroom.turnOn();
        classroom.showStatus();
        classroom.turnOff();

        // Computer Laboratory
        System.out.println("\n--- COMPUTER LABORATORY ---");
        laboratory.reportEnergy();
        laboratory.displayCost();
        laboratory.turnOn();
        laboratory.showStatus();
        laboratory.turnOff();

        // EV Charging Station
        System.out.println("\n--- EV CHARGING STATION ---");
        evStation.reportEnergy();
        evStation.displayCost();
        evStation.turnOn();
        evStation.showStatus();
        evStation.turnOff();

        // Solar Power Unit
        System.out.println("\n--- SOLAR POWER UNIT ---");
        solarUnit.reportEnergy();
        solarUnit.reportEnergyGeneration();
        solarUnit.displaySavings(8.0);

        // Runtime Polymorphism
        System.out.println("\n--- RUNTIME POLYMORPHISM ---");

        EnergyMonitor[] resources = {
                classroom,
                laboratory,
                evStation,
                solarUnit
        };

        for (EnergyMonitor resource : resources) {
            resource.reportEnergy();
            System.out.println();
        }

        System.out.println(
                "System demonstration completed successfully."
        );
    }
}
