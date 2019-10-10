/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116434.latihan17.programtunjangan;

/**
 *
 * @author YM
 */
import java.util.Scanner;
public class PBOUlang10116434Latihan17Programtunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nama,nik,bagian;
        byte gol,hari;
    int potongan,gapok,transport,total,gaji;
   Scanner in = new Scanner(System.in);
    System.out.println ("    INPUT GAJI KARYAWAN    ");
    System.out.println ("==============================");
   
    System.out.print ("Masukkan Nama : ");
    nama = in.nextLine();
   
    System.out.print ("Masukkan NIK : ");
    nik = in.nextLine();
   
    System.out.print ("Masukkan Bagian : ");
    bagian = in.nextLine();
   
    System.out.println ("Golongan Karyawan : \n 1.A \n 2.B \n 3.C" );
    System.out.print ("Masukkan Pilihan : ");  
    gol = in.nextByte();
   
    System.out.print ("Masukkan Jumlah Hari Masuk : ");
    hari = in.nextByte();
    transport = hari*25000;
   
    System.out.println ("\n==========================");
    System.out.println ("Nama : "+nama);
    System.out.println ("NIK : "+nik);
    System.out.println ("Bagian : "+bagian);
    System.out.println ("Golongan : "+gol);
   
    switch (gol) {
            case 1:
                gapok = 3000000;
                potongan = gapok*5/100;
                gaji = gapok-potongan;
                total = gaji+transport;
                System.out.println ("Tunjangan Transport : "+transport);
                System.out.println ("Gaji Pokok : "+gapok);
                System.out.println ("Potongan Asuransi : "+potongan);
                System.out.println ("Gaji Bersih : "+total);
                break;
            case 2:
                gapok = 2500000;
                potongan = gapok*3/100;
                gaji = gapok-potongan;
                total = gaji+transport;
                System.out.println ("Tunjangan Transport : "+transport);
                System.out.println ("Gaji Pokok : "+gapok);
                System.out.println ("Potongan Asuransi : "+potongan);
                System.out.println ("Gaji Bersih : "+total);
                break;
            case 3:
                gapok = 2000000;
                total = gapok+transport;
                System.out.println ("Tunjangan Transport : "+transport);
                System.out.println ("Gaji Pokok : "+gapok);
                System.out.println ("Gaji Bersih : "+total);
                break;
            default:
                System.out.println ("pilihan golongan tidak sesuai, silahkan input ulang!!");
                break;
    }
    
    }
}
