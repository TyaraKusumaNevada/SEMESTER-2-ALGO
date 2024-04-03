package Jobsheet7;
import java.util.Scanner;
public class Utama28 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas gudang: ");
        int kapasitas = sc.nextInt();
        Gudang28 gudang = new Gudang28(kapasitas);

        while(true) {
            System.out.println("\nMenu");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat barang teratas");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan){
                case 1 :
                    System.out.print("Masukkan kode barang: ");
                    int kode = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = sc.nextLine();
                    Barang28 barangBaru = new Barang28(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;

                case 2 :
                    gudang.ambilBarang28();
                    break;
                case 3 :
                    gudang.tampilBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    System.out.println("Terima kasih");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");

            }
        }
    }
}
