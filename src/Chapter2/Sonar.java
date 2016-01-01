/*
** Credits: @200_success on Code Review
** http://codereview.stackexchange.com/a/82333/42632
** As an answer to my question.
*/
package Chapter2;

public class Sonar {
    public enum Medium {
        // Values are approximate.
        AIR_SEA_LEVEL_15C (340.0),
        AIR_JET_ALTITUDE_N57C (295.0),
        FRESH_WATER_25C (1497.0),
        SEA_WATER (1500.0);

        private final double meterPerSec;

        Medium(double meterPerSec) {
            this.meterPerSec = meterPerSec;
        }
    }

    private final Medium medium;
    private final boolean isEcho;

    public Sonar(Medium medium, boolean isEcho) {
        this.medium = medium;
        this.isEcho = isEcho;
    }

    public double distance(double seconds) {
        return medium.meterPerSec * seconds / (isEcho ? 2 : 1);
    }

    public static void main(String[] args) {
        double seconds = 35.079;
        boolean isEcho = true;

        Sonar sonar1 = new Sonar(Sonar.Medium.AIR_SEA_LEVEL_15C, isEcho);
        String verb1 = isEcho ? "echo" : "travel";
        System.out.format("The sound took %s seconds to %s and thus the distance is %s meters.%n",
                seconds, verb1, sonar1.distance(seconds));

        Sonar sonar2 = new Sonar(Sonar.Medium.FRESH_WATER_25C, isEcho);
        String verb2 = isEcho ? "echo" : "travel";
        System.out.format("The sound took %s seconds to %s and thus the distance is %s meters.%n",
                seconds, verb2, sonar2.distance(seconds));
    }
}

