
package group_assignment;

import java.util.Arrays;


public class Question2 {

     public static void main(String[] args) {
        
        System.out.println("\tARRAY COPYING");
        
        //using variable Assignment to copy array
        
        int a[]= {32, 33, 34, 35, 36,40};
        int [] b =a;
        b[0]++;
        System.out.print("Array b from a = ");
        printArray(b);
        
        
        // using iterating to copy array
        
        int[] c = {44, 46,47,48, 49, 50};
        int[] d = new int[c.length];
        
        for (int i = 0; i<d.length; i++){
            d[i]=c[i];
        }
        System.out.print("Array d from c = ");
        printArray(d);
    
    
    //using clone to copy array
    
    int [] e = {55, 54, 56, 58, 59, 60};
    int []f = e.clone();
    
    System.out.print("Array f from e = ");
    printArray(f);
    
    // using Array copy
    
    int[] g = {62, 64, 66, 68, 69, 70};
    int [] h = new int [g.length];
    System.arraycopy(g, 0, h, 0, h.length);
    
    System.out.print("Array h from g = ");
    printArray(h);
    
    //using copyof() to copy arrays
    
    int [] j = {22, 24, 26, 28, 29, 30};
    int k[] = Arrays.copyOf(j,6 );
    System.out.print("Array k from j = [ ");
    for (int i = 0; i < k.length; i++){
        
            System.out.print(k[i] + " ");
    }
            System.out.print("] ");
    }

      public static void printArray(int[] a) {
      System.out.print("[ ");
      for (int i = 0; i < a.length; i++) {
         System.out.print(a[i] + " ");
      }
      System.out.println("]");
      
    }
    
}
