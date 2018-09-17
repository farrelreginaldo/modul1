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
public class konversiSuhu {
    public static void main(String[] args) {
       int suhu, r,f, k;
        suhu = 78;
        r = (suhu*4/5);
        f = (((9/5)*suhu)+32);
        k = (suhu + 273);
        System.out.println("Perubahan suhu Celcius\n");
        System.out.println("Celcius ke Reamur : "+ r);
        System.out.println("Celcius ke Fahrenheit : "+ f);
        System.out.println("Celcius ke Kelvin : "+ k);        
    }
}
