package Pertemuan14;

import java.util.Scanner;

public class Kafe4 {

    public static void Menu(){
        System.out.println("Selamat datang!");

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino = Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        // Variabel untuk diskon 
        double diskon = 0;

        // Mengecek kode promo 
        if (kodePromo.equals("DISKON50")) {
            diskon = 0.50;
            System.out.println("Kode promo valid! Anda mendapatkan diskon 50%");
        } else if (kodePromo.equals("DISKON30")) {
                diskon = 0.30;
                System.out.println("Kode promo valid! Anda mendapatkan dikskon 30%");
        } else {
            System.out.println("Kode promo invalid! Tidak ada diskon yang diberikan");
        }
        
        // Hitung total harga setelah diskon
        int totalSetelahDiskon = (int)(hargaTotal - (hargaTotal * diskon));

        return totalSetelahDiskon;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu();

        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.next();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);

        System.out.println("Total harga yang harus dibayar: Rp " + totalHarga);
    }
}
