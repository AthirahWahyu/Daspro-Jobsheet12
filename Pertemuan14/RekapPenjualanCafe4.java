package Pertemuan14;

import java.util.Scanner;

public class RekapPenjualanCafe4 {
    // Daftar nama menu tetap (5 menu)
    static String[] menu = {
        "Kopi",
        "Teh",
        "Es Kelapa Muda",
        "Roti Bakar",
        "Gorengan"
    };

    //--------------- Fungsi Input Data ---------------
    static void inputPenjualan(int[][] data){
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
    static void tampilData(int[][] data){
    System.out.println("\n------------- TABEL PENJUALAN -------------");

    System.out.printf("%-15s", "Menu");
    for (int h = 1; h <= data[0].length; h++) {
        System.out.printf("%-12s","Hari ke " + h);
    }
    System.out.println();

    for (int i = 0; i < data.length; i++) {
        System.out.printf("%-15s", menu[i]);

        for (int j = 0; j < data[i].length; j++) {
            System.out.printf("%-12d", data[i][j]);
        }
        System.out.println();
        }
    }
    //--------------- Fungsi Total Tertinggi ---------------
    static void tampilMenuTertinggi(int[][] data) {
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
    static void tampilRataRata(int[][] data) {
        System.out.println("--------------------------------------------");
        System.out.println("Rata-rata penjualan setiap menu:");

        for (int i = 0; i < data.length; i++) {
            int total = 0;

            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
            }
            double rata = (double) total / data[i].length;

            System.out.printf("%-18s : %.2f\n", menu[i], rata);
        }
    }

    // ------------------------ Main Program ------------------------
    public static void main(String[] args) {

        int[][] dataPenjualan = new int[5][7]; // 5 menu × 7 hari

        inputPenjualan(dataPenjualan);
        tampilData(dataPenjualan);
        tampilMenuTertinggi(dataPenjualan);
        tampilRataRata(dataPenjualan);
    }
}

