/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmethods;

import javax.swing.JOptionPane;

/**
 *
 * @author hanschristian
 */
public class LatihanMethods {
    // Methods (Procedure & Function)
    static String nama;
    static int nilai;
    static int umur;
    static int hargaUmum;
    static int harga = 10000;
    
    public static double hitungBiayaPajak() {
        // logic
        return 5.0;
    }
    
    public static double hitungTotalBayar(int harga, int jumlah) {
        harga = 2000;
        double totalBayar = (harga * jumlah) * 1.1 * hitungBiayaPajak();
        return totalBayar;
    }
    
    public static boolean cekKelulusanMataKuliah() {
        // logic IF untuk mengecek sesuatu      
        if (nilai >= 56) {
            return true;
        } else {
            return false;
        }
    }
    
    public static String createText(int nilai) {
        String temp = "blabla" + nilai + nilai;
        return temp;
    }
    
    public static int requestInput() {
        nama = JOptionPane.showInputDialog(null, "Input Nama");
        nilai = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Nilai"));
        umur = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Umur"));
        return umur;
    }
    
    public static void printDataUser(int harga1) {
        System.out.println(nama);
        System.out.println(nilai);
        System.out.println(umur);
        System.out.println(harga);
        System.out.println(harga1);
    }
    
    public static void main(String[] args) {
        int harga = 20000;
        int jumlah = 5;
        
        printDataUser(harga);
        
        double hasil = hitungTotalBayar(harga, jumlah);
        System.out.println(hasil);
        System.out.println("harga " + harga);
        
        System.out.println(hitungTotalBayar(harga, jumlah));

        nilai = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Nilai"));
        // bisa jadi nilai ini berasal dari database ataupun sumber lain
        boolean status = cekKelulusanMataKuliah();
        
        requestInput();
        System.out.println(nama);
    }
}
