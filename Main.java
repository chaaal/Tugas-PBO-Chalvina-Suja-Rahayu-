import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Exception Handling
        try {
            // Input data transaksi
            System.out.print("No. Faktur: ");
            String noFaktur = scanner.nextLine();

            System.out.print("Nama Pelanggan: ");
            String namaPelanggan = scanner.nextLine();

            System.out.print("Nama Barang: ");
            String namaBarang = scanner.nextLine();

            System.out.print("Harga Barang: ");
            double hargaBarang = scanner.nextDouble();

            System.out.print("Jumlah Barang: ");
            int jumlahBarang = scanner.nextInt();

            // Membuat objek barang elektronik (Polymorphisme)
            BarangElektronik barang = new BarangElektronik(namaBarang, hargaBarang);

            // Membuat objek transaksi
            Transaksi transaksi = new Transaksi(noFaktur, namaPelanggan, barang, jumlahBarang);

            // Menampilkan hasil transaksi
            System.out.println("\nDetail Transaksi:");
            System.out.println("No. Faktur: " + transaksi.getNoFaktur());
            System.out.println("Nama Pelanggan: " + transaksi.getNamaPelanggan());
            System.out.println("Nama Barang: " + transaksi.getBarang().getNamaBarang());
            System.out.println("Harga Barang: Rp." + (int) transaksi.getBarang().getHargaBarang());
            System.out.println("Jumlah Barang: " + transaksi.getJumlahBarang());
            System.out.println("Total Bayar: Rp." + String.format("%.2f", transaksi.hitungTotalBayar()));
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan pada input data. Pastikan input sesuai dengan format yang benar.");
        } finally {
            scanner.close();
        }
    }
}