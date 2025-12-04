package Pertemuan14;

import java.util.Scanner;

public class RekapPenjualanCafe4 {
    // Daftar nama menu tetap (5 menu)
    static void inputNamaMenu(String[] menu){
        Scanner input = new Scanner(System.in);
        System.out.println("\nMasukkan nama masing-masing menu:");

        for (int i = 0; i < menu.length; i++) {
            System.out.print("Menu ke-" + (i+1) + ": ");
            menu[i] = input.nextLine();
        }
    }

    //--------------- Fungsi Input Data ---------------
    static void inputPenjualan(int[][] data, String[] menu){
        Scanner input = new Scanner (System.in);

        for (int i = 0; i < data.length; i++) {
            System.out.println("\nInput penjualan untuk menu: " + menu[i]);

            for (int j = 0; j < data[i].length; j++) {
                System.out.print("Hari ke-" + (j+1) + ": ");
                data[i][j] = input.nextInt();        
            }
        }
    }

    //--------------- Fungsi Tampil Tabel ---------------
    static void tampilData(int[][] data, String[] menu){
    System.out.println("\n------------- TABEL PENJUALAN -------------");

    System.out.printf("%-20s", "Menu");

    for (int h = 1; h <= data[0].length; h++) {
        System.out.printf("%-12s","Hari ke " + h);
    }
    System.out.println();

    for (int i = 0; i < data.length; i++) {
        System.out.printf("%-20s", menu[i]);

        for (int j = 0; j < data[i].length; j++) {
            System.out.printf("%-12d", data[i][j]);
        }
        System.out.println();
        }
    }
    //--------------- Fungsi Total Tertinggi ---------------
    static void tampilMenuTertinggi(int[][] data, String[] menu) {
        int maxTotal = -1;
        String menuMax = "";

        for (int i = 0; i < data.length; i++) {
            int total = 0;

            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
            }

            if (total > maxTotal) {
                maxTotal = total;
                menuMax = menu[i];
            }
        }
        System.out.println("--------------------------------------------");
        System.out.println("Menu dengan total penjualan tertinggi:");
        System.out.println(menuMax + " (total: " + maxTotal + ")");
    }

    // ------------------------ Fungsi Rata - Rata Setiap Menu ------------------------
    static void tampilRataRata(int[][] data, String[] menu) {
        System.out.println("--------------------------------------------");
        System.out.println("Rata-rata penjualan setiap menu:");

        for (int i = 0; i < data.length; i++) {
            int total = 0;

            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
            }
            double rata = (double) total / data[i].length;

            System.out.printf("%-20s : %.2f\n", menu[i], rata);
        }
    }

    // ------------------------ Main Program ------------------------
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = input.nextInt();
        input.nextLine(); // membuang newline

        System.out.print("Masukkan jumlah hari penjualan: ");
        int jumlahHari = input.nextInt();

        String[] menu = new String[jumlahMenu];
        int[][] dataPenjualan = new int[jumlahMenu][jumlahHari];

        inputNamaMenu(menu);
        inputPenjualan(dataPenjualan, menu);
        tampilData(dataPenjualan, menu);
        tampilMenuTertinggi(dataPenjualan, menu);
        tampilRataRata(dataPenjualan, menu);
    }
}

