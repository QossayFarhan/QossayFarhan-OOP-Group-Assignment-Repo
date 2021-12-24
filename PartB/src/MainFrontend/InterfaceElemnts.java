package MainFrontend;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class InterfaceElemnts {
    boolean repeat;
    String input;
    
    // this function creats a drop down menue to choose position 
    public static String Desig() {
        JComboBox Job = new JComboBox();
        Job.addItem("Manager");
        Job.addItem("Assistant Manager");
        Job.addItem("Supervisor");
        Job.addItem("Executive");
        Job.addItem("Promoters");
        Job.addItem("Telemarketers");
        JOptionPane.showMessageDialog(null, Job, "Job Designation", JOptionPane.QUESTION_MESSAGE);
        String JobDesig = (String) Job.getSelectedItem();
        return JobDesig;
    }
    
    
    // gives a checkbox for the user to choose if he is a full or part time employee
    public static int Part() {
        int a01 = JOptionPane.showConfirmDialog(null, "Are You A Full-Time Staff?", "Please Choose", JOptionPane.YES_NO_OPTION);
        int FullPart = a01;
        return FullPart;
    }
    
    
    //This function will ask the user to input the number of working hour for a week 
            //This function will ask the user to input the number of working hour for a week 
        public void InputWeek( boolean FullTime, int weekNumber ){
            String w1;
            int week;
            do {
                do {
                    repeat = false;
                    w1 = JOptionPane.showInputDialog(null, "Please Enter Total Working Hours For Week "+weekNumber, "Input", JOptionPane.QUESTION_MESSAGE);
                    if (w1 == null) {
                        int a02 = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Exit?", "Error", JOptionPane.YES_NO_OPTION);
                        if (a02 == 0) {
                            System.exit(0);
                        } else {
                            repeat = true;
                        }
                    }
                } while (repeat == true);

                try {
                    week = Integer.parseInt(w1);
                    repeat = false;
                    if (week > 90 && FullTime == true) {
                        JOptionPane.showMessageDialog(null, "Working Hours Per Week Cannot Exceed 90 Hours", "Error", JOptionPane.ERROR_MESSAGE);
                        repeat = true;
                    } else if (week < 0) {
                        JOptionPane.showMessageDialog(null, "Working Hours Per Week Cannot Be Negative", "Error", JOptionPane.ERROR_MESSAGE);
                        repeat = true;
                    } else if (week > 25 && FullTime == false) {
                        JOptionPane.showMessageDialog(null, "Working Hours For Part-Timer Cannot Exceed 25 Hours", "Error", JOptionPane.ERROR_MESSAGE);
                        repeat = true;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please Input Numbers Only", "Error", JOptionPane.ERROR_MESSAGE);
                    repeat = true;
                }
            } while (repeat == true);
            }
    
}

