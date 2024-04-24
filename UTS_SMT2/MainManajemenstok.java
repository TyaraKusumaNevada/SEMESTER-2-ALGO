package UTS_SMT2;
import java.util.Scanner;
    
    public class MainManajemenstok {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            ManajemenStok gudang = new ManajemenStok(10);
    
            System.out.println("Menu:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tampilkan Semua Barang");
            System.out.println("3. Urutkan Barang Berdasarkan Stok (dari terkecil ke besar)");
            System.out.println("4. Tampilkan Makanan Tanpa Stok");
            System.out.println("5. Cari Barang");
            System.out.println("6. Tambah Stok Barang");
            System.out.println("7. Kurangi Stok Barang");
            System.out.println("8. Keluar");
    
            int pilihan;
            do {
                System.out.println("\nMasukkan pilihan menu (1-8): ");
                pilihan = input.nextInt();
                input.nextLine(); 
    
                switch (pilihan) {
                    case 1:
                        System.out.println("Masukkan kode barang:");
                        String kodeBarang = input.nextLine();
                        System.out.println("Masukkan nama barang:");
                        String namaBarang = input.nextLine();
                        System.out.println("Masukkan kategori barang:");
                        String kategori = input.nextLine();
                        System.out.println("Masukkan harga satuan barang:");
                        double hargaSatuan = input.nextDouble();
                        System.out.println("Masukkan stok barang:");
                        int stok = input.nextInt();
                        Barang barang = new Barang(kodeBarang, namaBarang, kategori, hargaSatuan, stok);
                        gudang.tambahBarang(barang);
                        break;
                    case 2:
                        gudang.tampilkanSemuaBarang();
                        break;
                    case 3:
                        gudang.urutkanStokMenaik();
                        gudang.tampilkanSemuaBarang();
                        break;
                    case 4:
                        gudang.tampilkanMakananTanpaStok();
                        break;
                    case 5:
                        System.out.println("Masukkan kata kunci nama barang:");
                        String kataKunci = input.nextLine();
                        gudang.cariBarang(kataKunci);
                        break;
                    case 6:
                        System.out.println("Masukkan nama barang yang stoknya ingin ditambahkan:");
                        String tambahNama = input.nextLine();
                        System.out.println("Masukkan jumlah stok yang ingin ditambahkan:");
                        int tambahStok = input.nextInt();
                        gudang.tambahStok(tambahNama, tambahStok);
                        break;
                    case 7:
                        System.out.println("Masukkan nama barang yang stoknya ingin dikurangi:");
                        input.nextLine();
                        String kurangNama = input.nextLine();
                        System.out.println("Masukkan jumlah stok yang ingin dikurangi:");
                        int kurangStok = input.nextInt();
                        gudang.kurangiStok(kurangNama, kurangStok);
                        break;
                    case 8:
                        System.out.println("Keluar dari program.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Masukkan pilihan dari 1-8.");
                }
            } while (pilihan != 8);
    
            input.close();
        }
    }
    