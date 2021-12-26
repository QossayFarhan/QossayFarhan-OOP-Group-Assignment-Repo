package MainFrontend;

import Myclasses.*;
import java.io.File;
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

        //display inputbox to take department from user 
        department = InterfaceElemnts.InputDepartment();
        
        //display inputbox to take staff number in department from user 
        noStaff = InterfaceElemnts.InputStaffNo();
        
        //display inputbox to take name from user 
        name = InterfaceElemnts.InputName();

        //display inputbox to take id from user 
        ID = InterfaceElemnts.InputID();

        //call a dropdown menu from InterfaceElements class to chose position 
        position = InterfaceElemnts.Desig();

        //display checkbox to check if user is full time or no 
        Timer = InterfaceElemnts.InputFullTime(position);
        
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
        if (employee.FullTime
                == true) {
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

        // Print the payment slip  
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
        System.out.printf(
                "%-20s%-20s%-20s%-20s", "Working Hours", "Reason", "Per-Hour", "Total");
        System.out.println(
                "");
        System.out.format(
                "Week 1 : %-11s%-20s%-20s%-20s", employee.week1, employee.LessHoursReason1, "RM" + employee.PriceHour, totw1);
        System.out.println(
                "");
        System.out.format(
                "Week 2 : %-11s%-20s%-20s%-20s", employee.week2, employee.LessHoursReason2, "RM" + employee.PriceHour, totw2);
        System.out.println(
                "");
        System.out.format(
                "Week 3 : %-11s%-20s%-20s%-20s", employee.week3, employee.LessHoursReason3, "RM" + employee.PriceHour, totw3);
        System.out.println(
                "");
        System.out.format(
                "Week 4 : %-11s%-20s%-20s%-20s", employee.week4, employee.LessHoursReason4, "RM" + employee.PriceHour, totw4);
        System.out.println(
                "");
        System.out.println(
                "Total valid working hours: " + employee.TotalWorkHours + "\t\t\t\t    ----------");
        System.out.printf(
                "\t\t\t\t\t\t    Total : RM%.2f\n", employee.MonthPrice);
        System.out.println(
                "*********************** ALLOWANCE/REWARDS/BONUS ***********************");
        System.out.printf(
                "ALLOWANCE\t\t: RM%.2f\n", employee.Allowance);
        System.out.printf(
                "EXTRA BONUS\t\t: RM%.2f\n", employee.ExtraBonus);
        System.out.printf(
                "REWARD(" + employee.MonthlyRewardPercent + ")" + "\t\t: RM%.2f\n", employee.MonthlyReward);
        System.out.printf(
                "GROSS PAY\t\t: RM%.2f\n", employee.GrossPay1);
        System.out.println(
                "****************************** PENALTIES ******************************");
        System.out.printf(
                "Late-in : " + employee.LateDays + " days\t\t\t Late-in Panelties RM%.2f\n", employee.LateDayPen);
        System.out.printf(
                "New gross pay after penalties\t\t: RM%.2f\n", employee.GrossPayAfter);
        System.out.println(
                "****************************** DEDUCTION ******************************");
        System.out.printf(
                "EPF (11%%)\t\t: RM%.2f\n", employee.EPF);
        System.out.printf(
                "SOCSO (0.5%%)\t\t: RM%.2f\n", employee.SOCSO);
        System.out.printf(
                "INCOME TAX(3%%)" + "\t\t: RM%.2f\n", employee.IncomeTax);
        System.out.printf(
                "TOTAL DEDUCTION\t\t: RM%.2f\n", employee.TotalDeduction);
        System.out.println(
                "******************************* NET PAY *******************************");
        System.out.printf(
                "NET PAY\t\t\t: RM%.2f\n", employee.NetPay);
        System.out.println(
                "***********************************************************************");

    }

}
