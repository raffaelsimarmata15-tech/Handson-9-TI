package latihan3;

public class PolymorphismPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Polymorphism
         * Instruksi: Lengkapi latihan untuk menguasai method overriding
         * dan method overloading (polymorphism).
         */

        // ===== PART 1: METHOD OVERRIDING =====
        System.out.println("=== METHOD OVERRIDING ===");

        // Latihan 1: Method overriding pada class hierarchy
        // Runtime Polymorphism: Bentuk reference, Lingkaran/PersegiPanjang/Segitiga object
        Bentuk b1 = new Lingkaran(5);
        b1.tampilkanInfo(); // Memanggil tampilkanInfo() dari Lingkaran
        System.out.println();

        Bentuk b2 = new PersegiPanjang(4, 6);
        b2.tampilkanInfo(); // Memanggil tampilkanInfo() dari PersegiPanjang
        System.out.println();

        Bentuk b3 = new Segitiga(3, 4);
        b3.tampilkanInfo(); // Memanggil tampilkanInfo() dari Segitiga

        // ===== RUNTIME POLYMORPHISM =====
        System.out.println("\n=== RUNTIME POLYMORPHISM ===");

        // Latihan 2: Array polymorphic
        System.out.println("Menghitung total luas semua bentuk:");
        // Array bertipe Bentuk dapat menampung objek Bentuk yang berbeda
        Bentuk[] bentukArray = {
                new Lingkaran(7),
                new PersegiPanjang(5, 10),
                new Segitiga(6, 8) // Keliling: 6 + 8 + sqrt(36+64) = 6 + 8 + 10 = 24
        };

        double totalLuas = 0;
        for (Bentuk b : bentukArray) {
            // Pemanggilan hitungLuas() terjadi saat runtime
            double luas = b.hitungLuas();
            // Menggunakan getSimpleName() untuk mendapatkan nama kelas (e.g., Lingkaran)
            System.out.println(b.getClass().getSimpleName() + ": " + String.format("%.2f", luas));
            totalLuas += luas;
        }
        System.out.println("Total Luas: " + String.format("%.2f", totalLuas));

        // ===== PART 2: METHOD OVERLOADING =====
        System.out.println("\n=== METHOD OVERLOADING ===");

        // Latihan 3: Kalkulator dengan method overloading
        Kalkulator calc = new Kalkulator();
        // Compile-time Polymorphism: Compiler menentukan method mana yang dipanggil
        System.out.println("Menjumlahkan 2 integer: 5 + 3 = " + calc.tambah(5, 3));
        System.out.println("Menjumlahkan 3 integer: 2 + 4 + 6 = " + calc.tambah(2, 4, 6));
        System.out.println("Menjumlahkan 2 double: 2.5 + 3.7 = " + String.format("%.2f", calc.tambah(2.5, 3.7)));

        // ===== CONSTRUCTOR OVERLOADING =====
        System.out.println("\n=== CONSTRUCTOR OVERLOADING ===");

        // Latihan 4: Product dengan berbagai constructor
        Product p1 = new Product("Laptop"); // Constructor 1
        p1.tampilkanInfo();

        Product p2 = new Product("Mouse", 150000); // Constructor 2
        p2.tampilkanInfo();

        Product p3 = new Product("Keyboard", 500000, 10); // Constructor 3
        p3.tampilkanInfo();

        // ===== OVERRIDING DENGAN SUPER =====
        System.out.println("\n=== OVERRIDING DENGAN SUPER ===");

        // Latihan 5: Menggunakan super untuk memanggil method parent
        PegawaiTetap pegawai = new PegawaiTetap("Budi", 5000000, 10000000);
        pegawai.tampilkanInfo(); // Memanggil tampilkanInfo() yang sudah di-override
    }
}