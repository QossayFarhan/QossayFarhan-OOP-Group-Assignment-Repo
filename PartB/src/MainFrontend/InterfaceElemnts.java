package MainFrontend;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class InterfaceElemnts {
    
    /*The First Group Of Code Asks The Name Of The Department From User
    *It Also Check If The Input Contains Any Numbers And Special Characters, 
    *Will Throw Error If Numbers And Special Characters Is Present
     */
    public static String InputDepartment(){
        boolean repeat;
        String input;
        String department;
        do {
            repeat = false;
            department = JOptionPane.showInputDialog(null, "Please Input Your Department Name", "Input", JOptionPane.QUESTION_MESSAGE);
            if (!department.matches("[a-zA-Z ]+")) {

                JOptionPane.showMessageDialog(null, "Please Input Characters Only", "Error", JOptionPane.ERROR_MESSAGE);
                repeat = true;
            }
        } while (repeat
                == true);
        return department;
    }
    
    /*The Second Group Of Code Asks The Number Of Staff In The Department From User, 
    *It Also Check If The Input Contains Any Characters And Special Characters,
    *Will Throw Exception If Characters And Special Characters Is Present
    */
    public static int InputStaffNo(){
        boolean repeat;
        String input;
        int noStaff = 0;
        do {
            do {
                repeat = false;
                input = JOptionPane.showInputDialog(null, "Please Input Number Of Staff In Your Department", "Input", JOptionPane.QUESTION_MESSAGE);
                if (input == null) {
                    int a02 = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Exit?", "Error", JOptionPane.YES_NO_OPTION);
                    if (a02 == 0) {
                        System.exit(0);
                    } else {
                        repeat = true;
                    }
                }
            } while (repeat == true);

            try {
                noStaff = Integer.parseInt(input);
                repeat = false;
                if (noStaff < 0) {
                    JOptionPane.showMessageDialog(null, "Number Of Staff Cannot Be Negative", "Error", JOptionPane.ERROR_MESSAGE);
                    repeat = true;
                }
                if (noStaff == 0) {
                    JOptionPane.showMessageDialog(null, "Number Of Staff Cannot Be Zero", "Error", JOptionPane.ERROR_MESSAGE);
                    repeat = true;

                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please Input Numbers Only", "ERROR", JOptionPane.ERROR_MESSAGE);
                repeat = true;
            }
        } while (repeat
                == true);
        return noStaff;
    }


    /*This Group Of Code Ask For The User's Full Name, It Also Check 
    *If The Input Contains Any Numbers And Special Characters,
    *Will Throw Error If Numbers And Special Characters Is Present
    */
    public static String InputName(){
        boolean repeat;
        String name;
        do {
            repeat = false;
            name = JOptionPane.showInputDialog(null, "Please Input Your Full Name, Separated By Space", "Input", JOptionPane.QUESTION_MESSAGE);
            if (!name.matches("^[a-zA-Z ]*$")) {

                JOptionPane.showMessageDialog(null, "Please Input Characters Only", "Error", JOptionPane.ERROR_MESSAGE);
                repeat = true;
            }
        } while (repeat
                == true);
        return name;
    }


    /*This Group Of Code Asks For The User's ID Number,
    *It Also Check If The Input Contains Any Characters And Special Characters,
    *Will Throw Exception If Characters And Special Characters Is Present
     */
    public static int InputID(){
        boolean repeat;
        String input;
        int ID = 0;
        do {
            do {
                repeat = false;
                input = JOptionPane.showInputDialog(null, "Please Input Your ID Number", "Input", JOptionPane.QUESTION_MESSAGE);
                if (input == null) {
                    int a02 = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Exit?", "Error", JOptionPane.YES_NO_OPTION);
                    if (a02 == 0) {
                        System.exit(0);
                    } else {
                        repeat = true;
                    }
                }

            } while (repeat == true);

            try {
                ID = Integer.parseInt(input);
                repeat = false;
                if (ID > 9999) {
                    JOptionPane.showMessageDialog(null, "Staff ID Cannot Exceed 4 Digits", "Error", JOptionPane.ERROR_MESSAGE);
                    repeat = true;
                }
                if (ID < 0) {
                    JOptionPane.showMessageDialog(null, "Staff ID Cannot Be Negative", "Error", JOptionPane.ERROR_MESSAGE);
                    repeat = true;
                }
                if (ID == 0) {
                    JOptionPane.showMessageDialog(null, "Staff ID Cannot Be Zero", "Error", JOptionPane.ERROR_MESSAGE);
                    repeat = true;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please Input Numbers Only", "ERROR", JOptionPane.ERROR_MESSAGE);
                repeat = true;
            }
        } while (repeat == true);
        return ID;
    }


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
    
    //This Code Determines Whether The User Is A Full Timer Or Part Timer, Done By Calling A Method From Another Class
    public static boolean InputFullTime(String position){
        boolean Timer;
        boolean repeat;
        do {
        repeat = false;
        int FullPart = InterfaceElemnts.Part();
        if (FullPart == 1 && ("Promoters".equals(position) || "Telemarketers".equals(position))) {
            Timer = false;
        } 
        else if (FullPart == 0) {
            Timer = true;
        } 
        else {
            Timer = false;
            JOptionPane.showMessageDialog(null, position + " is not applicable for Part-Timer", "Error", JOptionPane.ERROR_MESSAGE);
            int choice = JOptionPane.showConfirmDialog(null, "Would You Like To Choose Your Job Designation Again?", "Please Choose", JOptionPane.YES_NO_OPTION);
            if (choice == 0) {
                position = Desig();
            }
            repeat = true;
        }
    } 
        while (repeat == true);
    return Timer ;   
    }

    // gives a checkbox for the user to choose if he is a full or part time employee
    public static int Part() {
        int a01 = JOptionPane.showConfirmDialog(null, "Are You A Full-Time Staff?", "Please Choose", JOptionPane.YES_NO_OPTION);
        int FullPart = a01;
        return FullPart;
    }

    //This function will ask the user to input the number of working hour for a week 
    //This function will ask the user to input the number of working hour for a week 
    public static int InputWeek(boolean FullTime, int weekNumber) {
        boolean repeat;
        String w;
        int week = 0;
        do {
            do {
                repeat = false;
                w = JOptionPane.showInputDialog(null, "Please Enter Total Working Hours For Week " + weekNumber, "Input", JOptionPane.QUESTION_MESSAGE);
                if (w == null) {
                    int a02 = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Exit?", "Error", JOptionPane.YES_NO_OPTION);
                    if (a02 == 0) {
                        System.exit(0);
                    } else {
                        repeat = true;
                    }
                }
            } while (repeat == true);

            try {
                week = Integer.parseInt(w);
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
        return week;
    }

    public static String LessHoursReason(int weekNo, int WeekHours, boolean FullTime) {
        String ThisReason;
        if (WeekHours < 40 && FullTime == true) {
            int inva = JOptionPane.showConfirmDialog(null, "Woking Hours For Week " + weekNo + " are Less Than 40 Hours, Do You Have A Valid Reason?", "Please Choose", JOptionPane.YES_NO_OPTION);
            if (inva == 0) {
                JComboBox leave = new JComboBox();
                leave.addItem("Annual Leave");
                leave.addItem("Medical Leave");
                leave.addItem("Emergency Leave");
                leave.addItem("Others");
                JOptionPane.showMessageDialog(null, leave, "Please Select A Reason", JOptionPane.QUESTION_MESSAGE);
                ThisReason = (String) leave.getSelectedItem();
            } else {
                ThisReason = "Not Given";
            }
        } else {
            ThisReason = "-";
        }
        return ThisReason;
    }

    public static boolean Late() {
        boolean Late;
        int a01 = JOptionPane.showConfirmDialog(null, "Have You Come Late This Month?", "Please Choose", JOptionPane.YES_NO_OPTION);
        if (a01 == 1) {
            Late = false;
        } else {
            Late = true;
        }
        return Late;
    }

    public static int LateDaysInput() {
        boolean repeat;
        String input;
        int LateInDays = 0;

        do {
            do {

                repeat = false;
                input = JOptionPane.showInputDialog(null, "Please Input Number of late-in days", "Input", JOptionPane.QUESTION_MESSAGE);
                if (input == null) {
                    int a02 = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Exit?", "Error", JOptionPane.YES_NO_OPTION);
                    if (a02 == 0) {
                        System.exit(0);
                    } else {
                        repeat = true;
                    }
                }
            } while (repeat == true);

            try {
                LateInDays = Integer.parseInt(input);
                repeat = false;
                if (LateInDays < 0) {
                    JOptionPane.showMessageDialog(null, "Number Of Days Late Cannot Be Negative", "Error", JOptionPane.ERROR_MESSAGE);
                    repeat = true;
                }
                if (LateInDays > 28) {
                    JOptionPane.showMessageDialog(null, "Number Of Days Late Cannot Exceed 28 Working Days", "Error", JOptionPane.ERROR_MESSAGE);
                    repeat = true;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please Input Numbers Only", "ERROR", JOptionPane.ERROR_MESSAGE);
                repeat = true;
            }
        } while (repeat == true);
        return LateInDays;
    }
}
