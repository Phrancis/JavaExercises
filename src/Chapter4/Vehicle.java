package Chapter4;


public class Vehicle {
    String typeName;
    int passengers;
    int fuelCapacity;
    int mpg;

    Vehicle (String typeName, int passengers, int fuelCapacity, int mpg) {
        this.typeName = typeName;
        this.passengers = passengers;
        this.fuelCapacity = fuelCapacity;
        this.mpg = mpg;
    }

    int getRange() {
        return fuelCapacity * mpg;
    }

    double getFuelNeededForDistance(int miles) {
        return (double) miles / mpg;
    }

}
