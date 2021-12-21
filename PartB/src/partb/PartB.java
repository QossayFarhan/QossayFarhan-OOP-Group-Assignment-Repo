package partb;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class PartB {

    public static void main(String[] args) {
        String Name, initials, Dep, a1 = "", a2 = "", a3 = "", a, Timer = "";
        char rep = 'n';
        int ID, NoStaff = 0;

        //The First Group Of Code Asks The Name Of The Department From User, It Also Check If The Input Contains Any Numbers, Will Throw Error If Number Is Present
        do {
            rep = 'n';
            a = JOptionPane.showInputDialog(null, "Please input your Department Name", "Input", JOptionPane.QUESTION_MESSAGE);
            if (!a.matches("[a-zA-Z]+")) {

                JOptionPane.showMessageDialog(null, "Please Input Characters Only", "Error", JOptionPane.ERROR_MESSAGE);
                rep = 'y';
            }
        } while (rep
                == 'y');

        //The Second Group Of Code Asks The Number Of Staff In The Department From User, It Also Check If The Input Contains Any Characters, Will Throw Exception If Characters Is Present
        do {
            String b = JOptionPane.showInputDialog(null, "Please input number of staff your Department", "Input", JOptionPane.QUESTION_MESSAGE);
            try {
                NoStaff = Integer.parseInt(b);
                rep = 'n';
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please Input Numbers Only", "ERROR", JOptionPane.ERROR_MESSAGE);
                rep = 'y';
            }
        } while (rep == 'y');

        //This Group Of Code Ask For The User's First,Middle and Last Name
        for (int i = 1;
                i <= 3; i++) {
            switch (i) {
                case 1:
                    a1 = JOptionPane.showInputDialog(null, "Please Input Your First Name", "Input", JOptionPane.QUESTION_MESSAGE);
                    break;
                case 2:
                    a2 = JOptionPane.showInputDialog(null, "Please Input Your Middle Name", "Input", JOptionPane.QUESTION_MESSAGE);
                    break;
                case 3:
                    a3 = JOptionPane.showInputDialog(null, "Please Input Your Last Name", "Input", JOptionPane.QUESTION_MESSAGE);
                    break;
            }
        }

        //This Group Of Code Asks For The User's ID Number, It Also Check If The Inputted ID Number is Larger Than Number Of Staff In User's Department, If ID Is Larger Than Number Of Staff, Throw Error 
        do {
            rep = 'n';
            String c = JOptionPane.showInputDialog(null, "Please input your ID number", "Input", JOptionPane.QUESTION_MESSAGE);
            ID = Integer.parseInt(c);
            if (ID > NoStaff) {
                JOptionPane.showMessageDialog(null, "ID Number Cannot Be Higher Than Number Of Staff In Department, Please Try Again", "Error", JOptionPane.ERROR_MESSAGE);
                rep = 'y';
            }
        } while (rep
                == 'y');
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
                "Staff ID\t\t:%s%s%s%04d\n", a1.charAt(0), a2.charAt(0), a3.charAt(0), ID);
        System.out.println(
                "Status\t\t\t:" + Timer);
        System.out.println(
                "Position\t\t:" + JobDesig);

    }
}

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

class Full {

    public static int Part() {
        int a1 = JOptionPane.showConfirmDialog(null, "Are You A Full-Time Staff?", "Please Choose", JOptionPane.YES_NO_OPTION);
        int FullPart = a1;
        return FullPart;
    }
}
