/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.soalmudah1;

import java.util.Scanner;

/**
 *
 * @author LOQ
 */
public class Soalmudah1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("PROGRAM HITUNG BIAYA PENGIRIMAN");

        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();
        System.out.print("Masukkan jarak pengiriman (km): ");
        double jarak = input.nextDouble();
        System.out.print("Masukkan volume paket (cm^3): ");
        double volume = input.nextDouble();

        double biayaPerKg;
        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
            double biayaBerat = berat * biayaPerKg;
            double biayaVolume = 0;
            if (volume > 100) {
                biayaVolume = 50000;
                double totalBiaya = biayaBerat + biayaVolume;
                System.out.println("RINCIAN BIAYA");
                System.out.println("Berat  : " + berat + " kg");
                System.out.println("Jarak  : " + jarak + " km");
                System.out.println("Volume : " + volume + " cm^3");
                System.out.printf("Total Biaya Pengiriman: Rp ", totalBiaya);

            }
        }
    }
}
