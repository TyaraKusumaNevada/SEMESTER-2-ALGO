package Jobsheet6;
import java.util.Scanner;
public class BukuMain28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku28 data = new PencarianBuku28();
        int jumBuku = 5;

        System.out.println("-------------------------------------");
        System.out.println("Masukkan data Buku secara urut dari kode buku terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("-----------------");
            System.out.print("Kode Buku \t : ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul Buku \t : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t : ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t : ");
            int stok = s.nextInt();

            Buku28 m = new Buku28(kodeBuku, judulBuku, tahunTerbit, pengarang, stok);
            data.tambah(m);
        }

        System.out.println("============================================");
        System.out.println("Data keseluruhan Buku");
        data.tampil();

        System.out.println("__________________________________");
        System.out.println("_____________________________________");
        System.out.println("Pencarian data: ");
        System.out.print("Masukkan Kode buku yang dicari: ");
        int cari = s.nextInt();
        System.out.println("Menggunakan sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.TampilData(cari, posisi);


        Buku28 dataBuku28 = data.FindBuku(cari);
        dataBuku28.tampilDataBuku();


        System.out.println("============================================");
        System.out.println("Menggunakan Binary Search");
        posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari,posisi);
        
    }
}