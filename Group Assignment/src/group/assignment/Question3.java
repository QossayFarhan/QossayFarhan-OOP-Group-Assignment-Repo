/*
 * Question 3 (Integer Inputs)
 * 
 * This program will acquire integer inputs and display the largest 
 * and smallest numbers and the number and summation of prime numbers.
 * Type 0 to finish.
 * @ Qossay Abuamriya B02210014
 * version 1.3 
 */
package group.assignment;
    
    //Using Util.Scanner library to allow user to key in values from terminal   
    import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        
        // Declare all the needed variables for this program 
        int Number;
        int Sentinel = 0; 
        int count = 0;
        int max = -2147483648 , min = 2147483647 ; // using the max and min int values as defaults 
        int primeCount = 0 , primeTotal = 0, numCheck ; 

        // Start an infinte loop to input the integers
        while ( true ) { 
            System.out.print("? ");
            // Create an input object to allow user to key in values 
            Scanner input = new Scanner(System.in);
            Number = input.nextInt();
            
            //Check if first input is the sentinel value
            if (Number == Sentinel && count == 0){
               System.out.println("You have entered the sentinel value first (No values have been entered) !");
               break;
            }
            
           //Check if the number equals the sentinel value but dont have minimum 2 intgers.
            else if (Number == Sentinel && count < 2){
                System.out.println("You should have at least 2 inputs. Please key in again");  
            }
            
            //Check if the number equals the sentinel value and have minimum 2 intgers.
            //If yes: show outputs and break 
            else if (Number == Sentinel && count >= 2){
               // Program outputs 
               System.out.println("Number of input values       = "+count);
               System.out.println("Largest number               = "+max);
               System.out.println("Smallest number              = "+min);    
               System.out.println("Number of prime number(s)    = "+primeCount);
               System.out.println("Total of prime number(s)     = "+primeTotal);
               break; 
            }
            
            else {
            // Counter to count the the number of entered integers  
            count += 1;
            
            
            // Determine max and min values 
            if (Number > max ){
                max = Number ; 
                }
            if ( Number < min ){
                min = Number ;    
            }
            
            // Check if number is integer 
            numCheck = Number ;
            for (int i = 2; i<= numCheck/2; i++) 
            {
                if ((numCheck % i) == 0){
                    
                }
            }
        
    
    }
}
}
}
