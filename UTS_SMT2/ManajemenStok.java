package UTS_SMT2;
import java.util.Scanner;
public class ManajemenStok {
    Barang[] tumpukan;
    int size;
    int top;

    public ManajemenStok(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang[size];
        top = -1;
    }

    public boolean cekKosong() {
        return top == -1;
    }

    public boolean cekPenuh() {
        return top == size - 1;
    }

    public void tambahBarang(Barang brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan");
        } else {
            System.out.println("Stok barang masih penuh");
        }
    }

    public void tampilkanSemuaBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di gudang: ");
            for (int i = 0; i <= top; i++) {
                System.out.println("Kode " + tumpukan[i].kode + " Barang " + tumpukan[i].nama + " kategori " + tumpukan[i].kategori + " harga satuan " + tumpukan[i].hargaSatuan + " stok " + tumpukan[i].Stok);
            }
        }
    }

    public void urutkanStokMenaik() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (tumpukan[j].getStok() > tumpukan[j + 1].getStok()) {
                    Barang temp = tumpukan[j];
                    tumpukan[j] = tumpukan[j + 1];
                    tumpukan[j + 1] = temp;
                }
            }
        }
    }

    public void tampilkanMakananTanpaStok() {
        boolean adaMakananTanpaStok = false;
        for (int i = 0; i <= top; i++) {
            if (tumpukan[i].kategori.equalsIgnoreCase("drink") && tumpukan[i].Stok == 0) {
                System.out.println("Kode " + tumpukan[i].kode + " Barang " + tumpukan[i].nama + " kategori " + tumpukan[i].kategori + " harga satuan " + tumpukan[i].hargaSatuan + " stok " + tumpukan[i].Stok);
                adaMakananTanpaStok = true;
            }
        }
        if (!adaMakananTanpaStok) {
            System.out.println("Tidak ada makanan yang tidak memiliki stok.");
        }
    }

    public int cariBarang(String cari) {
        int posisi = -1;
        for (int j = 0; j <= top; j++) {
            if (tumpukan[j].nama.equalsIgnoreCase(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void tambahStok(String namaBarang, int jumlah) {
        int posisi = cariBarang(namaBarang);
        if (posisi != -1) {
            tumpukan[posisi].tambahStok(jumlah);
            System.out.println("Stok barang " + tumpukan[posisi].nama + " berhasil ditambahkan sebanyak " + jumlah);
        } else {
            System.out.println("Barang dengan nama " + namaBarang + " tidak dapat ditemukan.");
        }
    }

    public void kurangiStok(String namaBarang, int jumlah) {
        int posisi = cariBarang(namaBarang);
        if (posisi != -1) {
            tumpukan[posisi].kurangiStok(jumlah);
            System.out.println("Stok barang " + tumpukan[posisi].nama + " berhasil dikurangi sebanyak " + jumlah);
        } else {
            System.out.println("Barang dengan nama " + namaBarang + " tidak dapat ditemukan.");
        }
    }
}
