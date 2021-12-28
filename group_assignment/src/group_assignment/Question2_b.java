
/**
 * ARRAY COMPARISON CORRECTION
 * 
 * In this project we have different methods to compare arrays.
 * 
 * @author (RANA MAHAMOUD SAEED - B09200009)
 * @version 1.3
 */

package group_assignment;

//importing array class from java.util package to get access to its methods
import java.util.Arrays;

public class Question2_b {
     public static void main (String[] args) 
 {
     /**
      * Method 1.
      */
     
 //creating, declaring and initialzing two arrays with same elements to compare
 int arr1[ ] = {34, 54, 90, 45, 89, 42, 88, 22, 19, 49};
 int arr2[ ] = {34, 54, 90, 45, 89, 42, 88, 22, 19, 49};
 
 
 //printing headlines and arrays.
 System.out.println("\tARRAY COMPARISON\n");
 System.out.println("\tCOMPARING BETWEEN ARRAY 1 AND ARRAY 2\n");
  System.out.println("Array 1 = "+Arrays.toString(arr1));
 System.out.println("Array 2 = "+Arrays.toString(arr2));
 System.out.println("\nAre ARRAY 1 and ARRAY 2 the same?");
 
 
 /**
  * using if...else condition along with Arrays.equals method
  * to compare the elements of the arrays and to print a certain statement
  * if the condition applies or to print another
  * statement if the condition doesn't apply
 */
 if (Arrays.equals(arr1,arr2))
     //print statement if true
 System.out.println("Yes, They are same");
 else
     //print statement if false
 System.out.println("No, They are not same");
 
 
 /**
      * Method 2.
      */
 
 /**
  * To deep compare, we first create an array of array that is of object
  * reference type and then we an be able to use the deepEquals() 
  * method from Arrays class.
  */
 
 //creating, declaring and initializing two string arrays to compare.
 String arr3[ ] = {"Java", "Python", "C"};
 String arr4[ ] = {"Java", "Python", "C"};
 
  
 //this statement creates an array of an array that is object reference type.
 Object[] arr31 = {arr3};
 Object[] arr41 = {arr4};
 
 //printing headline
 System.out.println("\n\tCOMPARING BETWEEN ARRAY 3 AND ARRAY 4\n");
 System.out.println("Array 3 = "+Arrays.toString(arr3));
 System.out.println("Array 4 = "+Arrays.toString(arr4));
 System.out.println("\nAre ARRAY 3 and ARRAY 4 the same?");
  
 /**
  * using if...else statement along with Arrays.deepEquals method to 
  * compare the arrays of object reference type; field by field recursively.
 */
 if (Arrays.deepEquals(arr31,arr41))
     //statement to be printed if condition returns true
 System.out.println("Yes, They are same");
 else
      //statement to be printed if condition returns true
 System.out.println("No, They are not same");
 
 
 /**
      * Method 3.
      */
 /**
  * This method is called the naive approach and is used to compare arrays
  * using if..else condition but for the else condition we will have a
  * for loop and an if condition within the loop.
  * 
  */
 
      //creating, declaring and initializing two integer arrays to compare.
        int z[] = {12, 13, 14, 15};
        int y[] = {12, 13, 14, 15};
        
    //printing headlines
         System.out.println("\n\tCOMPARING BETWEEN ARRAY z AND ARRAY y\n");
         System.out.println("Array z = "+Arrays.toString(z));
         System.out.println("Array y = "+Arrays.toString(y));
         System.out.println("\nAre ARRAY z and ARRAY y the same?");
        
         //using if...else condition
         
         //here, we have if statement where its condition is to check if 
         //the size of array z and array y are not equal and to print a certain 
         //output incase of the arrays being not equal.
        if (z.length != y.length)
  
            System.out.println("No, They are not same");
        
        //else statement that has a for loop within
        else {
            //for loop where the second condition, i is to be less than the size of array z
            for (int i = 0; i < z.length; i++)
            {   
                // if statement to compare each and every element in both arrays
                if (z[i] != y[i])
                {
                    //printing statement
                    System.out.println("No, They are not same");
                    //exiting system at 0 to print 1 time only.
                    System.exit(0);
                }
            }
            //printing the following statement if the above conditions didn't match
            System.out.println("Yes, They are same");
        
    }
        /**
      * Method 4.
      */
        
        /**
         * using boolean to compare arrays as well as .equals() method from Arrays class which will 
         * compare the elements of first array to the second array.
         * 
         */
      
        //creating, declaring and initializing two string arrays to compare.
      String[] flavour1 = {"Chocolate", "Strawberry", "Vanilla", "Toffee"};
      String[] flavour2 = {"Chocolate", "Strawberry", "Vanilla", "Toffee"};

      //printing headlines
         System.out.println("\n\tCOMPARING BETWEEN ARRAY flavour1 AND ARRAY flavour2\n");
         System.out.println("Array flavour1 = "+Arrays.toString(flavour1));
         System.out.println("Array flavour2 = "+Arrays.toString(flavour2));
    
    //declaring result of boolean data type     
   boolean result;
   
   //result will return either true or false for the comparing of the first and second arrays
   result = Arrays.equals(flavour1, flavour2);
 
   //printing statement with result
   System.out.println("\nIs flavour 1 equal to flavour 2? \n" + result);
 
   
   /**
      * Method 5.
      */
  /**
   * Using boolean to compare arrays but in a
   * different approach than the previous one mentioned.
   * 
   */
  
  //creating, declaring and initializing two integer arrays to compare.
   char [] e ={'a', 'b','c','d'};
   char [] f ={'a', 'b','c','d'};
   
   //printing headlines and arrays
         System.out.println("\n\tCOMPARING BETWEEN ARRAY e AND ARRAY f\n");
         System.out.println("Array e = "+Arrays.toString(e));
         System.out.println("Array f = "+Arrays.toString(f));
         System.out.println("\nAre ARRAY e and ARRAY f the same?");
         
   //using if statement where its condition is if the result is true to print a certain statement       
   if(result(e,f)){
       System.out.println("Yes, They are same");
   }
   //else statement to print a certain statement if the result return false
   else{
       System.out.println("No, They are not same");
   }
   }
     //here, we created a method namely result that is a boolean data type
     //with two parameters that are arrays e and f, 
     //this method returns true if both arrays are equal
     //and returns false otherwise.
     public static boolean result(char []e, char []f){
         
        //if statement where its condition is to check if the sizes of both arrays are equal 
        // or not and to return false if they are not equal
         if (e.length!=f.length){
             return false;
         }
         //for loop where its second condition, x is to be less than the size of array f
             for (int x=0; x<f.length;x++){
                 //if statement to compare between the elemnts of both arrays an to return false if 
                 //the elements are not equal
                 if (e[x] != f[x]){
                     return false;
                 }
             }
             //this returns true if the above conditions did not match.
             return true;
     }
    }
     
      
    

 
