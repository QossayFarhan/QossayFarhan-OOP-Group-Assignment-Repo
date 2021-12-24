
package MainFrontend; 

import Myclasses.*;
import javax.swing.JOptionPane;

public class MyFrontend {
    public static void main(String[] args) {
        
        //Parametrs for control statments  
        boolean repeat;
        String input;
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
            repeat = false ;
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
                JOptionPane.showMessageDialog(null, position + " is not applicable for " + Timer, "Error", JOptionPane.ERROR_MESSAGE);
                int choice = JOptionPane.showConfirmDialog(null, "Would You Like To Choose Your Job Designation Again?", "Please Choose", JOptionPane.YES_NO_OPTION);
                if (choice == 0) {
                    position = Job.Desig();
                }
                repeat = true;
            }
        } while (repeat == true);
        
        
        //create an object based on the correct class that has been chosen by user(position)
        Employee employee = null ;
        switch (position) {
            case "Manager":{
                employee = new Manager(department,noStaff,name,position,Timer);
                    break;
                }
            case "Assistant Manager":{
                employee = new AssistantManager(department,noStaff,name,position,Timer);
                    break;
                }
            case "Supervisor":{
                employee = new Supervisor(department,noStaff,name,position,Timer);
                    break;
                }
            case "Executive":{
                employee = new Executive(department,noStaff,name,position,Timer);
                    break;
                }
            case "Promoters":{
                employee = new Promoter(department,noStaff,name,position,Timer);
                    break;
                }
            case "Telemarketers":{
                employee = new Telemarketer(department,noStaff,ID,name,position,Timer);
                    break;
                }
            default:
                break;
        }
        employee.SetPrice();
        System.out.println(employee.PriceHour);
        employee.GenerateID(ID);
        System.out.println(employee.ID);
        System.out.println(employee.getClass());

            
        }
        
        
}
        
        
        
        
        
        
    
