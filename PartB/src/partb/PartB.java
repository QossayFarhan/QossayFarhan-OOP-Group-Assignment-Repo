package partb;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class PartB {

    public static void main(String[] args) {
        String Name, initials, Dep, a1 = "", a2 = "", a3 = "", a, Timer = "";
        char rep = 'n';
        int ID, NoStaff = 0;

        //The First Group Of Code Asks The Name Of The Department From User, It Also Check If The Input Contains Any Numbers And Special Characters, Will Throw Error If Numbers And Special Characters Is Present
        do {
            rep = 'n';
            a = JOptionPane.showInputDialog(null, "Please Input Your Department Name", "Input", JOptionPane.QUESTION_MESSAGE);
            if (!a.matches("[a-zA-Z]+")) {

                JOptionPane.showMessageDialog(null, "Please Input Characters Only", "Error", JOptionPane.ERROR_MESSAGE);
                rep = 'y';
            }
        } while (rep
                == 'y');

        //The Second Group Of Code Asks The Number Of Staff In The Department From User, It Also Check If The Input Contains Any Characters And Special Characters, Will Throw Exception If Characters And Special Characters Is Present
        do {
            String b = JOptionPane.showInputDialog(null, "Please Input Number Of Staff In Your Department", "Input", JOptionPane.QUESTION_MESSAGE);
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
            if (!a1.matches("^[a-zA-Z_ ]*$")) {

                JOptionPane.showMessageDialog(null, "Please Input Characters Only", "Error", JOptionPane.ERROR_MESSAGE);
                rep = 'y';
            }
        } while (rep == 'y');

        //This Group Of Code Asks For The User's ID Number, It Also Check If The Inputted ID Number is Larger Than Number Of Staff In User's Department, If ID Is Larger Than Number Of Staff, Throw Error And Repeat
        String c = JOptionPane.showInputDialog(null, "Please Input Your ID Number", "Input", JOptionPane.QUESTION_MESSAGE);
        ID = Integer.parseInt(c);

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

        System.out.println(
                "********************UNIMY REMUNERATION SYSTEM********************");
        System.out.println(
                "Department\t\t:" + a);
        System.out.println(
                "Total Staffs\t\t:" + NoStaff);
        System.out.println(
                "**********************PAY SLIP - NOV 2021************************");
        System.out.println(
                "Name\t\t\t:" + a1 + " " + a2 + " " + a3);
        System.out.printf(
                "Staff ID\t\t:%s%s%04d\n", "UM", JobDesig.charAt(0), ID);
        System.out.println(
                "Status\t\t\t:" + Timer);
        System.out.println(
                "Position\t\t:" + JobDesig);

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
        int a1 = JOptionPane.showConfirmDialog(null, "Are You A Full-Time Staff?", "Please Choose", JOptionPane.YES_NO_OPTION);
        int FullPart = a1;
        return FullPart;
    }
}
