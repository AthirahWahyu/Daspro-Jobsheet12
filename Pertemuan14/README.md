# JOBSHEET 12

# PERCOBAAN 

## - Percobaan 1 : Membuat Fungsi Tanpa Parameter 

## - Percobaan 1 : Verifikasi Hasil Percobaan 

![Verifikasi1](./Verifikasi1.png)

_Pertanyaan:_

1.  Apakah fungsi tanpa parameter selalu harus bertipe void?
2.  Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi Menu() ? Modifikasi kode program tersebut untuk dapat menampilkan daftar menu tanpa menggunakan fungsi!
3.  Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua
perintah penampilan menu langsung di dalam fungsi main.
4.  Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main (mulai dari program dijalankan sampai daftar menu tampil di layar).

_Jawaban:_

1.  Tidak, fungsi tanpa parameter tidak harus selalu bertipe void. Fungsi tanpa parameter berarti fungsi tersebut tidak menerima input dari luar. Jadi, Fungsi tanpa parameter boleh void atau boleh mengembalikan nilai. Parameternya tidak ada tapi return type bebas.
2.  Tentunya bisa
    Code : 
    ```java 
        package Pertemuan14;
        public class Kafe4 {
    
            public static void main(String[] args) {
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
        }
    ```
    Output : 

    ![Verifikasi1](./Verifikasi1.png)

