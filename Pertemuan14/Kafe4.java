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
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        return hargaItems[pilihanMenu - 1] * banyakItem;

    }
    public static int terapkanPromo(int totalHarga, String kodePromo) {
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
            System.out.println("Kode promo invalid! Tidak ada diskon");
        }
        return (int)(totalHarga - (totalHarga * diskon));
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu();

        int totalSemuaPesanan = 0;
        char tambahPesanan;

        do {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();

            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);
            totalSemuaPesanan += totalHarga;

            System.out.print("Apakah ingin menambah pesanan lain? (y/n): ");
            tambahPesanan = sc.next().charAt(0);    
        } while (tambahPesanan == 'y' || tambahPesanan == 'Y');

        System.out.print("\nMasukkan kode promo (jika ada): ");
        String kodePromo = sc.next();

        int totalAkhir = terapkanPromo(totalSemuaPesanan, kodePromo);

        System.out.println("\n-----------------------------------");
        System.out.println("Total keseluruhan pesanan: Rp " + totalSemuaPesanan);
        System.out.println("Total setelah promo: Rp " + totalAkhir);
        System.out.println("-----------------------------------");
    }
}
