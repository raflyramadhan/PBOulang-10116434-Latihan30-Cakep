/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116434.latihan19.saldotabungan;

/**
 *
 * @author YM
 */
import java.util.Scanner;
public class PBOUlang10116434Latihan19Saldotabungan {

    
    static int saldoAkhir;
 static void hitung(int a, int b){
  saldoAkhir = (a + (a*b/100));
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            int saldoAwal;
            int bunga;
            int lamaMenabung;
            int banyakBulan;
    
    Scanner in = new Scanner(System.in);
            System.out.print("Masukkan saldo awal= ");
            saldoAwal = in.nextInt();
            System.out.print("Masukkan bunga (dalam %)= ");
            bunga = in.nextInt();
            System.out.print("Masukkan lama menabung (dalam bulan)= ");
            banyakBulan = in.nextInt();
            System.out.println("");
            System.out.println("------------------------------------------------------------------------");
            
  
  
            for (lamaMenabung=1; lamaMenabung<=banyakBulan; lamaMenabung++) {
   hitung(saldoAwal,bunga);
   
     
   System.out.println("Saldo di bulan ke "+lamaMenabung);
   System.out.println("Saldo akhir anda adalah= "+saldoAkhir);
   saldoAwal = saldoAkhir;
    
    }
    
    }
}
