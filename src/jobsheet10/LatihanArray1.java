/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;
import java.util.Scanner;
public class LatihanArray1 {
    public static void main(String[] args) {
       
        Scanner scanner=new Scanner(System.in);
        double ratarata = 0.0; 
        int nilai [] = new int [3]; 
        nilai [0] = 70; 
        nilai [1] = 80; 
        nilai [2] = 65; 

        for (int i=0; i<nilai.length; i++)ratarata+=nilai [i]; 
        ratarata/=nilai.length;
        System.out.println("rata rata = "+ ratarata);

            
    } 
} 
 

    

