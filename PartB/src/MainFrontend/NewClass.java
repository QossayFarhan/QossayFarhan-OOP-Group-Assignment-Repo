/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainFrontend;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Qossay Abuamriya
 */
public class NewClass {
    public static void main(String[] args) throws IOException {
       String line;
        String Name = "None";
        int Max = -1;    
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\QossayFarhan-OOP-Group-Assignment-Repo\\PartB\\src\\MainFrontend\\mydata.txt"))) {
            while ((line = br.readLine()) != null) {
                String[] res = line.split(",");
//                System.out.println("res"+ Arrays.toString(res));
//                System.out.println("late"+ res[3].trim()+">");
                int Hours = Integer.parseInt(res[2]);
                if ("true".equals(res[0].trim())&& Hours > Max && "false".equals(res[3].trim())){
                    Max = Hours; 
                    Name = res[1].trim();
                }               
                
            }
            System.out.println(Name);
        }
}   }
