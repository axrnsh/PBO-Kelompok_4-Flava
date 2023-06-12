public class App {
    public static void main(String[] args) throws Exception {
        init();

        System.out.println("Selamat datang di Flava! \n");
        System.out.println("Menu: ");
        System.out.println("1. Rekomendasi");
        System.out.println("2. Search & Filter");
        System.out.println("3. Keranjang Belanja");
        System.out.println("4. My Order");
        System.out.println("5. Promo dan Pembayaran");
        System.out.println("6. Notifikasi");
    }

    public static void init() {
        Kategori kaos = new Kategori("Pakaian", "Atasan", "Classic Logo Tee", "PUMA");
        Kategori kemeja = new Kategori("Pakaian", "Atasan", "Kemeja Olympia Comfease", "DUST");
        Kategori sepatuHeels = new Kategori("Sepatu", "Heels", "Millie Heels", "Billini");

        MyOrder order1 = new MyOrder("KD01", "John Doe", "baju");
        MyOrder order2 = new MyOrder("KD02", "Jane Smith", "celana");
        MyOrder order3 = new MyOrder("KD03", "John Doe", "sepatu");

        Pembeli pembeli1 = new Pembeli("ayumi", "baju,celana,topi", "jln uph no 21");
        Pembeli pembeli2 = new Pembeli("destha", "celana 2pcs", "jln uph no 12");
        Pembeli pembeli3 = new Pembeli("vanessa", "baju, topi", "jln uph no 190");

        penjual penjual1 = new penjual("chris", "topi", 7);
        penjual penjual2 = new penjual("lisa", "baju", 5);
        penjual penjual3 = new penjual("Michael", "celana", 6);
        
        transaksi transaksi1 = new transaksi("TRX001", "2023-06-12", 500000);
        transaksi transaksi2 = new transaksi("TRX002", "2023-06-15", 750000);
        transaksi transaksi3 = new transaksi("TRX003", "2023-06-20", 1000000);
    }
}