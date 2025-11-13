package latihan3;

// Buat abstract class Bentuk
public abstract class Bentuk {
    protected String nama;

    // Constructor
    public Bentuk(String nama) {
        this.nama = nama;
    }

    // Abstract methods: harus diimplementasikan oleh subclass
    public abstract double hitungLuas();
    public abstract double hitungKeliling();

    // Concrete method: menggunakan abstract methods secara polimorfik
    public void tampilkanInfo() {
        System.out.println("Bentuk: " + nama);
        // Method Overriding (Runtime Polymorphism) terjadi di sini:
        // hitungLuas() dan hitungKeliling() akan dipanggil dari objek spesifik
        System.out.println("Luas: " + String.format("%.2f", hitungLuas()));
        System.out.println("Keliling: " + String.format("%.2f", hitungKeliling()));
    }
}