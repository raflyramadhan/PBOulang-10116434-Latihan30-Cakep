/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116434.latihan30.cakep;
import java.util.Scanner;
/**
 *
 * @author YM
 */
public class PBOUlang10116434Latihan30Cakep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String cakep;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Kamu ngerjain sendiri latihan 17 sampai latihan 30 ini?"
                +
                " Jawab (YOI/ENGGAK): ");
        cakep = scan.nextLine();

        switch(cakep){
            case "YOI":
                System.out.println("Cakep Bener. Good Job");
                break;
            case "ENGGAK":
                System.out.println("Tetep cakep sih!");
                break;
            default:
                System.out.println("Kata tidak dikenal!");
        
    }
    
}
}