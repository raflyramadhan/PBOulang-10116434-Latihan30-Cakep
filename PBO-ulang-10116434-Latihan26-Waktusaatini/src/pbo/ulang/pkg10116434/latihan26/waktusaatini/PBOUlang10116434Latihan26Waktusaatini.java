/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116434.latihan26.waktusaatini;
import java.util.Date;  
import java.text.DateFormat;  
import java.text.SimpleDateFormat;
/**
 *
 * @author YM
 */
public class PBOUlang10116434Latihan26Waktusaatini {

    /**
     * @param args the command line arguments
     */
    
    private String getTanggal() {  
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");  
        Date date = new Date();  
        return dateFormat.format(date);  
    }  
     
    private String getWaktu() {  
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");  
        Date date = new Date();  
        return dateFormat.format(date); 
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        PBOUlang10116434Latihan26Waktusaatini tgl = new PBOUlang10116434Latihan26Waktusaatini();  
        System.out.println("Sekarang tanggal : "+tgl.getTanggal()); 
        System.out.println("Waktu sekarang : "+tgl.getWaktu());
        
        
        
    }
    
}
