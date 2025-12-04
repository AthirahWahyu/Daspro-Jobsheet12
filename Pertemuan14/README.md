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

## - Percobaan 2 : Membuat Fungsi Dengan Parameter 

## - Percobaan 2 : Verifikasi Hasil Percobaan 

![Verifikasi2](./Verifikasi2.png)

_Pertanyaan:_

1.  Apakah kegunaan parameter di dalam fungsi?
2.  Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter namaPelanggan dan isMember?
3.  Apakah parameter sama dengan variabel? Jelaskan.
4.  Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa perbedaan output ketika isMember bernilai true dan ketika false?
5.  Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter namaPelanggan dan isMember?
6.  Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String). Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid.
7.  Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris perintah pemanggilan fungsi menu yang benar.
8.  Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter? Jelaskan alasan Anda.

_Jawaban:_

1.  Parameter digunakan untuk mengirim data ke dalam fungsi agar fungsi bisa bekerja lebih dinamis, fleksibel, dan dapat digunakan ulang tanpa perlu mengubah kode di dalamnya.
2.  Penjelasan fungsi Menu() menggunakan parameter:
    - namaPelanggan : agar fungsi bisa menampilkan nama pelanggan yang berbeda.
    - isMember : agar fungsi bisa menentukan apakah pelanggan mendapat diskon member.
    
    Dengan parameter, fungsi menjadi lebih fleksibel, dinamis, dan dapat digunakan untuk banyak pelanggan berbeda, tidak hanya "Andi".
3.  Tidak, parameter bukan hal yang sama dengan variabel tapi keduanya saling berkaitan. Parameter adalah variabel yang dideklarasikan di dalam tanda kurung pada definisi sebuah fungsi/metode, dan digunakan untuk menerima nilai dari luar (dari pemanggil fungsi). Variabel adalah tempat menyimpan data yang nilainya dapat berubah selama program berjalan. Parameter adalah variabel khusus yang digunakan untuk menerima input ke dalam fungsi.
4.  isMember adalah parameter bertipe boolean (hanya bsia bernilai true atau false) yang digunakan untuk menentukan : Apakah pelanggan adalah member atau bukan. Jika member akan mendapatkan diskon. Jika bukan member tidak mendapatkan diskon.

    - Cara kerja parameter isMember : 
    1.  Saat isMember == true 
        - Kondisi if (isMember) menjadi benar (true)
        - Maka perintah di dalamnya dijalankan 
        - Output menampilkan pesan diskon member 
    2.  Saat isMember == false 
        - Kondisi if (isMember) menjadi salah (false)
        - Maka perintah di dalam if tidak dijalankan
        - Output tidak ada pesan diskon 
5.  Program akan error (tidak bisa dikompilasi). Karena fungsi Menu() didefinisikan seperti ini : 
    ```java 
        public static void Menu(String namaPelanggan, boolean isMember)
    ```
    Artinya, fungsi tersebut wajib menerima 2 parameter String namaPelanggan dan boolean isMember. Kedua parameter harus dikirim ketika fungsi dipanggil. Jika tidak, Java tidak tahu nilai apa yang harus dimasukkan ke variabel tersebut. Jadi, memanggil fungsi tanpa parameter akan menyebabkan compile-time error, karena fungsi tersebut membutuhkan input untuk bekerja.
6.  Code : 
    ```java 
        package Pertemuan14;
        public class Kafe4 {

            public static void Menu(String namaPelanggan, boolean isMember, String kodePromo){
                System.out.println("Selamat datang, " + namaPelanggan + "!");

                if (isMember) {
                    System.out.println("Anda adalah member, dapatkan diskon 10 % untuk setiap pembelian!");
                }
                if (kodePromo == "DISKON50") {
                    System.out.println("Kode promo valid! Anda mendapatkan diskon 50%");
                } else if (kodePromo == "DISKON30") {
                    System.out.println("Kode promo valid! Anda mendapatkan diskon 30%");
                } else {
                    System.out.println("Kode promo invalid");
                }
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
            public static void main(String[] args) {
                Menu("Andi", true, "DISKON50");
            }
        }
    ```
    Output : 
![P2J6](./P2J6.png)

7.  Perintah pemanggilan fungsi menu yang benar.
    Code : 
    ```java 
            public static void main(String[] args) {
                Menu("Budi", true, "DISKON30");
        }
    ```

    Output : 
![P2J7](./P2J7.png)

8.  Ya, penggunaan parameter namaPelanggan dan isMember membuat program jauh lebih mudah dibaca, fleksibel, dan dikembangkan dibandingkan jika nilainya ditulis langsung di dalam fungsi. Fungsi bisa dipakai untuk nama dan status member yang berbeda - beda. Menggunakan parameter lebih baik karena bisa digunakan berkali-kali untuk data berbeda.

## - Percobaan 3 : Membuat Fungsi Dengan Nilai Kembalian 

## - Percobaan 3 : Verifikasi Hasil Percobaan 

![Verifikasi3](./Verifikasi3.png)

_Pertanyaan:_

1.  Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh dari program kafe pada Percobaan 3 untuk masing-masing kasus.
2.  Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing parameter dalam konteks program kafe.
3.  Modifikasi kode di atas sehingga fungsi hitungTotalHargaNoAbsen dapat menerima kodePromo. Jika kodePromo adalah "DISKON50", maka mendapat diskon 50% dari totalHarga dan tampilkan diskon. Jika kodePromo adalah "DISKON30", maka mendapat diskon 30% dari totalHarga dan tampilkan diskon. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid dan tidak ada pengurangan total harga totalHarga.
4.  Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3 sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis menu)?

_Jawaban:_

1.  a.  Fungsi yang membutuhkan nilai kembalian (return value) ketika fungsi harus menghasilkan jawaban atau hasil perhitungan, dan hasil tersebut ingin dipakai lagi oleh bagian program lain.
    - Contoh dari program kafe pada Percobaan 3 : 
    ```java 
            public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
            int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

            int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
            return hargaTotal;
        }
    ```
    - Penjelasan : 
        - Fungsi ini menghitung total harga pesanan.
        - Hasil perhitungannya dibutuhkan di main() untuk ditampilkan kepada user.
        - Karena program butuh hasilnya, maka harus ada return int (return hargaTotal).

    b.  Fungsi yang tidak membutuhkan nilai kembalian (void) ketika fungsi hanya melakukan tugas tertentu seperti mencetak menu, menampilkan pesan, atau melakukan proses tanpa perlu mengirim hasil kembali ke pemanggil.
    - Contoh dari program kafe Percobaan 3 :
    ```java 
            public static void Menu(String namaPelanggan, boolean isMember, String kodePromo){
                System.out.println("Selamat datang, " + namaPelanggan + "!");

                if (isMember) {
                    System.out.println("Anda adalah member, dapatkan diskon 10 % untuk setiap pembelian!");
                }
                if (kodePromo.equals("DISKON50")) {
                    System.out.println("Kode promo valid! Anda mendapatkan diskon 50%");
                } else if (kodePromo.equals("DISKON30")) {
                    System.out.println("Kode promo valid! Anda mendapatkan diskon 30%");
                } else {
                    System.out.println("Kode promo invalid");
                }
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
    ```
    - Penjelasan :
        - Fungsi ini hanya menampilkan menu dan informasi promosi.
        - Tidak ada nilai yang perlu dikembalikan ke main().
        - Karena hanya melakukan output ke layar, maka cukup menggunakan void.
2.  - Tipe Data Nilai Kembalian (Return Type)
        - Fungsi hitungTotalHarga memiliki tipe data int. Karena fungsi ini akan mengembalikan total harga dari pesanan dalam bentuk angka (bilangan bulat). 
        ```java
            public static int hitungTotalHarga(int pilihanMenu, int banyakItem)
        ``` 
    - Dua parameter dalam fungsi 
        - Fungsi ini memiliki 2 parameter : 
            a. int pilihanMenu 
            - Paremeter ini menunjukkan nomor menu yang dipilih pelanggan.
            - Nilainya berkisar antara 1-6, sesuai daftar menu :
            1. Kopi Hitam
            2. Cappucino
            3. Latte 
            4. Teh Tarik 
            5. Roti Bakar
            6. Mie Goreng
            - Arti dalam konteks program : Program menggunakan angka ini untuk mengambil harga item dari array hargaItems berdaskan indeks.

            b. int banyakItem 
            - Parameter ini mewakili jumlah porsi/item yang dipesan pelanggan.
            - Contoh : jika pelanggan ingin membeli 3 Cappucino, maka banyakItem = 3.
            - Arti dalam konteks program : Nilai ini digunakan untuk menghitung total harga dengan rumus :
            ```java 
                int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem
            ``` 
3.  Code : 
    ```java 
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
    ``` 
    Output : 
![P3J3](./P3J3.png)

4.  Code :
    ```java 
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
    ```
    Output : 
![P3J4](./P3J4.png)

## - Percobaan 4 : Fungsi Varargs 

## - Percobaan 4 : Verifikasi Hasil Percobaan 

![Verifikasi4](./Verifikasi4.png)

_Pertanyaan:_

1.  Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String... namaPengunjung!
2.  Modifikasi method daftarPengunjung menggunakan for-each loop.
3.  Bisakah menggunakan dua tipe data varaargs dalam satu fungsi? Jelaskan jawaban Anda berdasarkan aturan varargs di Java, dan berikan contohnya!
4.  Jelaskan apa yang terjadi jika fungsi daftarPengunjung dipanggil tanpa argumen. Apakah program akan error saat kompilasi, error saat dijalankan, atau tetap berjalan? Jika tetap berjalan, bagaimana output yang dihasilkan?

_Jawaban:_

1.  String... namaPengunjung digunakan karena : 
    - Agar metode dapat menerima jumlah parameter yang berbeda - beda (fleksibel).
    - Lebih praktis dibanding membuat banyak overload.
    - Secara internal Java mengubah varArgs menjadi array, sehingga bisa diproses dengan loop.
2.  Code : 
    ```java 
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
                daftarPengunjung("Ali", "Budi", "Citra");
                daftarPengunjung("Andi");
                daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
            }   
        }
    ```
    Output : 
![P4J2](./P4J2.png)

3.  Tidak bisa menggunakan dua varargs dalam satu fungsi. Tapi, Java mengizinkan satu varargs + parameter lain, selama varargs berada di posisi paling akhir.
    - Penjelasan Aturan Varargs di Java : 
        Java memiliki aturan khusus untuk varagrs (...) : 
        1. Hanya boleh ada satu varargs dalam satu method : Karena varargs itu sendiri adalah bentuk array, jika ada dua varargs, Java tidak dapat membedakan mana yang menerima jumlah parameter berapa. Ini membuat pemanggilan method menjadi ambigu.
        2.  Varargs harus diletakkan di posisi paling belakang 
        - Contoh yang benar : 
        ```java 
            void contoh(int angka, String...nama)
        ```
        - Contoh yang salah (varargs tidak di akhir) : 
        ```java 
            void contoh(String...nama, int angka)
        ```
        - Contoh yang tidak boleh : Dua varargs dalam satu method : 
        ```java 
            void data(String...nama, int...umur) { }
        ``` 
        ini akan error karena Java tidak bisa menentukan pembagian antara parameter pemanggilan.
        - Contoh yang boleh (1 varargs + parameter lainnya)
        ```java
            void cetakData(String tipe, int...angka){
                System.out.println("Tipe: " + tipe);
                for(int a : angka) {
                    System.out.println(a);
                }
            }
        ```
        - Pemanggilan : 
        ```java
            cetakData("Bilangan", 10, 20, 30);
        ```
        ini valid karena hanya ada satu varargs, varargs berada di ujung parameter.
4.  Jika fungsi daftarPengunjung dipanggil tanpa argumen, maka program tetap berjalan normal. Tidak terjadi error apa pun, baik saat kompilasi maupun saat dijalankan.
    - Penjelasan mengapa tidak error : Parameter String... namaPengunjung adalah varargs.
        - Varargs berarti : 
            - Boleh menerima 0, 1, atau banyak argumen. 
            - Jika tidak ada argumen, Java akan memperlakukan varargs sebagai array kosong (String[0]).
    - Jadi pemanggilan seperti ini valid : 
        - daftarPengunjung(); // tanpa argumen
    - Apa yang akan terjadi di dalam method? 
        - Karena tidak ada argumen, maka : 
            - namaPengunjung.length == 0
    Maka for-each loop tidak akan menjalankan isi loop, karena tidak ada elemen untuk diulang. 
    - Output yang dihasilkan 
    - Jika dipanggil seperti ini : 
    daftarPengunjung();
    daftarPengunjung();
    daftarPengunjung();
    - Maka outputnya : 
    Daftar nama pengunjung: 
    Daftar nama pengunjung: 
    Daftar nama pengunjung: 

## - Percobaan 5 : Pembuatan Kode Program, dengan Fungsi versus Tanpa Fungsi 

## - Percobaan 5 : Verifikasi Hasil Percobaan 

![Verifikasi5](./Verifikasi5.png)

_Pertanyaan:_

1.  Sebutkan tahapan dan urutan eksekusi program pada Percobaan 5, mulai dari program dijalankan hingga menampilkan luas persegi panjang dan volume balok!
2.  Tuliskan output yang dihasilkan program HitungBalokNoAbsen jika pengguna memasukkan panjang = 4, lebar = 3, dan tinggi = 5. Jelaskan secara singkat alur jalannya program sampai output tersebut muncul.
3.  Apakah output dari program di bawah ini kemudian jelaskan alur jalannya program tersebut!
![P5P3](./P5P3.png)
4.  Pada saat apakah fungsi yang kita buat harus menggunakan parameter atau tidak? Pada saat apakah fungsi yang kita buat harus memiliki nilai kembalian atau tidak? Jelaskan!
5.  Jelaskan kapan sebuah fungsi sebaiknya menggunakan parameter dan kapan fungsi boleh tanpa parameter, dengan mengacu pada fungsi hitungLuas dan hitungVolume di Percobaan 5.
6.  Jelaskan kapan sebuah fungsi sebaiknya memiliki nilai kembalian (return value) dan kapan tidak perlu memiliki nilai kembalian, dengan mengacu pada fungsi main, hitungLuas, dan hitungVolume.

_Jawaban:_

1.  - Urutan Eksekusi Program 
        1. Program mulai dari main()
        2. Input p, l, t
        3. Memanggil hitungLuas(p, l) -> menghitung luas -> mengembalikan hasil
        4. Menampilkan luas
        5. Memanggil hitungVolume(t, p, l) -> menghitung luas alas (memnggunakan HitungLuas) -> menghitung volume
        6. Menampilkan volume 
        7. Program selesai
2.  Output : 
![P5J2](./P5J2.png)

    - Penjelasan : 
        - Program mulai dari main() : Scanner dibuat untuk membaca input
        - Pengguna memasukkan panjang 
        - Pengguna memasukkan lebar
        - Pengguna memasukkan tinggi
        - Program memanggil hitungLuas(p,l)
        - Program memanggil hitungVolume(t, p, l)

3.  Output : 
![P5J3](./P5J3.png)

    - Penjelasan : 
        - Baris ini dijalankan : int temp = jumlah(1, 1);
        - Memanggil fungsi : Jumlah(1,1) -> 1+1 = 2
        - Sehingga temp = 2
        - Baris berikutnya dijalankan : TampilJumlah(temp, 5);
        - Artinya : TampilJumlah(2, 5);
        - Di dalam TampilJumlah(2,5)
        TampilHinggaKei(Jumlah(2,5));
        - Pertama dihitung : Jumlah(2, 5) -> 2 + 5 = 7
        - Jadi yang dipanggil adalah : TampilHinggaKei(7);
        - Di dalam TampilHinggaKei(7) : Fungsinya mencetak angka dari 1 sampai i : 

        ```java 
                for (int j = 1; j <= i; j++) {
                System.out.println(j);
            }
        ```
4.  a. Kapan fungsi harus menggunakan parameter?
        - Fungsi membutuhkan data dari luar. Contoh : fungsi ingin menghitung luas persegi, maka ia butuh nilai sisi.
        - Supaya fungsi bisa dipakai berulang dengan nilai berbeda.
        - Fungsi tidak perlu parameter jika fungsi tidak membutuhkan data dari luar. Contoh : menampilkan menu.
    b. Kapan fungsi harus memiliki nilai kembalian (return value)?
        - Fungsi harus memberikan hasil perhitungan ke pemanggil. Contoh : menghitung rata-rata, menghitung diskon, dsb. 
        - Fungsi dipakai seperti "alat hitung"
        1. Fungsi tidak perlu nilai kembalian (return void) jika : 
        - Fungsi hanya melakukan tindakan, bukan menghitung sesuatu. Contoh : mencetak data, menampilkan pesan.
        - Fungsi hanya mengubah variabel global / objek, bukan mengembalikan nilai. Contoh : menambah pengunjung ke ArrayList.
5.  1. Kapan fungsi sebaiknya menggunakan parameter?
        - Fungsi harus menggunakan parameter bila : Fungsi membutuhkan data dari luar agar dapat melakukan perhitungan.
        - Dalam Percobaan 5, fungsi : 
            ```java 
                static int hitungLuas (int pjg, int lb)
            ``` 
            dan 
            ```java 
                static int hitungVolume(int tinggi, int a, int b)
            ``` 
        - Penjelasan : 
            -> Fungsi tidak tahu berapa panjang, lebar, dan tinggi sebelum dipanggil.
            -> Nilai p, l dan t baru diketahui setelah user memasukkan input.
            -> Perhitungan luas dan volume harus berdasarkan data yang berbeda-beda, tidak tetap.
        - Tanpa parameter, fungsi tidak dapat menghitung luas atau volume karena tidak memiliki nilai untuk dihitung. 
        - Jadi, fungsi memakai parameter karena perhitungannya bergantung pada data yang diberikan saat runtime.
    2.  Kapan fungsi boleh tanpa parameter?
        - Fungsi boleh tanpa parameter jika nilai yang diperlukan sudah tersedia di dalam di dalam fungsi itu sendiri, misalnya : 
            -> Nilai sudah menjadi variabel global.
            -> Fungsi tidak butuh input dari luar.
        - Contoh : 
            ```java 
                static int p = 4, l = 3, t = 5;

                static int hitungLuas() {
                    return p * l; // tidak butuh parameter
                }

                static int hitungVolume() {
                    return p * l * t;
                }
            ```
        - Penjelasan : 
            -> Fungsi tidak membutuhkan parameter karena semua nilai sudah tersedia secara global. Namun pada Percobaan 5, ini tidak digunakan karena input berasal dari user, bukan nilai tetap.





    













     
    







