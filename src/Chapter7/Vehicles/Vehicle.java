package Chapter7.Vehicles;

/**
 * Try this 7-1: Extending the Vehicle class (from Chapter4)
 */
public abstract class Vehicle {
    private int passengers;
    private double fuelCapacity;
    private double mpg;

    /**
     * Constructs a vehicle with no arguments.
     */
    Vehicle() {
        passengers = 0;
        fuelCapacity = 0;
        mpg = 0;
    }

    /**
     * Constructs a vehicle.
     * @param passengers number of allowed passengers
     * @param fuelCapacity maximum amount (in gallons) the vehicle can hold in its fuel tank
     * @param mpg number of miles the vehicle can travel per gallon of fuel
     */
    Vehicle(int passengers, double fuelCapacity, double mpg) {
        this.passengers = passengers;
        this.fuelCapacity = fuelCapacity;
        this.mpg = mpg;
    }

    /**
     * Calculate the maximum range (in miles) the vehicle can travel.
     * @return the number of miles the vehicle can travel with a full fuel tank
     */
    double getRange() {
        return fuelCapacity * mpg;
    }

    /**
     * Calculate the amount of fuel needed (in gallons) to travel a distance (in miles)
     * @param miles the distance
     * @return the amount of fuel needed (in gallons)
     */
    double fuelNeeded(double miles) {
        return mpg / miles;
    }

    // Accessor methods:
    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }
}
