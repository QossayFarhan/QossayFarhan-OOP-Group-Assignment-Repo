package question5;

import java.util.Calendar;
import javax.swing.JOptionPane;

public class Question5 {

    public static void main(String[] args) {
        boolean repeat;
        String name;
        String b;
        String Zodiac="";
        int year = 0;
        int leapyear = 0;
        int currentyear = Calendar.getInstance().get(Calendar.YEAR);
        int currentmonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int currentdate = Calendar.getInstance().get(Calendar.DATE);
        int date = 0;
        int maxdate;
        int month = 0;
        do {
            repeat = false;
            name = JOptionPane.showInputDialog(null, "Please Input Your First Name", "Input", JOptionPane.QUESTION_MESSAGE);
            if (!name.matches("^[a-zA-Z]*$")) {

                JOptionPane.showMessageDialog(null, "Please Input Characters Only", "Error", JOptionPane.ERROR_MESSAGE);
                repeat = true;
            }
        } while (repeat == true);

        String HonorName = Honorific.Desig();

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

                if (year == 1972 || year == 1976 || year == 1980 || year == 1984 || year == 1988 || year == 1992 || year == 1996 || year == 2000 || year == 2004
                        || year == 2008 || year == 2012 || year == 2016 || year == 2020) {

                    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                        maxdate = 31;
                        if (date > currentdate && month == currentmonth && year == currentyear && date < maxdate) {
                            JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Greater Than Current Date", "Error", JOptionPane.ERROR_MESSAGE);
                            repeat = true;
                        }
                        if (date > maxdate) {
                            JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Greater Than " + maxdate + " , As The" + month + "th Month Only Has " + maxdate + "-Days", "Error", JOptionPane.ERROR_MESSAGE);
                            repeat = true;
                        }
                        if (date < 1) {
                            JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Zero or Negative", "Error", JOptionPane.ERROR_MESSAGE);
                            repeat = true;
                        }
                    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                        maxdate = 30;
                        if (date > currentdate && month == currentmonth && year == currentyear && date < maxdate) {
                            JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Greater Than Current Date", "Error", JOptionPane.ERROR_MESSAGE);
                            repeat = true;
                        }
                        if (date > maxdate) {
                            JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Greater Than " + maxdate + " , As The" + month + "th Month Only Has " + maxdate + "-Days", "Error", JOptionPane.ERROR_MESSAGE);
                            repeat = true;
                        }
                        if (date < 1) {
                            JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Zero or Negative", "Error", JOptionPane.ERROR_MESSAGE);
                            repeat = true;
                        }
                    } else if (month == 2) {
                        maxdate = 29;
                        if (date > currentdate && month == currentmonth && year == currentyear && date < maxdate) {
                            JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Greater Than Current Date", "Error", JOptionPane.ERROR_MESSAGE);
                            repeat = true;
                        }
                        if (date > maxdate) {
                            JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Greater Than " + maxdate + ", As The " + month + "th Month On The Year "
                                    + year + " Only Has " + maxdate + "-Days", "Error", JOptionPane.ERROR_MESSAGE);
                            repeat = true;
                        }
                        if (date < 1) {
                            JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Zero or Negative", "Error", JOptionPane.ERROR_MESSAGE);
                            repeat = true;
                        }

                    }

                } else if (year != 1972 || year != 1976 || year != 1980 || year != 1984 || year != 1988 || year != 1992 || year != 1996 || year != 2000 || year != 2004
                        || year != 2008 || year != 2012 || year != 2016 || year != 2020) {

                    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                        maxdate = 31;
                        if (date > currentdate && month == currentmonth && year == currentyear && date < maxdate) {
                            JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Greater Than Current Date", "Error", JOptionPane.ERROR_MESSAGE);
                            repeat = true;
                        }
                        if (date > maxdate) {
                            JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Greater Than " + maxdate + " , As The" + month + "th Month Only Has " + maxdate + "-Days", "Error", JOptionPane.ERROR_MESSAGE);
                            repeat = true;
                        }
                        if (date < 1) {
                            JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Zero or Negative", "Error", JOptionPane.ERROR_MESSAGE);
                            repeat = true;
                        }
                    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                        maxdate = 30;
                        if (date > currentdate && month == currentmonth && year == currentyear && date < maxdate) {
                            JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Greater Than Current Date", "Error", JOptionPane.ERROR_MESSAGE);
                            repeat = true;
                        }
                        if (date > maxdate) {
                            JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Greater Than " + maxdate + " , As The" + month + "th Month Only Has " + maxdate + "-Days", "Error", JOptionPane.ERROR_MESSAGE);
                            repeat = true;
                        }
                        if (date < 1) {
                            JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Zero or Negative", "Error", JOptionPane.ERROR_MESSAGE);
                            repeat = true;
                        }
                    } else if (month == 2) {
                        maxdate = 28;
                        if (date > currentdate && month == currentmonth && year == currentyear && date < maxdate) {
                            JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Greater Than Current Date", "Error", JOptionPane.ERROR_MESSAGE);
                            repeat = true;
                        }
                        if (date > maxdate) {
                            JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Greater Than " + maxdate + ", As The " + month + "th Month On The Year "
                                    + year + " Only Has " + maxdate + "-Days", "Error", JOptionPane.ERROR_MESSAGE);
                            repeat = true;
                        }
                        if (date < 1) {
                            JOptionPane.showMessageDialog(null, "Selected Date Cannot Be Zero or Negative", "Error", JOptionPane.ERROR_MESSAGE);
                            repeat = true;
                        }

                    }

                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please Input Numbers Only", "ERROR", JOptionPane.ERROR_MESSAGE);
                repeat = true;
            }
        } while (repeat
                == true);

        if ((month == 3 && date >= 21) || (month == 4 && date <= 20)){
            Zodiac = "Aries";
        }
        if ((month == 4 && date >= 21) || (month == 5 && date <= 21)){
            Zodiac = "Taurus";
        }
        if ((month == 5 && date >= 22) || (month == 6 && date <= 21)){
            Zodiac = "Gemini";
        }
        if ((month == 6 && date >= 22) || (month == 7 && date <= 22)){
            Zodiac = "Cancer";
        }
        if ((month == 7 && date >= 23) || (month == 8 && date <= 22)){
            Zodiac = "Leo";
        }
        if ((month == 8 && date >= 23) || (month == 9 && date <= 22)){
            Zodiac = "Virgo";
        }
        if ((month == 9 && date >= 23) || (month == 10 && date <= 22)){
            Zodiac = "Libra";
        }
        if ((month == 10 && date >= 23) || (month == 11 && date <= 21)){
            Zodiac = "Scorpio";
        }
        if ((month == 11 && date >= 22) || (month == 12 && date <= 21)){
            Zodiac = "Sagittarius";
        }
        if ((month == 12 && date >= 22) || (month == 1 && date <= 20)){
            Zodiac = "Capricorn";
        }
        if ((month == 1 && date >= 21) || (month == 2 && date <= 19)){
            Zodiac = "Aquarius";
        }
        if ((month == 2 && date >= 20) || (month == 3 && date <= 20)){
            Zodiac = "Pisces";
        }
        System.out.println(Zodiac);
    }

}
