/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1;

/**
 *
 * @author Farrel
 */
public class LuasBalok {
    public static void main(String[] args) {
        int p=5;
        int l=10;
        int t = 5;
        System.out.println("NILAI PANJANG BALOK = "+ p);
        System.out.println("NILAI LEBAR BALOK = "+ l);
        System.out.println("NILAI TINGGI BALOK = "+ t);
        System.out.println("===============================");
        System.out.println("MENGHITUNG LUAS PERMUKAAN BALOK");
        System.out.println("===============================");
        System.out.println("LUAS PERMUKAAN BALOK = "+((2*p*l)+(2*p*t)+(2*l*t)));
    }
}
