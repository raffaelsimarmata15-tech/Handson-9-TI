package latihan3;

// Implementasikan class Kalkulator dengan method overloading
public class Kalkulator {

    // Method tambah dengan 2 parameter int
    public int tambah(int a, int b) {
        return a + b;
    }

    // Method tambah dengan 3 parameter int (Overloading berdasarkan jumlah parameter)
    public int tambah(int a, int b, int c) {
        return a + b + c;
    }

    // Method tambah dengan 2 parameter double (Overloading berdasarkan tipe data)
    public double tambah(double a, double b) {
        return a + b;
    }
}