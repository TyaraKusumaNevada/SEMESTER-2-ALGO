package Jobsheet2;

public class BukuMain28 {

   public static void main(String[] args) {
    Buku28 bk1 = new Buku28();
    bk1.judul = "Today End Tomorrow Comes";
    bk1.pengarang = "Denada Pratiwi";
    bk1.halaman = 198;
    bk1.stok = 13;
    bk1.harga = 71000;

    bk1.tampilInformasi();
    bk1.terjual(5);
    bk1.gantiHarga(6000);
    bk1.tampilInformasi();

   }
    
}
