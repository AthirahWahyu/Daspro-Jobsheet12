package Pertemuan14;

public class PengunjungCafe4 {
    static void daftarPengunjung(String...namaPengunjung){
        System.out.println("Daftar nama pengunjung: ");
        
        // menggunakan for-each loop 
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung();
        daftarPengunjung();
        daftarPengunjung();
    }   
}
