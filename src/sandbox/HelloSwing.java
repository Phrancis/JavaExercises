package sandbox;

import javax.swing.*;

public class HelloSwing extends JFrame {

    public HelloSwing() {
        setTitle("Hello, Swing!");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        HelloSwing ex = new HelloSwing();
        ex.setVisible(true);
    }
}