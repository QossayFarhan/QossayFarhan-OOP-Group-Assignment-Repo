/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainFrontend;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBaseConnection {
        
    //public static void WriteBestwrost() throws FileNotFoundException{
    public static void BestWorstWrite(boolean FullTime, String Name, int TotalWorkingHours, boolean Late, int LateDays) throws IOException {
        try {
            FileWriter fw = new FileWriter("C:\\QossayFarhan-OOP-Group-Assignment-Repo\\PartB\\src\\MainFrontend\\mydata.txt", true);//making file
            PrintWriter pw = new PrintWriter(fw);
            pw.print(FullTime+","+Name+","+TotalWorkingHours+","+Late+","+LateDays+"\n");
            pw.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
    
    public static String BestRead() throws IOException {
        String line;
        String Name = "None";
        int Max = -1;    
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\QossayFarhan-OOP-Group-Assignment-Repo\\PartB\\src\\MainFrontend\\mydata.txt"))) {
            while ((line = br.readLine()) != null) {
                String[] res = line.split(",");
                int Hours = Integer.parseInt(res[2]);
                if ("true".equals(res[0].trim())&& Hours > Max && "false".equals(res[3].trim())){
                    Max = Hours; 
                    Name = res[1].trim();
                }               
                
            }
        }
        return Name;
    }
    
    
    public static String WorstRead() throws IOException {
        String line;
        String Name = "None";
        int Min = 360;
        int LateDays = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\QossayFarhan-OOP-Group-Assignment-Repo\\PartB\\src\\MainFrontend\\mydata.txt"))) {
            while ((line = br.readLine()) != null) {
                String[] res = line.split(",");
                int Hours = Integer.parseInt(res[2]);
                int Days = Integer.parseInt(res[4]);
                if ("true".equals(res[0].trim())&& Hours < Min && "true".equals(res[3].trim()) && Days >LateDays){
                    LateDays = Days;
                    Min = Hours; 
                    Name = res[1].trim();
                }               
                
            }
        }
        return Name;
    }
}
   