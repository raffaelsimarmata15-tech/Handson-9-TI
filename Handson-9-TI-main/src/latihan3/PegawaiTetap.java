package latihan3;

// Buat class PegawaiTetap extends Pegawai
public class PegawaiTetap extends Pegawai {
    private double bonusTahunan;

    // Constructor
    public PegawaiTetap(String nama, double gajiPokok, double bonusTahunan) {
        // Memanggil constructor Pegawai
        super(nama, gajiPokok);
        this.bonusTahunan = bonusTahunan;
    }

    // Override hitungGaji() dengan menambahkan bonus
    @Override
    public double hitungGaji() {
        // Memanggil hitungGaji() dari class Pegawai
        return super.hitungGaji() + bonusTahunan;
    }

    // Override tampilkanInfo()
    @Override
    public void tampilkanInfo() {
        System.out.println("Pegawai Tetap: " + nama);
        System.out.println("Gaji Pokok: Rp " + String.format("%.1f", gajiPokok));
        System.out.println("Bonus Tahunan: Rp " + String.format("%.1f", bonusTahunan));
        // Memanggil hitungGaji() yang sudah di-override
        System.out.println("Total Gaji: Rp " + String.format("%.1f", hitungGaji()));
    }
}