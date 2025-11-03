/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soalsulit1;
 import java.util.Scanner;
/**
 *
 * @author LOQ
 */
public class Soalsulit1 {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        double totalNilai = 0; // gunakan double untuk akurasi desimal
        double nilai;

        // perulangan untuk input nilai setiap siswa
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            nilai = input.nextDouble();
            totalNilai += nilai;
        }

        // hitung rata-rata
        double rataRata = totalNilai / jumlahSiswa;

        System.out.println("\n=== Rekapitulasi Nilai Produktif RPL ===");
        System.out.println("Jumlah Siswa: " + jumlahSiswa);
        System.out.println("Total Nilai : " + totalNilai);
        System.out.println("Nilai Rata-rata: " + rataRata);

        input.close();
    }
}

         

