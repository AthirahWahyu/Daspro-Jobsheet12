package Pertemuan14;

import java.util.Scanner;

public class NilaiMahasiswa4 {
    // a. Fungsi isianArray : mengisi array dengan input user
    static void isianArray(int[] arr){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai mahasiswa: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
    }
    // b. fumgsi tampilArray : menampilkan isi array
    static void tampilArray(int[] arr){
        System.out.println("\nDaftar nilai mahasiswa:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Mahasiswa ke-" + (i+1) + ": " + arr[i]);
        }
    }
    // c. Fungsi hitTot : menghitung total nilai mahasiswa 
    static int hitTot(int[] arr){
        int total = 0;
        for (int nilai : arr) {
            total += nilai;
        }
        return total;
    }
    // d. Fungsi main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membaca jumlah mahasiswa (N)
        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = input.nextInt();

        // Membuat array ukuran N
        int[] nilaiMhs = new int[N];

        // Memanggil fungsi isianArray 
        System.out.println("-----------------------------------");
        isianArray(nilaiMhs);

        // Memanggil fungsi tampilArray
        tampilArray(nilaiMhs);

        // Memanggil fungsi hitTot
        int totalNilai = hitTot(nilaiMhs);

        System.out.println("-----------------------------------");
        System.out.println("Total nilai seluruh mahasiswa : " + totalNilai);

        input.close();
    }
}
