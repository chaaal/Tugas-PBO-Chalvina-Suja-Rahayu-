class Transaksi implements HitungTotalBayar {
    private String noFaktur;
    private String namaPelanggan;
    private Barang barang;
    private int jumlahBarang;

    public Transaksi(String noFaktur, String namaPelanggan, Barang barang, int jumlahBarang) {
        this.noFaktur = noFaktur;
        this.namaPelanggan = namaPelanggan;
        this.barang = barang;
        this.jumlahBarang = jumlahBarang;
    }

    public String getNoFaktur() {
        return noFaktur;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public Barang getBarang() {
        return barang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    // Implementasi dari interface HitungTotalBayar
    @Override
    public double hitungTotalBayar() {
        return barang.getHargaBarang() * jumlahBarang;
    }
}