/*
** Credits: @200_success on Code Review
** http://codereview.stackexchange.com/a/82333/42632
** As an answer to my question about SoundSpeed and SoundSpeedCalc classes
*/
package Chapter2;

public class Sonar {
    public enum Medium {
        AIR(1100);

        private final double ftPerSec;

        Medium(double ftPerSec) {
            this.ftPerSec = ftPerSec;
        }
    }

    private final Medium medium;
    private final boolean isEcho;

    public Sonar(Medium medium, boolean isEcho) {
        this.medium = medium;
        this.isEcho = isEcho;
    }

    public double distance(double seconds) {
        return medium.ftPerSec * seconds / (isEcho ? 2 : 1);
    }

    public static void main(String[] args) {
        double seconds = 35.079;
        boolean isEcho = true;

        Sonar sonar = new Sonar(Sonar.Medium.AIR, isEcho);
        String verb = isEcho ? "echo" : "travel";
        System.out.printf("The sound took %s seconds to %s and thus the distance is %s feet.\n",
                          seconds, verb, sonar.distance(seconds));
    }
}

