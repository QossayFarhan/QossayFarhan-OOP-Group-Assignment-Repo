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
            pw.print(FullTime+", "+Name+", "+TotalWorkingHours+", "+Late+", "+LateDays+"\n");
            pw.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
   