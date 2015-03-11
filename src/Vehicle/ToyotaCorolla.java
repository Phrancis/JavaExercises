package Vehicle;

public class ToyotaCorolla extends Car {
	
	Terrain terrain = Terrain.ROAD;
    
    @Override
    public int gears() {return 5;}
    
    @Override
    public boolean reversible() {return true;}

	@Override
    public double maximumSpeedKM() {return 140;}

	@Override
	public double weightInKG() {return 2000;}

	@Override
	public int occupants() {return 4;}	
}