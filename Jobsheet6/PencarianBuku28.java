package Jobsheet6;

import java.util.Scanner;

public class PencarianBuku28 {
    Buku28 listBk [] = new Buku28 [2];
    int idx;
    
    void tambah(Buku28 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx ++;
        }else {
            System.out.println("Data sudah penuh!");
        }
    }
    void tampil () {
        for (Buku28 m : listBk ) {
            m.tampilDataBuku();
        }
    }
    public int FindSeqSearch(int cari ) {
        int posisi = -1;
        for (int j=0; j< listBk.length; j++) {
            if (listBk[j].kodeBuku == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    public Buku28 FindBuku(int cari){
        for (Buku28 buku : listBk) {
            if (buku.kodeBuku == cari) {
                return buku;
            }
        }
        return null;
    }
    public void Tampilposisi(int x, int pos) {
        if (pos!= -1){
            System.out.println("data : "  + x +  " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }
    public void TampilData(int x, int pos){
        if (pos!= -1){
            System.out.println("Kode Buku \t : " + x);
            System.out.println("Judul     \t : " +listBk[pos].judulBuku);
            System.out.println("Tahun Terbit \t : " +listBk[pos].tahunTerbit);
            System.out.println("Pengarang \t : " +listBk[pos].pengarang);
            System.out.println("Stock     \t : " +listBk[pos].stock);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }
    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if (right >= left){
            mid = left+ (right - left)/2;
            if (cari == listBk[mid].kodeBuku) {
                return (mid);
            } else if (listBk[mid].kodeBuku < cari) {
                return FindBinarySearch(cari, left, mid-1);
            }else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}