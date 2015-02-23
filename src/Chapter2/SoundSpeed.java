package Chapter2;

public class SoundSpeed {
	
	private final double SOUND_TRAVEL_SPEED = 1100;
	public double timeInSeconds;
	public boolean isEcho;
	private int distanceDivisor;

	public double getResult() {
		if(isEcho) {
			distanceDivisor = 2;
		} else {
			distanceDivisor = 1;
		}
		return (timeInSeconds * SOUND_TRAVEL_SPEED) / distanceDivisor;
	}
	/*
	public SoundSpeed (double timeInSeconds, boolean isEcho) {
		this.timeInSeconds = timeInSeconds;
		this.isEcho = isEcho;
	}
	*/
}