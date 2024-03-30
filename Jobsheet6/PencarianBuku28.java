package Jobsheet6;

import java.util.Scanner;

public class PencarianBuku28 {
    Buku28 listBk[] = new Buku28 [5];
    int idx;

    void tambah(Buku28 m) {
        if(idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        }else {
            System.out.println("Data sudah penuh!");

        }

    }

    void tampil(){
        for (Buku28 m :listBk) {
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = 2;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku==cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(int x, int pos){
        if (pos!= -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        }else {
            System.out.println("data : "+ x + "Tidak ditemukan");
        }
    }
    
}
