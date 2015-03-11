package Vehicle;

public class BMX extends Bicycle {

	@Override
	public int gears() {
		return 1;
	}

	@Override
	public boolean reversible() {
		return true;
	}

	@Override
	public double maximumSpeedKM() {
		return 100;
	}

	@Override
	public double weightInKG() {
		return 11;
	}

	@Override
	public int occupants() {
		return 1;
	}
	
}