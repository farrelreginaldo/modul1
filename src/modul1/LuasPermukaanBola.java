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
public class LuasPermukaanBola {
    public static void main(String[] args) {
    Scanner m= new Scanner(System.in);
        int r;
        System.out.print("Masukkan r pada bola = ");
        r = m.nextInt();
        double hsl = 4*r*r*Math.PI;
        System.out.println("Hasilnya adalah "+hsl);
    }
}
