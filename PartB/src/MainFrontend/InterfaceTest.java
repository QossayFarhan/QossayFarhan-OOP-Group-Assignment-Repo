package MainFrontend;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import Myclasses.*;

public class InterfaceTest {

    public static void main(String[] args) {
        String Name, initials, Dep, a1 = "", a2 = "", a3 = "", a, b, c, Timer = "", w1 = "", w2 = "", w3 = "", w4 = "", Reason1 = "", Reason2 = "", Reason3 = "", Reason4 = "";
        char rep = 'n';
        int ID = 0, NoStaff = 0, week1 = 0, week2 = 0, week3 = 0, week4 = 0, totalweek = 0;
        double totalincome = 0, allow = 0;

        //The First Group Of Code Asks The Name Of The Department From User, It Also Check If The Input Contains Any Numbers And Special Characters, Will Throw Error If Numbers And Special Characters Is Present
        do {
            rep = 'n';
            a = JOptionPane.showInputDialog(null, "Please Input Your Department Name", "Input", JOptionPane.QUESTION_MESSAGE);
            if (!a.matches("[a-zA-Z ]+")) {

                JOptionPane.showMessageDialog(null, "Please Input Characters Only", "Error", JOptionPane.ERROR_MESSAGE);
                rep = 'y';
            }
        } while (rep
                == 'y');

        //The Second Group Of Code Asks The Number Of Staff In The Department From User, It Also Check If The Input Contains Any Characters And Special Characters, Will Throw Exception If Characters And Special Characters Is Present
        do {
            do {
                rep = 'n';
                b = JOptionPane.showInputDialog(null, "Please Input Number Of Staff In Your Department", "Input", JOptionPane.QUESTION_MESSAGE);
                if (b == null) {
                    int a02 = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Exit?", "Error", JOptionPane.YES_NO_OPTION);
                    if (a02 == 0) {
                        System.exit(0);
                    } else {
                        rep = 'y';
                    }
                }
            } while (rep == 'y');

            try {
                NoStaff = Integer.parseInt(b);
                rep = 'n';

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please Input Numbers Only", "ERROR", JOptionPane.ERROR_MESSAGE);
                rep = 'y';
            }
        } while (rep == 'y');

        //This Group Of Code Ask For The User's Full Name, It Also Check If The Input Contains Any Numbers And Special Characters, Will Throw Error If Numbers And Special Characters Is Present
        do {
            rep = 'n';
            a1 = JOptionPane.showInputDialog(null, "Please Input Your Full Name, Separated By Space", "Input", JOptionPane.QUESTION_MESSAGE);
            if (!a1.matches("^[a-zA-Z ]*$")) {

                JOptionPane.showMessageDialog(null, "Please Input Characters Only", "Error", JOptionPane.ERROR_MESSAGE);
                rep = 'y';
            }
        } while (rep == 'y');

        //This Group Of Code Asks For The User's ID Number, It Also Check If The Input Contains Any Characters And Special Characters, Will Throw Exception If Characters And Special Characters Is Present
        do {
            do {
                rep = 'n';
                c = JOptionPane.showInputDialog(null, "Please Input Your ID Number", "Input", JOptionPane.QUESTION_MESSAGE);
                if (c == null) {
                    int a02 = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Exit?", "Error", JOptionPane.YES_NO_OPTION);
                    if (a02 == 0) {
                        System.exit(0);
                    } else {
                        rep = 'y';
                    }
                }
            } while (rep == 'y');

            try {
                ID = Integer.parseInt(c);
                rep = 'n';
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please Input Numbers Only", "ERROR", JOptionPane.ERROR_MESSAGE);
                rep = 'y';
            }
        } while (rep == 'y');

        //This Code Gets The Users Job Designation, Done By Calling A Method From Another Class
        String JobDesig = Job.Desig();

        //This Code Determines Whether The User Is A Full Timer Or Part Timer, Done By Calling A Method From Another Class
        do {
            rep = 'n';
            int FullPart = Full.Part();
            if (FullPart == 1 && ("Promoters".equals(JobDesig) || "Telemarketers".equals(JobDesig))) {
                Timer = "Part-Time";
            } else if (FullPart == 0) {
                Timer = "Full-Time";
            } else {
                Timer = "Part-Time";
                JOptionPane.showMessageDialog(null, JobDesig + " is not applicable for " + Timer, "Error", JOptionPane.ERROR_MESSAGE);
                int choice = JOptionPane.showConfirmDialog(null, "Would You Like To Choose Your Job Designation Again?", "Please Choose", JOptionPane.YES_NO_OPTION);
                if (choice == 0) {
                    JobDesig = Job.Desig();
                }
                rep = 'y';
            }
        } while (rep == 'y');

        //This Group Of Code Gets 1 Input From The User For Week 1, It Also Check If The Input Contains Any Characters And Special Characters, Will Throw Exception If Characters And Special Characters Is Present
        do {
            do {
                rep = 'n';
                w1 = JOptionPane.showInputDialog(null, "Please Enter Total Working Hours For Week 1", "Input", JOptionPane.QUESTION_MESSAGE);
                if (w1 == null) {
                    int a02 = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Exit?", "Error", JOptionPane.YES_NO_OPTION);
                    if (a02 == 0) {
                        System.exit(0);
                    } else {
                        rep = 'y';
                    }
                }
            } while (rep == 'y');

            try {
                week1 = Integer.parseInt(w1);
                rep = 'n';
                if (week1 > 90 && "Full-Time".equals(Timer)) {
                    JOptionPane.showMessageDialog(null, "Working Hours Per Week Cannot Exceed 90 Hours", "Error", JOptionPane.ERROR_MESSAGE);
                    rep = 'y';
                } else if (week1 < 0) {
                    JOptionPane.showMessageDialog(null, "Working Hours Per Week Cannot Be Negative", "Error", JOptionPane.ERROR_MESSAGE);
                    rep = 'y';
                } else if (week1 > 25 && "Part-Time".equals(Timer)) {
                    JOptionPane.showMessageDialog(null, "Working Hours For Part-Timer Cannot Exceed 25 Hours", "Error", JOptionPane.ERROR_MESSAGE);
                    rep = 'y';
                }
                totalweek = totalweek + week1;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please Input Numbers Only", "Error", JOptionPane.ERROR_MESSAGE);
                rep = 'y';
            }
        } while (rep == 'y');

        //This Group Of Code Gets 1 Input From The User For Week 2, It Also Check If The Input Contains Any Characters And Special Characters, Will Throw Exception If Characters And Special Characters Is Present
        do {
            do {
                rep = 'n';
                w2 = JOptionPane.showInputDialog(null, "Please Enter Total Working Hours For Week 2", "Input", JOptionPane.QUESTION_MESSAGE);
                if (w2 == null) {
                    int a02 = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Exit?", "Error", JOptionPane.YES_NO_OPTION);
                    if (a02 == 0) {
                        System.exit(0);
                    } else {
                        rep = 'y';
                    }
                }
            } while (rep == 'y');

            try {
                week2 = Integer.parseInt(w2);
                rep = 'n';
                if (week2 > 90 && "Full-Time".equals(Timer)) {
                    JOptionPane.showMessageDialog(null, "Working Hours Per Week Cannot Exceed 90 Hours", "Error", JOptionPane.ERROR_MESSAGE);
                    rep = 'y';
                } else if (week2 < 0) {
                    JOptionPane.showMessageDialog(null, "Working Hours Per Week Cannot Be Negative", "Error", JOptionPane.ERROR_MESSAGE);
                    rep = 'y';
                } else if (week2 > 25 && "Part-Time".equals(Timer)) {
                    JOptionPane.showMessageDialog(null, "Working Hours For Part-Timer Cannot Exceed 25 Hours", "Error", JOptionPane.ERROR_MESSAGE);
                    rep = 'y';
                }
                totalweek = totalweek + week2;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please Input Numbers Only", "Error", JOptionPane.ERROR_MESSAGE);
                rep = 'y';
            }
        } while (rep == 'y');

        //This Group Of Code Gets 1 Input From The User For Week 3, It Also Check If The Input Contains Any Characters And Special Characters, Will Throw Exception If Characters And Special Characters Is Present
        do {
            do {
                rep = 'n';
                w3 = JOptionPane.showInputDialog(null, "Please Enter Total Working Hours For Week 3", "Input", JOptionPane.QUESTION_MESSAGE);
                if (w3 == null) {
                    int a02 = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Exit?", "Error", JOptionPane.YES_NO_OPTION);
                    if (a02 == 0) {
                        System.exit(0);
                    } else {
                        rep = 'y';
                    }
                }
            } while (rep == 'y');

            try {
                week3 = Integer.parseInt(w3);
                rep = 'n';
                if (week3 > 90 && "Full-Time".equals(Timer)) {
                    JOptionPane.showMessageDialog(null, "Working Hours Per Week Cannot Exceed 90 Hours", "Error", JOptionPane.ERROR_MESSAGE);
                    rep = 'y';
                } else if (week3 < 0) {
                    JOptionPane.showMessageDialog(null, "Working Hours Per Week Cannot Be Negative", "Error", JOptionPane.ERROR_MESSAGE);
                    rep = 'y';
                } else if (week3 > 25 && "Part-Time".equals(Timer)) {
                    JOptionPane.showMessageDialog(null, "Working Hours For Part-Timer Cannot Exceed 25 Hours", "Error", JOptionPane.ERROR_MESSAGE);
                    rep = 'y';
                }
                totalweek = totalweek + week3;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please Input Numbers Only", "Error", JOptionPane.ERROR_MESSAGE);
                rep = 'y';
            }
        } while (rep == 'y');

        //This Group Of Code Gets 1 Input From The User For Week 4, It Also Check If The Input Contains Any Characters And Special Characters, Will Throw Exception If Characters And Special Characters Is Present
        do {
            do {
                rep = 'n';
                w4 = JOptionPane.showInputDialog(null, "Please Enter Total Working Hours For Week 4", "Input", JOptionPane.QUESTION_MESSAGE);
                if (w4 == null) {
                    int a02 = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Exit?", "Error", JOptionPane.YES_NO_OPTION);
                    if (a02 == 0) {
                        System.exit(0);
                    } else {
                        rep = 'y';
                    }
                }
            } while (rep == 'y');

            try {
                week4 = Integer.parseInt(w4);
                rep = 'n';
                if (week4 > 90 && "Full-Time".equals(Timer)) {
                    JOptionPane.showMessageDialog(null, "Working Hours Per Week Cannot Exceed 90 Hours", "Error", JOptionPane.ERROR_MESSAGE);
                    rep = 'y';
                } else if (week4 < 0) {
                    JOptionPane.showMessageDialog(null, "Working Hours Per Week Cannot Be Negative", "Error", JOptionPane.ERROR_MESSAGE);
                    rep = 'y';
                } else if (week4 > 25 && "Part-Time".equals(Timer)) {
                    JOptionPane.showMessageDialog(null, "Working Hours For Part-Timer Cannot Exceed 25 Hours", "Error", JOptionPane.ERROR_MESSAGE);
                    rep = 'y';
                }

                totalweek = totalweek + week4;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please Input Numbers Only", "Error", JOptionPane.ERROR_MESSAGE);
                rep = 'y';
            }
        } while (rep == 'y');

        if (week1 < 40 && "Full-Time".equals(Timer)) {
            int inva = valid.invalid1();
            if (inva == 0) {
                Reason1 = leave.reason();

            } else {
                Reason1 = "Not Given";
                totalweek = totalweek - week1;
            }
        } else {
            Reason1 = "-";
        }
        if (week2 < 40 && "Full-Time".equals(Timer)) {
            int inva = valid.invalid2();
            if (inva == 0) {
                Reason2 = leave.reason();

            } else {
                Reason2 = "Not Given";
                totalweek = totalweek - week2;
            }
        } else {
            Reason2 = "-";
        }
        if (week3 < 40 && "Full-Time".equals(Timer)) {
            int inva = valid.invalid3();
            if (inva == 0) {
                Reason3 = leave.reason();

            } else {
                Reason3 = "Not Given";
                totalweek = totalweek - week3;
            }
        } else {
            Reason3 = "-";
        }
        if (week4 < 40 && "Full-Time".equals(Timer)) {
            int inva = valid.invalid4();
            if (inva == 0) {
                Reason4 = leave.reason();

            } else {
                Reason4 = "Not Given";
                totalweek = totalweek - week4;
            }
        } else {
            Reason4 = "-";
        }

        int late=0;
        double per = 0;
        switch (JobDesig) {
            case "Manager":
                per = 58.85;
                allow = 1000.00;
                break;
            case "Assistant Manager":
                per = 32.45;
                allow = 800.00;
                break;
            case "Supervisor":
                per = 15.39;
                allow = 300.00;
                break;
            case "Executive":
                per = 12.67;
                allow = 100.00;
                break;
            case "Promoters":
                per = 8.89;
                break;
            case "Telemarketers":
                per = 5.34;
                break;
            default:
                break;
        }
        String totw1 = "";
        if ("Not Given".equals(Reason1)) {
            totw1 = "Incomplete";
        } else {
            double temp = week1 * per;
            temp = Math.round(temp * 100.00) / 100.00;
            totw1 = "RM" + String.valueOf(temp);
            totalincome = totalincome + temp;
        }

        String totw2 = "";
        if ("Not Given".equals(Reason2)) {
            totw2 = "Incomplete";
        } else {
            double temp = week2 * per;
            temp = Math.round(temp * 100.00) / 100.00;
            totw2 = "RM" + String.valueOf(temp);
            totalincome = totalincome + temp;
        }

        String totw3 = "";
        if ("Not Given".equals(Reason3)) {
            totw3 = "Incomplete";
        } else {
            double temp = week3 * per;
            temp = Math.round(temp * 100.00) / 100.00;
            totw3 = "RM" + String.valueOf(temp);
            totalincome = totalincome + temp;
        }
        String totw4 = "";
        if ("Not Given".equals(Reason4)) {
            totw4 = "Incomplete";
        } else {
            double temp = week4 * per;
            temp = Math.round(temp * 100.00) / 100.00;
            totw4 = "RM" + String.valueOf(temp);
            totalincome = totalincome + temp;
        }

        System.out.println(
                "***********************UNIMY REMUNERATION SYSTEM***********************");
        System.out.println(
                "Department\t\t: " + a);
        System.out.println(
                "Total Staffs\t\t: " + NoStaff);
        System.out.println(
                "*************************PAY SLIP - NOV 2021***************************");
        System.out.println(
                "Name\t\t\t: " + a1 + " " + a2 + " " + a3);
        System.out.printf(
                "Staff ID\t\t: %s%s%04d\n", "UM", JobDesig.charAt(0), ID);
        System.out.println(
                "Status\t\t\t: " + Timer);
        System.out.println(
                "Position\t\t: " + JobDesig);
        System.out.println(
                "****************************** INCOME *********************************");
        System.out.printf("%-20s%-20s%-20s%-20s", "Working Hours", "Reason", "Per-Hour", "Total");
        System.out.println("");
        System.out.format("Week 1 : %-11s%-20s%-20s%-20s", week1, Reason1, "RM" + per, totw1);
        System.out.println("");
        System.out.format("Week 2 : %-11s%-20s%-20s%-20s", week2, Reason2, "RM" + per, totw2);
        System.out.println("");
        System.out.format("Week 3 : %-11s%-20s%-20s%-20s", week3, Reason3, "RM" + per, totw3);
        System.out.println("");
        System.out.format("Week 4 : %-11s%-20s%-20s%-20s", week4, Reason4, "RM" + per, totw4);
        System.out.println("");
        System.out.println("Total valid working hours: " + totalweek + "\t\t\t\t    ----------");
        System.out.printf("\t\t\t\t\t\t    Total : RM%.2f\n", totalincome);
        System.out.println(
                "*********************** ALLOWANCE/REWARDS/BONUS ************************");
        System.out.printf("Allowance\t\t: RM%.2f\n", allow);
    }

}

//This Class & Method Displays A Drop Down Menu For The User To Choose Their Job Designation
class Job {

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

}

//This Class & Method Displays A Confirm Dialog To Ask Whether The User Is A Full Timer Or Part Timer 
class Full {

    public static int Part() {
        int a01 = JOptionPane.showConfirmDialog(null, "Are You A Full-Time Staff?", "Please Choose", JOptionPane.YES_NO_OPTION);
        int FullPart = a01;
        return FullPart;
    }
}

class leave {

    public static String reason() {
        JComboBox leave = new JComboBox();
        leave.addItem("Annual Leave");
        leave.addItem("Medical Leave");
        leave.addItem("Emergency Leave");
        leave.addItem("Others");
        JOptionPane.showMessageDialog(null, leave, "Please Select A Reason", JOptionPane.QUESTION_MESSAGE);
        String Reason = (String) leave.getSelectedItem();
        return Reason;

    }
}

class valid {

    public static int invalid1() {
        int a01 = JOptionPane.showConfirmDialog(null, "Woking Hours For Week 1 Is Lesser Than 40 Hours, Do You Have A Valid Reason?", "Please Choose", JOptionPane.YES_NO_OPTION);
        int inva = a01;
        return inva;
    }

    public static int invalid2() {
        int a01 = JOptionPane.showConfirmDialog(null, "Woking Hours For Week 2 Is Lesser Than 40 Hours, Do You Have A Valid Reason?", "Please Choose", JOptionPane.YES_NO_OPTION);
        int inva = a01;
        return inva;
    }

    public static int invalid3() {
        int a01 = JOptionPane.showConfirmDialog(null, "Woking Hours For Week 3 Is Lesser Than 40 Hours, Do You Have A Valid Reason?", "Please Choose", JOptionPane.YES_NO_OPTION);
        int inva = a01;
        return inva;
    }

    public static int invalid4() {
        int a01 = JOptionPane.showConfirmDialog(null, "Woking Hours For Week 4 Is Lesser Than 40 Hours, Do You Have A Valid Reason?", "Please Choose", JOptionPane.YES_NO_OPTION);
        int inva = a01;
        return inva;
    }
}