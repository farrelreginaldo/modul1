/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1;

import java.util.Scanner;

/**
 *
 * @author Farrel
 */
public class Inputan {
    public static void main(String[] args) {
    Scanner masukan = new Scanner(System.in);
    int a, b;
        System.out.print("MASUKKAN NILAI A = ");
        a = masukan.nextInt();
        System.out.print("MASUKKAN NILAI B = ");
        b = masukan.nextInt();
        System.out.println();
        System.out.println("NILAI VARIABEL YANG ADA PADA PROGRAM = ");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}
