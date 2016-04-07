package chapter04;


public class VehicleDemo {

    public static void main (String[] args) {

        /**These were used to instantiante the vehicles:*/
//        Vehicle minivan = new Vehicle();
//        minivan.typeName = "Minivan";
//        minivan.passengers = 7;
//        minivan.fuelCapacity = 16;
//        minivan.mpg = 21;
//        Vehicle sportsCar = new Vehicle();
//        sportsCar.typeName = "Sports car";
//        sportsCar.passengers = 2;
//        sportsCar.fuelCapacity = 14;
//        sportsCar.mpg = 12;
        /**We simplified and improved by writing a constructor to the Vehicle class:*/
        Vehicle minivan = new Vehicle("Minivan", 7, 16, 21);
        Vehicle sportsCar = new Vehicle("Sports car", 2, 14, 12);

        /**These were used to calculate the travel range:*/
//        int minivanRange = minivan.fuelCapacity * minivan.mpg;
//        int sportsCarRange = sportsCar.fuelCapacity * sportsCar.mpg;
        /**We replaced this calculation by a getRange() method in the class:*/
        int minivanRange = minivan.getRange();
        int sportsCarRange = sportsCar.getRange();

        System.out.format("%s can carry %d passengers for %d miles.%n",
                minivan.typeName, minivan.passengers, minivanRange);
        System.out.format("%s car can carry %d passengers for %d miles.%n",
                sportsCar.typeName, sportsCar.passengers, sportsCarRange);

        /**Test out `getFuelNeededForDistance()` method:*/
        int milesToTravel = 31;
        System.out.format("%s needs %f gal fuel to travel %d miles.%n",
                minivan.typeName, minivan.getFuelNeededForDistance(milesToTravel), milesToTravel);
        System.out.format("%s needs %f gal fuel to travel %d miles.%n",
                sportsCar.typeName, sportsCar.getFuelNeededForDistance(milesToTravel), milesToTravel);
    }
}
