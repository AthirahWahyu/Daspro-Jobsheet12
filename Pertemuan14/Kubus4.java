package Pertemuan14;

import java.util.Scanner;

public class Kubus4{
    static int hitungVolume(int sisi){
        return sisi*sisi*sisi;
    }
    static int hitungLuasPermukaan(int sisi){
        return 6 * (sisi*sisi);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = input.nextInt();

        int volume = hitungVolume(sisi);
        int luasPermukaan = hitungLuasPermukaan(sisi);

        System.out.println("----------------------------------");
        System.out.println("Volume Kubus = " + volume);
        System.out.println("Luas Permukaan Kubus = " + luasPermukaan);
        System.out.println("----------------------------------");

        input.close();
    }
}