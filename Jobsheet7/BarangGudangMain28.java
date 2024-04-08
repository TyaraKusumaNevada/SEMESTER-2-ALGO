package Jobsheet7;
import java.util.Scanner;
public class BarangGudangMain28 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas barang : ");
        int kapasitas = sc.nextInt();
        Gudang28 gudang = new Gudang28(kapasitas); //Gudang(10)jika tidak memasukkan inputan 

        while(true){
            System.out.println("\n Menu: ");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Lihat barang teratas");
            System.out.println("4. Lihat barang terbawah");
            System.out.println("5. Tampilkan tumpukan barang");
            System.out.println("6. Cari barang");
            System.out.println("7. Keluar");
            System.out.print("Pilih operasi : ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch(pilihan) {
                case 1:
                System.out.print("Masukkan kode barang : ");
                int kode = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan nama barang : ");
                String nama = sc.nextLine();
                System.out.print("Masukkan nama kategori : ");
                String kategori = sc.nextLine();
                Barang28 barangBaru = new Barang28(kode, nama, kategori);
                gudang.tambahBarang(barangBaru);
                break;

                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.lihatBarangTeratas();
                    break;
                case 4:
                    gudang.lihatBarangTerbawah();
                    break;
                case 5:
                    gudang.tampilkanBarang();
                    break;
                case 6: 
                    System.out.println("Cari barang dengan : ");
                    System.out.println("1. Kode barang");
                    System.out.println("2. Nama barang");
                    System.out.print("Masukkan pilihan : ");
                    int pilcaribrg = sc.nextInt();
                    switch (pilcaribrg) {
                        case 1:
                            System.out.print("Masukkan kode barang : ");
                            int kodecaribrg = sc.nextInt();
                            gudang.cariBarangByKode(kodecaribrg);
                            break;
                        case 2:
                            System.out.print("Masukkan nama barang : ");
                            String namacaribrg = sc.nextLine();
                            gudang.cariBarangByNama(namacaribrg);
                            break;
                        default:
                            break;
                    }
                    
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");

            }
        }
    }
}

