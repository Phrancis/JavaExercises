package Chapter7.Vehicles;

/**
 * Truck vehicle type.
 */
public class Truck extends Vehicle {
    private double cargoCapacity;
    private double actualCargo = 0;
    /**
     * Contructs a truck with no arguments.
     */
    Truck() {
        super();
        cargoCapacity = 0;
    }

    /**
     * Constructs a truck.
     * @param passengers number of allowed passengers
     * @param fuelCapacity maximum amount (in gallons) the truck can hold in its fuel tank
     * @param mpg number of miles the truck can travel per gallon of fuel
     * @param cargoCapacity the amount of cargo the truck can carry (in pounds)
     */
    Truck(int passengers, double fuelCapacity, double mpg, double cargoCapacity) {
        super(passengers, fuelCapacity, mpg);
        this.cargoCapacity = cargoCapacity;
    }
    @Override
    public String toString() {
        return String.format(
                "Passengers: %d%n"+
                "Fuel capacity: %f gals.%n" +
                "MPG: %f%n" +
                "Cargo capacity: %f lbs.%n" +
                "Current cargo: %f lbs.%n",
                getPassengers(),
                getFuelCapacity(),
                getMpg(),
                getCargoCapacity(),
                getActualCargo()
        );
    }

    /**
     * Get the actual cargo of the truck (in lbs.)
     * @return the actual cargo
     */
    double getActualCargo() {
        return actualCargo;
    }

    /**
     * Load additional weight (in lbs.) into cargo if the truck has not reached cargo capacity.
     * @param weight the weight (in lbs.) of cargo to load.
     */
    void loadCargo(double weight) {
        if(actualCargo + weight > cargoCapacity) {
            System.out.printf("Cannot load additional cargo of %f lbs. as it would exceed the capacity of %f lbs.", weight, cargoCapacity);
        }
        actualCargo += weight;
    }

    /**
     * Unloads some cargo (in lbs.) from the truck.
     * @param weight the amount of cargo (in lbs.) to unload
     */
    void unloadCargo(double weight) {
        if(actualCargo - weight < 0) {
            actualCargo = 0;
        }
        actualCargo -= weight;
    }
    // Accessors
    double getCargoCapacity() {
        return cargoCapacity;
    }
    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
    // DEMO
    public static void main(String[] args) {
        double range = 10;

        Truck mailDelivery = new Truck();
        mailDelivery.setPassengers(1);
        mailDelivery.setFuelCapacity(20);
        mailDelivery.setMpg(22);
        mailDelivery.setCargoCapacity(500);
        mailDelivery.loadCargo(125.75);
        System.out.println("Info about mail delivery truck:");
        System.out.print(mailDelivery.toString());
        System.out.printf("Range: %f miles%n", mailDelivery.getRange());
        System.out.printf("Fuel needed for %f miles: %f gals.%n", range, mailDelivery.fuelNeeded(range));
        System.out.println("-----");

        Truck pickup = new Truck(3, 28, 15, 2000);
        pickup.loadCargo(1500);
        System.out.println("Info about pickup:");
        System.out.print(pickup.toString());
        System.out.printf("Range: %f miles%n", pickup.getRange());
        System.out.printf("Fuel needed for %f miles: %f gals.%n", range, pickup.fuelNeeded(range));
        System.out.println("-----");

        Truck semi = new Truck(2, 200, 7, 44000);
        semi.loadCargo(20000);
        System.out.println("Info about semi:");
        System.out.print(semi.toString());
        System.out.printf("Range: %f miles%n", semi.getRange());
        System.out.printf("Fuel needed for %f miles: %f gals.%n", range, semi.fuelNeeded(range));
        semi.unloadCargo(4500);
        System.out.printf("After unloading %f lbs. of cargo: %f%n", 4500.0, semi.getActualCargo());

    }

}
