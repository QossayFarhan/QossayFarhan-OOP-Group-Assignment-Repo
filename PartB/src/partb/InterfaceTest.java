
package partb;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class InterfaceTest {

    public static void main(String[] args) {
        String Name, initials, Dep, a1 = "", a2 = "", a3 = "", a, b, c, Timer = "", w1 = "", w2 = "", w3 = "", w4 = "";
        char rep = 'n';
        int ID = 0, NoStaff = 0, week1 = 0, week2 = 0, week3 = 0, week4 = 0;

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
        
        //This Group Of Code Get 4 Input From The User, It Also Check If The Input Contains Any Characters And Special Characters, Will Throw Exception If Characters And Special Characters Is Present
        for (int i = 1; i <= 4; i++) {
            switch (i) {
                case 1:
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
                            if (week1 > 90) {
                                JOptionPane.showMessageDialog(null, "Working Hours Per Week Cannot Exceed 90 Hours", "Error", JOptionPane.ERROR_MESSAGE);
                                rep = 'y';
                            } else if (week1 < 0) {
                                JOptionPane.showMessageDialog(null, "Working Hours Per Week Cannot Be Negative", "Error", JOptionPane.ERROR_MESSAGE);
                                rep = 'y';
                            }

                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Please Input Numbers Only", "Error", JOptionPane.ERROR_MESSAGE);
                            rep = 'y';
                        }
                    } while (rep == 'y');

                    break;
                case 2:
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
                            if (week2 > 90) {
                                JOptionPane.showMessageDialog(null, "Working Hours Per Week Cannot Exceed 90 Hours", "Error", JOptionPane.ERROR_MESSAGE);
                                rep = 'y';
                            } else if (week2 < 0) {
                                JOptionPane.showMessageDialog(null, "Working Hours Per Week Cannot Be Negative", "Error", JOptionPane.ERROR_MESSAGE);
                                rep = 'y';
                            }

                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Please Input Numbers Only", "Error", JOptionPane.ERROR_MESSAGE);
                            rep = 'y';
                        }
                    } while (rep == 'y');
                    break;
                case 3:
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
                            if (week3 > 90) {
                                JOptionPane.showMessageDialog(null, "Working Hours Per Week Cannot Exceed 90 Hours", "Error", JOptionPane.ERROR_MESSAGE);
                                rep = 'y';
                            } else if (week3 < 0) {
                                JOptionPane.showMessageDialog(null, "Working Hours Per Week Cannot Be Negative", "Error", JOptionPane.ERROR_MESSAGE);
                                rep = 'y';
                            }

                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Please Input Numbers Only", "Error", JOptionPane.ERROR_MESSAGE);
                            rep = 'y';
                        }
                    } while (rep == 'y');
                    break;
                case 4:
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
                            if (week4 > 90) {
                                JOptionPane.showMessageDialog(null, "Working Hours Per Week Cannot Exceed 90 Hours", "Error", JOptionPane.ERROR_MESSAGE);
                                rep = 'y';
                            } else if (week4 < 0) {
                                JOptionPane.showMessageDialog(null, "Working Hours Per Week Cannot Be Negative", "Error", JOptionPane.ERROR_MESSAGE);
                                rep = 'y';
                            }

                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Please Input Numbers Only", "Error", JOptionPane.ERROR_MESSAGE);
                            rep = 'y';
                        }
                    } while (rep == 'y');
                    break;
            }
        }

        System.out.println(week1);
        System.out.println(week2);
        System.out.println(week3);
        System.out.println(week4);

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
        System.out.println(
                "*************************** INCOME ******************************");
        System.out.println("Working Hours\t\tReason\t\tPer-Hour\tTotal");

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