/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;
public class Praktikum_arraymultidimensi2 {
    
    int nis [][] = {{210651},{210655},{210652}}; 
    String nama [][] = {{"Ade"},{"Galih"},{"Baihaqi"}};
    
    public static void main (String[]args){
        Praktikum_arraymultidimensi2 siswa = new Praktikum_arraymultidimensi2();
        siswa.tampil();
        siswa.namanis(); 
    }
    
    public void tampil(){
        System.out.println("Identitas Siswa Angkatan 24");
    }
    
    public void namanis (){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 1; j++){
                System.out.println(nama[i][j]+":"+nis[i][j]);
               
            }
        }
    }
}
   