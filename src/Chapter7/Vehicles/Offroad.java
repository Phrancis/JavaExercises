package Chapter7.Vehicles;

/**
 * Created by francisveilleux-gaboury on 4/2/16.
 */
public class Offroad extends Truck {
    double groundClearance;

    Offroad() {
        super();
        groundClearance = 0;
    };
    Offroad(int passengers, double fuelCapacity, double mpg, double cargoCapacity, double groundClearance) {
        super(passengers, fuelCapacity, mpg, cargoCapacity);
        this.groundClearance = groundClearance;
    }

    public double getGroundClearance() {
        return groundClearance;
    }

    public void setGroundClearance(double groundClearance) {
        this.groundClearance = groundClearance;
    }
    // DEMO
    public static void main(String[] args) {
        double range = 10.0;

        Offroad jeep = new Offroad();
        jeep.setPassengers(2);
        jeep.setFuelCapacity(10);
        jeep.setMpg(18);
        jeep.setCargoCapacity(1000);
        jeep.setGroundClearance(2.0);
        jeep.loadCargo(200);
        System.out.println("Info about jeep:");
        System.out.print(jeep.toString());
        System.out.printf("Range: %f miles%n", jeep.getRange());
        System.out.printf("Fuel needed for %f miles: %f gals.%n", range, jeep.fuelNeeded(range));
        System.out.println("-----");

        Offroad buggy = new Offroad(1, 6, 27, 50, 1.2);
        buggy.loadCargo(20);
        System.out.println("Info about buggy:");
        System.out.print(buggy.toString());
        System.out.printf("Range: %f miles%n", buggy.getRange());
        System.out.printf("Fuel needed for %f miles: %f gals.%n", range, buggy.fuelNeeded(range));
    }
}
