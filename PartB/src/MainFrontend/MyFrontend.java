package MainFrontend;

import Myclasses.*;
import javax.swing.JOptionPane;

public class MyFrontend {

    public static void main(String[] args) {

        //Parametrs for control statments  
        boolean repeat;
        String input;
        int weekNo = 1;
        //Temporary variables to recive the values from the user then Pass it to the correct constroctor
        String department;
        int noStaff = 0;
        String name;
        int ID = 0;
        String position;
        boolean Timer;

        /*The First Group Of Code Asks The Name Of The Department From User
        *It Also Check If The Input Contains Any Numbers And Special Characters, 
        *Will Throw Error If Numbers And Special Characters Is Present
         */
        do {
            repeat = false;
            department = JOptionPane.showInputDialog(null, "Please Input Your Department Name", "Input", JOptionPane.QUESTION_MESSAGE);
            if (!department.matches("[a-zA-Z ]+")) {

                JOptionPane.showMessageDialog(null, "Please Input Characters Only", "Error", JOptionPane.ERROR_MESSAGE);
                repeat = true;
            }
        } while (repeat
                == true);

        /*The Second Group Of Code Asks The Number Of Staff In The Department From User, 
        *It Also Check If The Input Contains Any Characters And Special Characters,
        *Will Throw Exception If Characters And Special Characters Is Present
         */
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

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please Input Numbers Only", "ERROR", JOptionPane.ERROR_MESSAGE);
                repeat = true;
            }
        } while (repeat == true);

        /*This Group Of Code Ask For The User's Full Name, It Also Check 
        *If The Input Contains Any Numbers And Special Characters,
        *Will Throw Error If Numbers And Special Characters Is Present
         */
        do {
            repeat = false;
            name = JOptionPane.showInputDialog(null, "Please Input Your Full Name, Separated By Space", "Input", JOptionPane.QUESTION_MESSAGE);
            if (!name.matches("^[a-zA-Z ]*$")) {

                JOptionPane.showMessageDialog(null, "Please Input Characters Only", "Error", JOptionPane.ERROR_MESSAGE);
                repeat = true;
            }
        } while (repeat == true);

        /*This Group Of Code Asks For The User's ID Number,
        *It Also Check If The Input Contains Any Characters And Special Characters,
        *Will Throw Exception If Characters And Special Characters Is Present
         */
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
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please Input Numbers Only", "ERROR", JOptionPane.ERROR_MESSAGE);
                repeat = true;
            }
        } while (repeat == true);

        //call a dropdown menu from InterfaceElements class to chose position 
        position = InterfaceElemnts.Desig();

        //This Code Determines Whether The User Is A Full Timer Or Part Timer, Done By Calling A Method From Another Class
        do {
            repeat = false;
            int FullPart = InterfaceElemnts.Part();
            if (FullPart == 1 && ("Promoters".equals(position) || "Telemarketers".equals(position))) {
                Timer = false;
            } else if (FullPart == 0) {
                Timer = true;
            } else {
                Timer = false;
                JOptionPane.showMessageDialog(null, position + " is not applicable for Part-Timer", "Error", JOptionPane.ERROR_MESSAGE);
                int choice = JOptionPane.showConfirmDialog(null, "Would You Like To Choose Your Job Designation Again?", "Please Choose", JOptionPane.YES_NO_OPTION);
                if (choice == 0) {
                    position = Job.Desig();
                }
                repeat = true;
            }
        } while (repeat == true);

        //create an object based on the correct class that has been chosen by user(position)
        Employee employee = null;
        switch (position) {
            case "Manager": {
                employee = new Manager(department, noStaff, name, position, Timer);
                break;
            }
            case "Assistant Manager": {
                employee = new AssistantManager(department, noStaff, name, position, Timer);
                break;
            }
            case "Supervisor": {
                employee = new Supervisor(department, noStaff, name, position, Timer);
                break;
            }
            case "Executive": {
                employee = new Executive(department, noStaff, name, position, Timer);
                break;
            }
            case "Promoters": {
                employee = new Promoter(department, noStaff, name, position, Timer);
                break;
            }
            case "Telemarketers": {
                employee = new Telemarketer(department, noStaff, name, position, Timer);
                break;
            }
            default:
                break;
        }

        // Set hour Price and allowance
        employee.SetPrice();

        //here we call methods from InterfaceElemnts class to input the number of working hours for each week and check its validity 
        employee.week1 = InterfaceElemnts.InputWeek(employee.FullTime, weekNo);
        employee.LessHoursReason1 = InterfaceElemnts.LessHoursReason(weekNo, employee.week1, employee.FullTime);
        weekNo += 1;

        employee.week2 = InterfaceElemnts.InputWeek(employee.FullTime, weekNo);
        employee.LessHoursReason2 = InterfaceElemnts.LessHoursReason(weekNo, employee.week2, employee.FullTime);
        weekNo += 1;

        employee.week3 = InterfaceElemnts.InputWeek(employee.FullTime, weekNo);
        employee.LessHoursReason3 = InterfaceElemnts.LessHoursReason(weekNo, employee.week3, employee.FullTime);
        weekNo += 1;

        employee.week4 = InterfaceElemnts.InputWeek(employee.FullTime, weekNo);
        employee.LessHoursReason4 = InterfaceElemnts.LessHoursReason(weekNo, employee.week4, employee.FullTime);

        //call afunction to calaculate the late in panlety from class employee
        employee.Late = InterfaceElemnts.Late();
        if (employee.Late) {
            //input the number of late-in days by calling a method form IterfaceElemnts
            employee.LateDays = InterfaceElemnts.LateDaysInput();
            employee.LateDaysPen();
        }

        //Get total working hours 
        employee.TotalWorkHours();
        employee.PriceMonth();

        //Get Gross Pay 
        employee.GrossPay();

        //get extra bonus and monthly reward
        employee.ExtraBonus();
        employee.MonthlyReward();

        //Get Gross Pay after addition
        employee.GrossPayAfter();

        //Calculate the deduction 
        employee.EPF();
        employee.SOCSO();
        employee.IncomeTax();
        employee.TotalDeduction();

        //NetPay
        employee.NetPay();

        // Prepare to print either part or full time 
        String Time;
        if (employee.FullTime == true) {
            Time = "Full-Time";
        } else {
            Time = "Part-Time";
        }
        // Prepare week Paymanet to print 
        String totw1 = employee.PriceWeek(employee.week1, employee.LessHoursReason1);
        String totw2 = employee.PriceWeek(employee.week2, employee.LessHoursReason2);
        String totw3 = employee.PriceWeek(employee.week3, employee.LessHoursReason3);
        String totw4 = employee.PriceWeek(employee.week4, employee.LessHoursReason4);
        // create Id 
        employee.GenerateID(ID);

        // print the payment slip  
        System.out.println(
                "***********************UNIMY REMUNERATION SYSTEM***********************");
        System.out.println(
                "Department\t\t: " + employee.Department);
        System.out.println(
                "Total Staffs\t\t: " + employee.StaffNO);
        System.out.println(
                "**************************PAY SLIP - NOV 2021**************************");
        System.out.println(
                "Name\t\t\t: " + employee.Name);
        System.out.printf(
                "Staff ID\t\t: %s\n", employee.ID);
        System.out.println(
                "Status\t\t\t: " + Time);
        System.out.println(
                "Position\t\t: " + employee.Position);
        System.out.println(
                "******************************* INCOME *******************************");
        System.out.printf("%-20s%-20s%-20s%-20s", "Working Hours", "Reason", "Per-Hour", "Total");
        System.out.println("");
        System.out.format("Week 1 : %-11s%-20s%-20s%-20s", employee.week1, employee.LessHoursReason1, "RM" + employee.PriceHour, totw1);
        System.out.println("");
        System.out.format("Week 2 : %-11s%-20s%-20s%-20s", employee.week2, employee.LessHoursReason2, "RM" + employee.PriceHour, totw2);
        System.out.println("");
        System.out.format("Week 3 : %-11s%-20s%-20s%-20s", employee.week3, employee.LessHoursReason3, "RM" + employee.PriceHour, totw3);
        System.out.println("");
        System.out.format("Week 4 : %-11s%-20s%-20s%-20s", employee.week4, employee.LessHoursReason4, "RM" + employee.PriceHour, totw4);
        System.out.println("");
        System.out.println("Total valid working hours: " + employee.TotalWorkHours + "\t\t\t\t    ----------");
        System.out.printf("\t\t\t\t\t\t    Total : RM%.2f\n", employee.MonthPrice);
        System.out.println(
                "*********************** ALLOWANCE/REWARDS/BONUS ***********************");
        System.out.printf("ALLOWANCE\t\t: RM%.2f\n", employee.Allowance);
        System.out.printf("EXTRA BONUS\t\t: RM%.2f\n", employee.ExtraBonus);
        System.out.printf("REWARD(" + employee.MonthlyRewardPercent + ")" + "\t\t: RM%.2f\n", employee.MonthlyReward);
        System.out.printf("GROSS PAY\t\t: RM%.2f\n", employee.GrossPay1);
        System.out.println(
                "****************************** PENALTIES ******************************");
        System.out.printf("Late-in : " + employee.LateDays + " days\t\t\t Late-in Panelties RM%.2f\n", employee.LateDayPen);
        System.out.printf("New gross pay after penalties\t\t: RM%.2f\n", employee.GrossPayAfter);
        System.out.println(
                "****************************** DEDUCTION ******************************");
        System.out.printf("EPF (11%%)\t\t: RM%.2f\n", employee.EPF);
        System.out.printf("SOCSO (0.5%%)\t\t: RM%.2f\n", employee.SOCSO);
        System.out.printf("INCOME TAX(3%%)" + "\t\t: RM%.2f\n", employee.IncomeTax);
        System.out.printf("TOTAL DEDUCTION\t\t: RM%.2f\n", employee.TotalDeduction);
        System.out.println(
                "******************************* NET PAY *******************************");
        System.out.printf(
                "NET PAY\t\t\t: RM%.2f\n", employee.NetPay);

    }
}
