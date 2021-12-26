package question5;

import javax.swing.JOptionPane;
import java.util.Calendar;

public class DOBPicker {

    public static int Year() {

        boolean repeat;
        String b;
        int year = 0;
        int currentyear = Calendar.getInstance().get(Calendar.YEAR);
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
                if (year > currentyear) {
                    JOptionPane.showMessageDialog(null, "Selected Year Cannot Be Greater Than Current Year", "Error", JOptionPane.ERROR_MESSAGE);
                    repeat = true;
                }
                if (year < 1970) {
                    JOptionPane.showMessageDialog(null, "Selected Year Cannot Be Lesser Than The Year 1970", "Error", JOptionPane.ERROR_MESSAGE);
                    repeat = true;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please Input Numbers Only", "ERROR", JOptionPane.ERROR_MESSAGE);
                repeat = true;
            }
        } while (repeat
                == true);
        return year;
    }

    public static int Month() {

        int currentyear = Calendar.getInstance().get(Calendar.YEAR);
        int currentmonth = Calendar.getInstance().get(Calendar.MONTH);
        boolean repeat;
        String b;
        int year = Year();
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

                if (month > currentmonth && year == currentyear && month < 13) {
                    JOptionPane.showMessageDialog(null, "Selected Month Cannot Be Greater Than Current Month", "Error", JOptionPane.ERROR_MESSAGE);
                    repeat = true;
                }
                if (month > 12 && month > currentmonth) {
                    JOptionPane.showMessageDialog(null, "Selected Month Cannot Be Greater Than 12, Which Is December", "Error", JOptionPane.ERROR_MESSAGE);
                    repeat = true;
                }
                if (month <= 0) {
                    JOptionPane.showMessageDialog(null, "Selected Month Cannot Be Lesser Than 1, Which Is January", "Error", JOptionPane.ERROR_MESSAGE);
                    repeat = true;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please Input Numbers Only", "ERROR", JOptionPane.ERROR_MESSAGE);
                repeat = true;
            }
        } while (repeat
                == true);
        return month;
    }

    public static int Date() {

        int currentdate = Calendar.getInstance().get(Calendar.DATE);
        int currentmonth = Calendar.getInstance().get(Calendar.MONTH);
        int currentyear = Calendar.getInstance().get(Calendar.YEAR);
        boolean repeat;
        String b;
        int year = Year();
        int month = Month();
        int date = 0;
        int maxdate;
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

                for (int i = 1972; i < 2021; i += 4) {
                    if (year == i) {

                        for (int j = 1; j < 13; j += 2) {
                            if (month == j) {
                                maxdate = 31;
                                if (date > currentdate && month == currentmonth && year == currentyear && date < maxdate) {
                                    JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Greater Than Current Date", "Error", JOptionPane.ERROR_MESSAGE);
                                    repeat = true;
                                }
                                

                            }

                        }

                    }
                }

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
