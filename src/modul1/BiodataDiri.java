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
public class BiodataDiri {
    public static void main(String[] args) {
        String nama, tehir,jeke, alamat, motto;
        int nis, tahir;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Nama : ");
        nama = in.nextLine();
        
        System.out.print("NIS : ");
        nis = Integer.parseInt(in.nextLine());
        
        System.out.print("Tempat lahir : ");
        tehir = in.nextLine();
        
        System.out.print("Tanggal lahir(DDMMYY) : ");
        tahir = Integer.parseInt(in.nextLine());
        
        System.out.print("Jenis Kelamain : ");
        jeke = in.nextLine();
        
        System.out.print("Alamat di Malang : ");
        alamat = in.nextLine();
        
        System.out.print("Motto hidup : ");
        motto = in.nextLine();
    }
}

