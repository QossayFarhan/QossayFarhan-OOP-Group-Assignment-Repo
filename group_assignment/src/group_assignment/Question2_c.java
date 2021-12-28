/**
 * ARRAY COPYING
 * 
 *  we have 6 different ways of copying arrays as shown in the codes below
 * 
 * @author (RANA MAHAMOUD SAEED - B09200009)
 * @version 1.5
 */

package group_assignment;

import java.util.Arrays;

public class Question2_c {
      public static void main(String[] args) {
        
        System.out.println("\tARRAY COPYING (with applied changes to the original array)\n");
        
         /**
      * Method 1.
      */
         
        /**
         * Using variable Assignment to copy array.
         * 
         */
        
        /**
         * This method has its side effects because any change that happens 
         * to array a can affect array b.  
         * 
         */
        
        //Creating, declaring and initializing array a 
        int a[]= {32, 33, 34, 35, 36,40};
        
        //Creating and declaring array b, and assigning it to array a. 
        //this assignment is wrong because array b will be assigned to array a as a reference
        //therefore, any changes that happen to array a affects array b and vice versa.
        int [] b = a;
       
        //changing the element in index 0 for array a to test changes in array b
        a[0] = 0;
        
        //printing array a using .toString method from Arrays class
        System.out.println("Array a = "+Arrays.toString(a));

        //printing array b using toString method from Arrays class
        System.out.println("Array b = "+Arrays.toString(b));
        
        
        /**
      * Method 2.
      */
        
        /**
         * Using for loop to iterate and copy the elements of 
         * the first array to the second array.
         * 
        */
        
        //Creating, declaring and initializing array c
        int[] c = {44, 46,47,48, 49, 50};
        
        //Creating and declaring array d and initializing it to the length of array c
        int[] d = new int[c.length];
        
        //changing element of array c to test changes in array d
        
        /**
         * ******OBSERVATION*******
         * if we applied changes in this stage we see that the output 
         * of the copied array will be changed too.
         * to be continued.
         */
         c[0] = 0;
        
        //using for loop,where its second condition, i is to be less than the size of array d,
        //to be able to iterate and copy each element from array c to d
        for (int i = 0; i<d.length; i++){
            
            //elements of array d and array c are equal.
            d[i]=c[i];
        }
        
        /**
         * continuation.. if we applied changes to array c in this stage, then array d 
         * won't go through changes, it will maintain the first elements
         * of array c.
         */
        
        //printing array c using toSting method from Arrays class
        System.out.println("\nArray c = "+Arrays.toString(c));
        
        //printing array d using toSting method from Arrays class
        System.out.println("Array d  = "+Arrays.toString(d));
        
     /**
      * Method 3.
      */
     
    
    /**
     * Using clone method to copy array is the most basic and effective way 
     * to copy any arrays.
     * 
     */
    
    //Creating, declaring and initializing array e
    int [] e = {55, 54, 56, 58, 59, 60};
    
    //creating and declaring array f and initializing it to array e using .clone() and this 
    //method is to copy the elements of the original array to the copied array
    //instead of referring to it. therefore any changes happen to any array won't affect the other.
    int []f = e.clone();
    
    //changing element of array e to test changes in array f
    e[0] = 0;
    
    //printing array e using toString method from Arrays class
    System.out.println("\nArray e = "+Arrays.toString(e));
    
    //printing array f using toString method from Arrays class
    System.out.println("Array f = "+Arrays.toString(f));
   
    
     /**
      * Method 4.
      */
     
    /**
     * Using arraycopy() method from System class to copy arrays.
     * 
     */
    
    //Creating, declaring and initializing array e
    int[] g = {62, 64, 66, 68, 69, 70};
    
    //Creating and declaring array d and initializing it's length to the length of array g
    int [] h = new int [g.length];
    
    /**using System.arraycopy to copy elements of array g to array h
    *this method has 5 parameters where the first parameter is the original array
    *and the second parameter is the number of index to start copying from
    *the third parameter is the copied array
    *the fourth parameter is the number of index to store the copied elements
    *the fifth parameter is the length of the number of elements to be copied.
    */
    System.arraycopy(g, 0, h, 0, g.length);
    
    //applying changes array g to test array h
    g[0] = 0;
    
    //print array g using toString method from Arrays class
    System.out.println("\nArray g = "+Arrays.toString(g));
    
    //print array h using toString method from Arrays class
    System.out.println("Array h = "+Arrays.toString(h));
    
     /**
      * Method 5.
      */
     
    /**
     * Using copyof() method from Arrays class to copy arrays.
     * 
     */
    
    //Creating, declaring and initializing array j
    int [] j = {22, 24, 26, 28, 29, 30};
    
    //Creating and declaring array k and using Arrays.copyof to copy the elements
    //of array j to array k.
    //This method has two parameters, the first parameter is the original array 
    //and the second parameter is the number of elements to be copied.
    int k[] = Arrays.copyOf(j,6 );
    
    //applying changes in array j to test if array k will be affected
    j[0] = 0;
    
    //print array h using toString method from Arrays class
    System.out.println("\nArray j = "+Arrays.toString(j));
    
    System.out.print("Array k = [ ");
    
    //using enhanced for loop to print the elements of array k.
    for(int num : k){
        System.out.print(num + " ");
    }
    System.out.print("]");
   
      /**
      * Method 6.
      */   
      
    /**
     * Using .copyOfRange() method from Arrays class to copy arrays.
     * 
     */
    
     //Creating, declaring and initializing array j
    int [] m = {1, 3, 5, 7, 9, 10};
    
    //Creating and declaring array n and using .copyOfRange() method to copy
    //the elements of array m to array n.
    //this method has three parameters, first one being the original array
    //the second being the number of indexes to copy from
    //and the third parameter is the number of elements to copy.
    int [] n = Arrays.copyOfRange(m, 0, 6);
    
    //applying changes to array m to observe changes in array n
    m[0] = 0;
    
    //print array h using toString method from Arrays class
    System.out.println("\n\nArray m = "+Arrays.toString(m));
    
    System.out.print("Array n = [");
    
    //using enhanced for loop to print the copied array
    for(int numbers : n){
        System.out.print(numbers + " ");
    }
              System.out.println("]");
    }

     
      
    }
    

