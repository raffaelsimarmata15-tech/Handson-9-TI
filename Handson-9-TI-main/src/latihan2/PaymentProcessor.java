package latihan2;

// Implementasikan class PaymentProcessor
public class PaymentProcessor {
    // Method untuk memproses pembayaran apapun
    // Gunakan polymorphism!
    public void proses(Pembayaran payment, double jumlah) {
        // 1. Memanggil implementasi spesifik dari method prosesPembayaran
        payment.prosesPembayaran(jumlah);

        // 2. Output sukses terpusat
        System.out.println("Payment successful via " + payment.getMetodePembayaran());
    }
}