package latihan3;

// Implementasikan class Segitiga extends Bentuk
public class Segitiga extends Bentuk {
    private double alas, tinggi;

    // Constructor
    public Segitiga(double alas, double tinggi) {
        super("Segitiga");
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Override hitungLuas()
    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    // Override hitungKeliling()
    @Override
    public double hitungKeliling() {
        // Hitung sisi miring menggunakan pythagoras
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        // Keliling adalah jumlah semua sisi (Alas + Tinggi + Sisi Miring)
        return alas + tinggi + sisiMiring;
    }

    // Override tampilkanInfo()
    @Override
    public void tampilkanInfo() {
        System.out.println("Bentuk: " + nama);
        System.out.println("Luas Segitiga (alas: " + String.format("%.1f", alas) + ", tinggi: " + String.format("%.1f", tinggi) + "): " + String.format("%.2f", hitungLuas()));
        System.out.println("Keliling: " + String.format("%.2f", hitungKeliling()));
    }
}