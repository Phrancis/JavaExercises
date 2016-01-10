package Chapter4;


public class VehicleDemo {

    public static void main (String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportsCar = new Vehicle();

        minivan.typeName = "Minivan";
        minivan.passengers = 7;
        minivan.fuelCapacity = 16;
        minivan.mpg = 21;
        sportsCar.typeName = "Sports car";
        sportsCar.passengers = 2;
        sportsCar.fuelCapacity = 14;
        sportsCar.mpg = 12;

        /**These were used to calculate the travel range:*/
        //int minivanRange = minivan.fuelCapacity * minivan.mpg;
        //int sportsCarRange = sportsCar.fuelCapacity * sportsCar.mpg;
        /**We replaced this calculation by a getRange() method in the class:*/
        int minivanRange = minivan.getRange();
        int sportsCarRange = sportsCar.getRange();

        System.out.format("%s can carry %d passengers for %d miles.%n",
                minivan.typeName, minivan.passengers, minivanRange);
        System.out.format("%s car can carry %d passengers for %d miles.%n",
                sportsCar.typeName, sportsCar.passengers, sportsCarRange);

        /**Test out `getFuelNeededForMiles()` method:*/
        int milesToTravel = 31;
        System.out.format("%s needs %f gal fuel to travel %d miles.%n",
                minivan.typeName, minivan.getFuelNeededForMiles(milesToTravel), milesToTravel);
        System.out.format("%s needs %f gal fuel to travel %d miles.%n",
                sportsCar.typeName, sportsCar.getFuelNeededForMiles(milesToTravel), milesToTravel);
    }
}
