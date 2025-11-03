/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soalsedang2;
import java.util.Scanner;

/**
 *
 * @author LOQ
 */
public class Soalsedang2 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
       System.out.println("Masukkan jari-jari tabung: ");
       int jariJari = input.nextInt();

        System.out.println("Masukkan tinggi tabung: ");
        int tinggi = input.nextInt();

        double phi = 3.14;
        double volume = phi * jariJari * jariJari * tinggi;

        System.out.println("Volume tabung adalah: " + volume);
    }

}

    

