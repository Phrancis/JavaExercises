package Chapter4;


public class Vehicle {
    String typeName;
    int passengers;
    int fuelCapacity;
    int mpg;

    int getRange() {
        return fuelCapacity * mpg;
    }

    double getFuelNeededForMiles(int miles) {
        return (double) miles / mpg;
    }

}
