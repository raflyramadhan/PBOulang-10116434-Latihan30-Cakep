/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116434.latihan22.perhitunganlingkaran;

/**
 *
 * @author YM
 */
import java.util.Scanner;
public class PBOUlang10116434Latihan22Perhitunganlingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int jarijari;
   double luas;

   Scanner scan = new Scanner(System.in);
   System.out.println("Menghitung Luas Lingkaran");
   System.out.print("Masukan Jari-Jari: ");
   jarijari = scan.nextInt();
 
   luas = 3.14 * (jarijari * jarijari);
   System.out.println("Luas Lingkaran= " +luas);
        
    }
    
}
