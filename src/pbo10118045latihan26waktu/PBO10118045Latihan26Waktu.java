/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan26waktu;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 
 * Nama     :   Muhammad Ilham Apriyadi
 * Kelas    :   IF 2
 * NIM      :   10118045
 * Deskripsi Program : Program menampilkan waktu saat ini
 */
public class PBO10118045Latihan26Waktu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date date = new Date( );
        SimpleDateFormat tgl = new SimpleDateFormat ("EEE',' dd MMM yyyy hh:mm:ss ");
        
        System.out.println("Hari ini adalah hari : " + tgl.format(date));
    }
    
}
