/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan6.kambingstatic;

/**
 *
 * @author Aditya
 * NAMA     : Aditya Nur Iskandar
 * KELAS    : PBO2/IF2
 * NIM      : 10117070
 * Deskripsi Program : Program ini berisi program untuk Mengetahui variabel
 * Static dan Konstanta
 */
public class PBO210117070Latihan6Kambingstatic {
//NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";

    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " +
                Mamalia.jumlahKambing);
    }
    
}
