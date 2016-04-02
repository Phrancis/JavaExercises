package Chapter7.Vehicles;

/**
 * Offroad truck type.
 */
public class Offroad extends Truck {
    double groundClearance;

    /**
     * Constructs an offroad vehicle with no arguments.
     */
    Offroad() {
        super();
        groundClearance = 0;
    }

    /**
     * Constructs an offroad vehicle.
     * @param passengers number of allowed passengers
     * @param fuelCapacity maximum amount (in gallons) the offroad can hold in its fuel tank
     * @param mpg number of miles the offroad can travel per gallon of fuel
     * @param cargoCapacity the amount of cargo the offroad can carry (in pounds)
     * @param groundClearance the ground clearance (in inches) of the offroad
     */
    Offroad(int passengers, double fuelCapacity, double mpg, double cargoCapacity, double groundClearance) {
        super(passengers, fuelCapacity, mpg, cargoCapacity);
        this.groundClearance = groundClearance;
    }
    @Override
    public String toString() {
        return String.format("%sGround clearance: %f inches%n", super.toString(), groundClearance);
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
        jeep.setGroundClearance(24);
        jeep.loadCargo(200);
        System.out.println("Info about jeep:");
        System.out.print(jeep.toString());
        System.out.printf("Range: %f miles%n", jeep.getRange());
        System.out.printf("Fuel needed for %f miles: %f gals.%n", range, jeep.fuelNeeded(range));
        System.out.println("-----");

        Offroad buggy = new Offroad(1, 6, 27, 50, 14);
        buggy.loadCargo(20);
        System.out.printf("Clearance: %f inches%n", buggy.getGroundClearance());
        System.out.println("Info about buggy:");
        System.out.print(buggy.toString());
        System.out.printf("Range: %f miles%n", buggy.getRange());
        System.out.printf("Fuel needed for %f miles: %f gals.%n", range, buggy.fuelNeeded(range));
    }
}
