package chapter11.ThreadCommunication;

/**
 * Possible states of a clock
 */
class ClockState {

    String state;

    enum State {
        TICK("Tick"),
        TOCK("Tock");

        private String state;

        State(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }
}
