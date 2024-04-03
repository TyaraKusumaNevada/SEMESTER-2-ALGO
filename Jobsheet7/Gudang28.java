package Jobsheet7;

public class Gudang28 {
    Barang28[] tumpukan;
    int size;
    int top;

    public Gudang28(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang28[size];
        top = -1;
    }

    public  boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang28 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang suduah penuh");
        }
    }  
    
    public Barang28 ambilBarang28() {
        if (!cekKosong()) {
            Barang28 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang");
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang28 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang28 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public void tampilBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di gudang: ");
            for (int i = 0; i <= top; i++) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        }
    }
}

