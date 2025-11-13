package latihan2;

// Implementasikan class KartuKredit implements Pembayaran
public class KartuKredit implements Pembayaran {
    private String nomorKartu;

    // Constructor
    public KartuKredit(String nomorKartu) {
        this.nomorKartu = nomorKartu;
    }

    // Implementasi method dari interface
    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Processing Credit Card payment: Rp " + jumlah);
        // Output "Payment successful via Credit Card" dipindahkan ke PaymentProcessor
        // agar prosesnya lebih terpusat dan konsisten.
    }

    @Override
    public String getMetodePembayaran() {
        return "Credit Card";
    }
}