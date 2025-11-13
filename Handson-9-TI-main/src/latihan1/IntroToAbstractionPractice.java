package latihan1;

public class IntroToAbstractionPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Introduction to Abstraction
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk memahami
         * konsep abstraction dan abstract class.
         */

        // ===== TANPA ABSTRACTION: CARA BIASA =====
        System.out.println("=== TANPA ABSTRACTION ===");

        // Latihan 1: Buat beberapa object hewan dengan cara biasa
        // Masalah: Kita bisa membuat object dari class HewanBiasa yang terlalu umum
        // Padahal di dunia nyata, tidak ada "hewan" tanpa jenis spesifik

        // UNCOMMENT kode di bawah dan perhatikan masalahnya
        HewanBiasa hewan = new HewanBiasa("Hewan Umum");
        hewan.bersuara(); // Output: Hewan Umum bersuara... (Terlalu Umum!)

        // ===== DENGAN ABSTRACTION: MENGGUNAKAN ABSTRACT CLASS =====
        System.out.println("\n=== DENGAN ABSTRACTION ===");

        // Latihan 2: Menggunakan abstract class
        // Buat beberapa object dari subclass Hewan

        // Membuat object dari subclass (Kucing, Anjing, Burung)
        Kucing kucing = new Kucing("Kitty");
        kucing.bersuara();
        kucing.makan();
        kucing.tidur();

        System.out.println(); // Pemisah

        // Buat object Anjing
        Anjing anjing = new Anjing("Bobby");
        anjing.bersuara();
        anjing.makan();
        anjing.tidur();

        System.out.println(); // Pemisah

        // Buat object Burung
        Burung burung = new Burung("Tweety");
        burung.bersuara();
        burung.makan();
        burung.tidur();

        // ===== DEMONSTRASI ABSTRACTION & POLYMORPHISM =====
        System.out.println("\n=== DEMONSTRASI ABSTRACTION & POLYMORPHISM ===");

        // Latihan 3: Polymorphic array
        // Buat array bertipe Hewan yang berisi berbagai jenis hewan
        // Iterasi array dan panggil method bersuara()

        Hewan[] hewanArray = new Hewan[3];
        // Kita menggunakan tipe Hewan (abstract class) sebagai referensi
        hewanArray[0] = new Kucing("Kitty");
        hewanArray[1] = new Anjing("Bobby");
        hewanArray[2] = new Burung("Tweety");

        for (Hewan h : hewanArray) {
            // Pemanggilan bersuara() secara polimorfik
            h.bersuara();
        }

        // ===== KEUNTUNGAN ABSTRACTION =====
        System.out.println("\n=== KEUNTUNGAN ABSTRACTION ===");
        // Tuliskan dalam komentar 5 keuntungan menggunakan abstraction

        /*
         * KEUNTUNGAN ABSTRACTION:
         * 1. Menentukan BLUEPRINT: Memaksa subclass untuk mengimplementasikan method penting (abstract method).
         * 2. Menyembunyikan Detail: Menyembunyikan detail implementasi dari user/caller (hanya tahu ada method 'bersuara()', tidak peduli bagaimana detailnya).
         * 3. Meningkatkan Keamanan: Hanya mengekspos apa yang perlu diketahui user.
         * 4. Memfasilitasi Polymorphism: Memungkinkan penggunaan tipe referensi umum (Hewan) untuk menampung berbagai tipe spesifik (Kucing, Anjing).
         * 5. Kode Lebih Mudah Diatur/Dibaca: Memisahkan fokus antara 'apa yang harus dilakukan' (abstract) dan 'bagaimana cara melakukannya' (concrete subclass).
         */
    }
}