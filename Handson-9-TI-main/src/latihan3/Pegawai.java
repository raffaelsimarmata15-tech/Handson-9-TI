package latihan3;

// Buat class Pegawai
public class Pegawai {
    protected String nama;
    protected double gajiPokok; // protected agar dapat diakses oleh PegawaiTetap

    // Constructor
    public Pegawai(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    // Method hitungGaji() yang akan di-override
    public double hitungGaji() {
        return gajiPokok;
    }

    // Method tampilkanInfo() yang akan di-override
    public void tampilkanInfo() {
        System.out.println("Pegawai: " + nama);
        System.out.println("Gaji Pokok: Rp " + String.format("%.1f", gajiPokok));
        System.out.println("Total Gaji: Rp " + String.format("%.1f", hitungGaji()));
    }
}