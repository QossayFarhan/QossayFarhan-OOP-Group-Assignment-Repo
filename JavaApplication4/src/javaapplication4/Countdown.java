package javaapplication4;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

public class Countdown {

    public static void main(String[] args) {
        int i;
        for (i = 0; i <= 1800; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            System.out.println(i);
            if (i == 1800) {
                Runtime runtime = Runtime.getRuntime();
                JOptionPane.showMessageDialog(null, "!GoodBye!", "Warning", JOptionPane.WARNING_MESSAGE);
                try {
                    System.out.println("!Thank You!");
                    runtime.exec("shutdown -s -t 5");
                } catch (IOException e) {
                    System.out.println("Exception: " + e);
                }

            }

        }
    }
}
