
/**
 * ARRAY COMPARISON
 * 
 *   finding the issue on why the output is in such a way.
 * 
 * @author (RANA MAHAMOUD SAEED - B09200009)
 * @version 1.x
 */

package group_assignment;


public class Question2_a {
    
    public static void main(String[] args) {
        
        int arr1[ ] = {34, 54, 90, 45, 89, 42, 88, 22, 19, 49};
        int arr2[ ] = {34, 54, 90, 45, 89, 42, 88, 22, 19, 49};
 
           if (arr1 == arr2) 
           System.out.println("Same");
           else
           System.out.println("Not same");
 
      arr1 = new int[5];
      System.out.println("arr1[4] is " + arr1[4]);
      System.out.println("arr2[4] is " + arr2[4]);
 }

/**
 * the output displays
 *                    "Not Same
 *                     arr1[4] is 0
 *                     arr2[4] is 89"
 * 
 * the output is in such a way because for the first part it is
 * comparing the two arrays as references for two different objects 
 * therefore they're not the same.
 * 
 * for the second part it says that arr1[4] is 0 because we reinitialized arr1
 * using the syntax arr1 = new int[5];
 * and since its elements were not declared, it is declared as 0 by default.
 * 
 * 
 */
    }
  