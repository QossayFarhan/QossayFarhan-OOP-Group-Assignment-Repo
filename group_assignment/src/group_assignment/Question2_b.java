
/**
 * ARRAY COMPARISON CORRECTION
 * 
 * We have two ways to compare arrays either equals()
 * or deepEquals() methods from Arrays class.
 * 
 * @author (RANA MAHAMOUD SAEED - B09200009)
 * @version 1.x
 */

package group_assignment;

//importing array class from java.util package
import java.util.Arrays;

public class Question2_b {
     public static void main (String[] args) 
 {
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
  * using if...else condition along with Arrays.equals method from Arrays class
  * to compare the elements of the arrays.
 */
 if (Arrays.equals(arr1,arr2))
 System.out.println("Yes, They are same");
 else
 System.out.println("No, They are not same");
 
 
 /**
  * DEEP COMPARING.
  */
 
 //creating, declaring and initializing two string arrays to compare.
 String arr3[ ] = {"Java", "Python", "C"};
 String arr4[ ] = {"Java", "Python", "C"};
 
  
 //this statement allow us to create an array of an array that is object reference type.
 Object[] arr31 = {arr3};
 Object[] arr41 = {arr4};
 
 System.out.println("\n\tCOMPARING BETWEEN ARRAY 3 AND ARRAY 4\n");
 System.out.println("Array 3 = "+Arrays.toString(arr3));
 System.out.println("Array 4 = "+Arrays.toString(arr4));
 System.out.println("\nAre ARRAY 3 and ARRAY 4 the same?");
  
 /**
  * using if...else along with Arrays.deepEquals method from Arrays class to 
  * compare the arrays field by field recursively.
 */
 if (Arrays.deepEquals(arr31,arr41))
 System.out.println("Yes, They are same");
 else
 System.out.println("No, they are not same");
 
 
 }
}
