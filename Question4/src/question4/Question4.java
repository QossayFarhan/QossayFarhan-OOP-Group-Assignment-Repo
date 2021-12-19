/*
Program Name: Trigonometry Calculator
    Description: This Program finds the angle of a triangle based on 2 numerical inputs by the user and the function selected by the user
@author (Luke Patrick Llanto Vasuqez - B05210002)
@version 1.2 
*/
package Question4;
import java.lang.Math;
import javax.swing.JOptionPane;

public class Question4 {
    public static void main(String[] args) {
        char in1 ='n', in2 ='n',in3 = 'n',rep='n',in4='n';
        double x=0,y=0,angle=0,bop=0,triang=0;
        int i=0;
        String triangle="a", funchoice="a";
        
        do{
        //First input is read from user, then is checked to see whether input is an integer. Else throw exception
        do{
        String a1 = JOptionPane.showInputDialog(null,"Please Enter a Double Value for Adjacent Length X","Input",JOptionPane.QUESTION_MESSAGE);
        try{ //the try statement allows a line of code to be tested for errors while being executed
            x = Double.parseDouble(a1);
            in1 = 'n';
        }catch(NumberFormatException e){ //the catch statement allows a followup code to be execute only if an error is detected in the try statement
            JOptionPane.showMessageDialog(null, "INPUT IS INVALID, PLEASE TRY AGAIN!","ERROR",JOptionPane.ERROR_MESSAGE);
            in1 = 'y';
        }
        }while(in1 == 'y');
        
        
        //Second input is read from user, then is checked to see whether input is an integer. Else throw exception
        do{
        String a2 = JOptionPane.showInputDialog(null,"Please Enter a Double Value for Opposite  Length Y","Input",JOptionPane.QUESTION_MESSAGE);
        try{
            y = Double.parseDouble(a2);
            in2 = 'n';
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "INPUT IS INVALID, PLEASE TRY AGAIN!","ERROR",JOptionPane.ERROR_MESSAGE);
            in2 = 'y';
        }
        }while(in2 == 'y');
        
        
        //This operation calculates the Hypotenuse of the triangle
        double z = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        double zround = Math.round(z*100.0)/100.0;
        
        
        //This windows asks the user which trigonometric function to use 
        do{
        String a3 = JOptionPane.showInputDialog(null,"Please Select 1 of the Functions to Use: \n1)SinΘ\n2)CosΘ\n3)TanΘ","Input",JOptionPane.QUESTION_MESSAGE);
        try{
            i = Integer.parseInt(a3);
            if(i>3 || i<1) //This line check to make sure that the input is within a certain range 
                throw new NumberFormatException();
            in3 = 'n';
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "INPUT IS INVALID, PLEASE TRY AGAIN!","ERROR",JOptionPane.ERROR_MESSAGE);
            in3 = 'y';
        }
        }while(in3 == 'y');
        
        
        switch(i){ //The switch case here uses the corresponding function based on the user's choice
            case 1:
                funchoice ="SinΘ";
                bop = (y/z);
                double sin = Math.asin(y/z);
                angle = Math.toDegrees(sin);
                break;
                
            case 2:
                funchoice ="CosΘ";
                bop = (x/z);
                double cos = Math.acos(x/z);
                angle = Math.toDegrees(cos);
                break;
                
            case 3:
                funchoice ="TanΘ";
                bop = (y/x);
                double tan = Math.atan(y/x);
                angle = Math.toDegrees(tan);
                break;
        }
        
        //This Lines of code rounds the values to their necessary places
        bop = Math.round(bop *10000.0)/10000.0;
        angle = Math.round(angle *100.0)/100.0;
        triang = Math.round(angle *1.0)/1.0;
        
        
        //This Line of code determines whether the traingle is an Right Isoceles, Isoceles or Not
        if(x==y && triang ==45.0)
            triangle ="Right Isosceles Triangle";
        else if (x==y)
            triangle = "Isosceles Triangle";
        else
            triangle ="Scalene Triangle";
            
        
        //This line of code prints everything 
        JOptionPane.showMessageDialog(null,"Adjacent Side: "+x+"\nOpposite Side: "+y+"\nHypotenuse: "+zround+"\nTrigonometry Function Chosen: "+funchoice+"\nThe value of "+funchoice+" = "+bop+"\nThe angle of Θ = "+angle+"\nType of Triangle: "+triangle,"Trigonometry Calculator", JOptionPane.INFORMATION_MESSAGE);
        
        //This lines of code ask the user if they would like to use the program  again
        do{
        String a4 = JOptionPane.showInputDialog(null,"Would you like to use the Trigonometry Calculator Again?\nPlease Input Y/N","Input",JOptionPane.QUESTION_MESSAGE);
        char choice = a4.charAt(0);
        in4='n';
        
        if(choice =='y' || choice =='Y')
            rep ='y';
        else if (choice =='n' || choice =='N')
            rep ='n';
        else {
            JOptionPane.showMessageDialog(null, "INPUT IS INVALID, PLEASE TRY AGAIN!","ERROR",JOptionPane.ERROR_MESSAGE);
            in4='y';
        }}while(in4=='y');
        }while(rep=='y');
        
        
        JOptionPane.showMessageDialog(null, "Thank You For Using Luke's Trigonometry Calculator!","Thank You :)",JOptionPane.INFORMATION_MESSAGE);
    }
}


