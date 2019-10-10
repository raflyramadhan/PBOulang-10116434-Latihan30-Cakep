/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116434.latihan28.gantikata;

/**
 *
 * @author YM
 */
import java.util.Scanner;
public class PBOUlang10116434Latihan28Gantikata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
        Scanner in = new Scanner(System.in);
        String text, cari, ganti;
        System.out.print("Masukan teks: ");
        text = in.nextLine();
        System.out.print("Ganti kata: ");
        cari = in.nextLine();
        System.out.print("Menjadi kata: ");
        ganti = in.nextLine();
        System.out.println("Kalimat baru: "+text.replace(cari, ganti));
    
    }
    
}
