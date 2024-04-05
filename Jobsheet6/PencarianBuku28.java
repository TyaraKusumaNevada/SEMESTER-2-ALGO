package Jobsheet6;

import java.util.Arrays;

public class PencarianBuku28 {
    Buku28[] listBK = new Buku28[2];
    int idx;

    void tambah(Buku28 m) {
        if (idx < listBK.length) {
            listBK[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku28 m : listBK) {
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearchKode(String cari) {
        int posisi = -1;
        for (int j = 0; j < listBK.length; j++) {
            if (listBK[j].kodeBuku.equals(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public Buku28 FindBukuKode(String cari) {
        for (Buku28 buku : listBK) {
            if (buku.kodeBuku.equals(cari)) {
                return buku;
            }
        }
        return null;
    }

    public void TampilposisiKode(String x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public void TampilDataKode(String x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku \t : " + x);
            System.out.println("Judul     \t : " + listBK[pos].judulBuku);
            System.out.println("Tahun Terbit \t : " + listBK[pos].tahunTerbit);
            System.out.println("Pengarang \t : " + listBK[pos].pengarang);
            System.out.println("Stock     \t : " + listBK[pos].stock);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public int FindBinarySearchKode(String cari, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (cari.equals(listBK[mid].kodeBuku)) {
                return mid;
            } else if (cari.compareTo(listBK[mid].kodeBuku) < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public int FindSeqSearchJudul(String cari) {
        int count = 0;
        for (int j = 0; j < listBK.length; j++) {
            if (listBK[j].judulBuku.equalsIgnoreCase(cari)) {
                count++;
            }
        }
        return count;
    }

    public void TampilposisiJudul(String x, int count) {
        if (count > 1) {
            System.out.println("Peringatan: Judul buku " + x + " memiliki lebih dari satu hasil.");
        } else {
            System.out.println("Judul buku " + x + " ditemukan.");
        }
    }

    public void SortJudul() {
        Arrays.sort(listBK, (a, b) -> a.judulBuku.compareToIgnoreCase(b.judulBuku));
    }

    public int FindBinarySearchJudul(String cari, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (cari.equalsIgnoreCase(listBK[mid].judulBuku)) {
                return mid;
            } else if (cari.compareToIgnoreCase(listBK[mid].judulBuku) < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
