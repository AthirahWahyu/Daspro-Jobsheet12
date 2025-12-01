# JOBSHEET 12

# PERCOBAAN 

## - Percobaan 1 : Membuat Fungsi Tanpa Parameter 

## - Percobaan 1 : Verifikasi Hasil Percobaan 

![Verifikasi1](./Verifikasi1.png)

_Pertanyaan:_

1.  Apakah fungsi tanpa parameter selalu harus bertipe void?
2.  Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi Menu() ? Modifikasi kode program tersebut untuk dapat menampilkan daftar menu tanpa menggunakan fungsi!
3.  Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua perintah penampilan menu langsung di dalam fungsi main.
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

3.  Keuntungan menggunakan fungsi :
    - Kode lebih rapi dan terstruktur : Fungsi membuat program lebih mudah dibaca dan dikelola      karena tugas tertentu dipisah ke dalam blok kode sendiri.
    - Reusability (dapat digunakan kembali) : Fungsi dapat dipanggil berkali-kali tanpa menulis ulang kode.
    - Mempermudah untuk melakukan perbaikan : Perubahan cukup dilakukan pada satu fungsi tanpa merusak bagian lain.
    - Menghindari kode duplikasi : Dengan fungsi, kita tidak perlu copy-paste blok kode yang sama.
4.  Alur eksekusi program ketika fungsi Menu() dipanggil dari main : 
    1.  Program dijalankan, dan eksekusi selalu dimulai dari fungsi 
    ```java
        public static void main(String[] args) 
    ```
    2.  Di dalam main(), program menemukan perintah: Menu();
    3.  Ketika baris tersebut dieksekusi, aliran program berpindah dari main() ke fungsi:
    ```java 
        public static void Menu()
    ```
    4.  Program menjalankan semua perintah System.out.println() yang ada di dalam fungsi Menu(), satu per satu mulai dari atas sampai bawah.
    5.  Setiap baris println akan menampilkan teks menu ke layar.
    6.  Setelah seluruh isi fungsi Menu() selesai dieksekusi, program kembali lagi ke baris berikutnya di dalam fungsi main().
    7.  Karena tidak ada perintah lain setelah Menu(), program kemudian berakhir.



