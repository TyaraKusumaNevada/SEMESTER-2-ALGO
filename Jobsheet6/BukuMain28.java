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
        for (int i = 0; i < jumBuku; i++){
            System.out.println("-----------------");
            System.out.print("Kode Buku \t : ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul Buku \t : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun terbit \t : ");
            int TahunTerbit = s.nextInt();
            System.out.print("Pengarang \t : ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t\t : ");
            int stok = s.nextInt();
         
            Buku28 m = new Buku28(kodeBuku, judulBuku, TahunTerbit, pengarang, stok);
            data.tambah(m);
        }
        System.out.println("---------------------------------------");
        System.out.println("Data keseluruhan buku : ");
        data.tampil();
        System.out.println("________________________________________");
        System.out.println("________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan kode buku yang dicari: ");
        System.out.print("Kode buku : ");
        int cari = s.nextInt();
        System.out.println("================================");
        System.out.println("menggunakan sequential search ");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
        System.out.println("menggunakan metode FindBuku ");
        Buku28 dataBuku04 = data.FindBuku(cari);
        dataBuku04.tampilDataBuku();
        System.out.println("================================");
        System.out.println("menggunakan binary search");
        posisi = data.FindBinarySearch(cari, 0, jumBuku-1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}