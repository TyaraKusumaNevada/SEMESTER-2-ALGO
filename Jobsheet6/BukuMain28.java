package Jobsheet6;
import java.util.Scanner;
public class BukuMain28 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        PencarianBuku28 data = new PencarianBuku28();
        int jumBuku = 2;
        System.out.println("-------------------------------------");
        System.out.println("Masukkan data Buku secara urut dari kode buku terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("-----------------");
            System.out.print("Kode Buku \t : ");
            String kodeBuku = s1.nextLine();
            System.out.print("Judul Buku \t : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun terbit \t : ");
            int tahunTerbit = s1.nextInt();
            s1.nextLine(); 
            System.out.print("Pengarang \t : ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t : ");
            int stock = s1.nextInt();
            s1.nextLine();  

            Buku28 buku = new Buku28(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(buku);
        }

        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan kode buku yang dicari: ");
        System.out.print("Kode buku : ");
        String cari = s1.nextLine();
        System.out.println("================================");
        System.out.println("Menggunakan sequential search ");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

        System.out.println("================================");
        System.out.println("Menggunakan binary search");
        posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

        System.out.println("================================");
        System.out.println("Menggunakan sequential search untuk String");
        posisi = data.FindSeqSearchByString(cari);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

        System.out.println("================================");
        System.out.println("Menggunakan binary search untuk String");
        posisi = data.FindBinarySearchByString(cari, 0, jumBuku - 1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}