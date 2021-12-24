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
         * Using variable Assignment to copy array...
         * 
         */
        
        /**
         * this method has its side effects because any change that happens 
         * to array a can affect array b
         * 
         */
        
        //Creating, declaring and initializing array a 
        int a[]= {32, 33, 34, 35, 36,40};
        //Creating, declaring array b and initializing it to array a
        int [] b = a;
       
        //changing the element in index 2 for array a to test the changes in array b
        a[0] = 0;
        
        //printing array a using toString method from Arrays class
        System.out.println("Array a = "+Arrays.toString(a));

        //printing array b using toString method from Arrays class
        System.out.println("Array b = "+Arrays.toString(b));
        
        
        
        /**
         * Using iterating to copy array....
        */
        
        //Creating, declaring and initializing array c
        int[] c = {44, 46,47,48, 49, 50};
        
        //Creating and declaring array d and initializing it to the length of array c
        int[] d = new int[c.length];
        
        //changing element of array c to test changes in array d
        
        /**
         * if we applied changes in this stage we see that the output 
         * of array d will be changed too. to be cont.
         */
         c[0] = 0;
        
        //using for loop to iterate and copy each element
        for (int i = 0; i<d.length; i++){
            d[i]=c[i];
        }
        
        /**
         * cont.. if we applied changes to array c in this stage, then array d 
         * won't go through changes, it will maintain the first elements
         * of array c.
         */
        
        //printing array c using toSting method from Arrays class
        System.out.println("\nArray c = "+Arrays.toString(c));
        
        //printing array d using toSting method from Arrays class
        System.out.println("Array d  = "+Arrays.toString(d));
        
    
    
    /**
     * Using clone to copy array...
     * 
     */
    
    //Creating, declaring and initializing array e
    int [] e = {55, 54, 56, 58, 59, 60};
    
    //creating and declaring array f and initializing it to array e using .clone()
    int []f = e.clone();
    
    //changing element of array e to test changes in array f
    e[0] = 0;
    
    //printing array e using toString method from Arrays class
    System.out.println("\nArray e = "+Arrays.toString(e));
    
    //printing array f using toString method from Arrays class
    System.out.println("Array f = "+Arrays.toString(f));
   
    
    
    /**
     * Using arraycopy...
     * 
     */
    
    //Creating, declaring and initializing array e
    int[] g = {62, 64, 66, 68, 69, 70};
    
    //Creating and declaring array d and initializing it to the length of array g
    int [] h = new int [g.length];
    
    //using System.arraycopy to copy elements of array g to array h
    System.arraycopy(g, 0, h, 0, h.length);
    
    //applying changes array g to test array h
    g[0] = 0;
    
    //print array g using toString method from Arrays class
    System.out.println("\nArray g = "+Arrays.toString(g));
    
    //print array h using toString method from Arrays class
    System.out.println("Array h = "+Arrays.toString(h));
    
    
    /**
     * Using copyof() to copy arrays...
     * 
     */
    
    //Creating, declaring and initializing array j
    int [] j = {22, 24, 26, 28, 29, 30};
    
    //Creating and declaring array k and using Arrays.copyof to copy the elements
    //of array j to array k
    int k[] = Arrays.copyOf(j,6 );
    
    //applying changes array j to test array k
    j[0] = 0;
    
    //print array h using toString method from Arrays class
    System.out.println("\nArray j = "+Arrays.toString(j));
    
    System.out.print("Array k = [ ");
    
    //using for loop to iterate and print the elements of array k
    for (int i = 0; i < k.length; i++){
        
            System.out.print(k[i] + " ");
    }
            System.out.println("] ");
            
            
            
    /**
     * Using Arrays.copyOfRange() to copy arrays...
     * 
     */
    
     //Creating, declaring and initializing array j
    int [] m = {1, 3, 5, 7, 9, 10};
    
    //Creating and declaring array k and using Arrays.copyOfRange to copy
    //the elements of array m to array n.
    int [] n = Arrays.copyOfRange(m, 0, 6);
    
    //applying changes to array m to observe changes in array n
    m[0] = 0;
    
    //print array h using toString method from Arrays class
    System.out.println("\nArray m = "+Arrays.toString(m));
    
    System.out.print("Array n from m = [");
    
    //using for loop to iterate and print the elements of array n
    for (int i = 0; i < n.length; i++){
             System.out.print(n[i] + " ");
    }
              System.out.println("]");
    }

     
      
    }
    

