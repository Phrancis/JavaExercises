package Vehicle;

public abstract class Bicycle implements Vehicle {
	
	Terrain terrainRoad = Terrain.ROAD;
	Terrain terrainOffroad = Terrain.OFFROAD;
	
	public abstract int gears();	
	public abstract boolean reversible();
	public abstract double maximumSpeedKM();
	public abstract double weightInKG();
	public abstract int occupants();
	
}