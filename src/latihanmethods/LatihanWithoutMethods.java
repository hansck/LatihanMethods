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
public class LatihanWithoutMethods {
    
    public static double hitungTotalBayar(int harga, int jumlah) {
        double totalBayar = (harga * jumlah) * 1.1 * 0.7;
        return totalBayar;
    }
    
    public static void printData() {
        System.out.println("Nama");
    }

    public static void main(String[] args) {
        int harga = 10000;
        int jumlah = 5;
        
        // hitung total bayar
//        double totalBayar = (harga * jumlah) * 1.1 * 0.5;

        double totalBayar = hitungTotalBayar(harga, jumlah);
        System.out.println("total bayar : " + totalBayar);
        
        double totalBayar2 = hitungTotalBayar(harga, jumlah);
        printData();
    }
}
