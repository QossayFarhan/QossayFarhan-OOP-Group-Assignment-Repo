package question5;

import javax.swing.JOptionPane;

public class DOBPicker {

    public static int Year() {

        boolean repeat;
        String b;
        int year = 0;
        do {
            do {
                repeat = false;
                b = JOptionPane.showInputDialog(null, "Please Input Year Of Birth In Numbers", "Input", JOptionPane.QUESTION_MESSAGE);
                if (b == null) {
                    int a02 = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Exit?", "Error", JOptionPane.YES_NO_OPTION);
                    if (a02 == 0) {
                        System.exit(0);
                    } else {
                        repeat = true;
                    }
                }

            } while (repeat == true);

            try {
                year = Integer.parseInt(b);
                repeat = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please Input Numbers Only", "ERROR", JOptionPane.ERROR_MESSAGE);
                repeat = true;
            }
        } while (repeat
                == true);
        return year;
    }

    public static int Month() {

        boolean repeat;
        String b;
        int month = 0;
        do {
            do {
                repeat = false;
                b = JOptionPane.showInputDialog(null, "Please Input Month Of Birth In Numbers", "Input", JOptionPane.QUESTION_MESSAGE);
                if (b == null) {
                    int a02 = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Exit?", "Error", JOptionPane.YES_NO_OPTION);
                    if (a02 == 0) {
                        System.exit(0);
                    } else {
                        repeat = true;
                    }
                }

            } while (repeat == true);

            try {
                month = Integer.parseInt(b);
                repeat = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please Input Numbers Only", "ERROR", JOptionPane.ERROR_MESSAGE);
                repeat = true;
            }
        } while (repeat
                == true);
        return month;
    }

    public static int Date() {

        boolean repeat;
        String b;
        int date = 0;
        do {
            do {
                repeat = false;
                b = JOptionPane.showInputDialog(null, "Please Input Date Of Birth In Numbers", "Input", JOptionPane.QUESTION_MESSAGE);
                if (b == null) {
                    int a02 = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Exit?", "Error", JOptionPane.YES_NO_OPTION);
                    if (a02 == 0) {
                        System.exit(0);
                    } else {
                        repeat = true;
                    }
                }

            } while (repeat == true);

            try {
                date = Integer.parseInt(b);
                repeat = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please Input Numbers Only", "ERROR", JOptionPane.ERROR_MESSAGE);
                repeat = true;
            }
        } while (repeat
                == true);
        return date;
    }

    public static String DOB() {
        int year = DOBPicker.Year();
        int month = DOBPicker.Month();
        int date = DOBPicker.Date();
        String DOB = String.format("%02d", date) + "/" + String.format("%02d", month) + "/" + String.format("%4d", year);
        return DOB;
    }
}
