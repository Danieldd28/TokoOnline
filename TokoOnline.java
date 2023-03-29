public class TokoOnline {
    public static void main(String[] args) {
        Barang br = new Barang();
        Laporan lp = new Laporan();
        Karyawan kr = new Karyawan();
        Transaksi tr = new Transaksi();
        Member mm = new Member();

        lp.laporan(br);
        lp.laporan(mm);
        lp.laporan(tr, br);

        tr.prosesTransaksi(mm, tr, br);
        lp.laporan(tr, br);
        lp.laporan(mm);
        lp.laporan(br);
    }
}