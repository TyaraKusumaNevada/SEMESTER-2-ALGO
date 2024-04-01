package Jobsheet6;

import java.util.Scanner;

public class PencarianBuku28 {
    Buku28 listBk[] = new Buku28[5];
    int idx;

    void tambah(Buku28 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku28 m : listBk) {
            if (m != null) {
            m.tampilDataBuku();
            }

        }
    }
    

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < idx; j++) {
            if (listBk[j].kodeBuku == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data : " + x + " Tidak ditemukan");
        }
    }

    public void TampilData(int x , int pos) {
        if (pos != -1) {
            System.out.println("Judul: " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit: " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang: " + listBk[pos].pengarang);
            System.out.println("Stok: " + listBk[pos].stock);
          } else {
            System.out.println("Data " + x + " tidak ditemukan");
          }
    }



    public Buku28 FindBuku(int kodeBuku) {
        Buku28 buku = null;
        int posisi = FindSeqSearch(kodeBuku);
        if (posisi != -1) {
            buku = listBk[posisi];
        }
        return buku;
    }

    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >=left){
            mid = (right) /2;
            if (cari == listBk[mid].kodeBuku){
                return (mid);
            }else if(listBk[mid].kodeBuku > cari) {
                return FindBinarySearch(cari, left, mid);
            }else {
                return FindBinarySearch(cari, mid, right);

            }
        }
        return -1;

    }
}