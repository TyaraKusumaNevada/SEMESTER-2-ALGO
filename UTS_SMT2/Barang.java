package UTS_SMT2;
import java.util.Scanner;
public class Barang {
    
        int Stok;
        String kode;
        String nama;
        String kategori;
        double hargaSatuan;
    
        public Barang(String kode, String nama, String kategori, double hargaSatuan, int Stok) {
            this.kode = kode;
            this.nama = nama;
            this.kategori = kategori;
            this.hargaSatuan = hargaSatuan;
            this.Stok = Stok;
        }
    
        public void tambahStok(int tambahan) {
            Stok += tambahan;
        }
    
        public void kurangiStok(int pengurangan) {
            if (Stok >= pengurangan) {
                Stok -= pengurangan;
            } else {
                System.out.println("Stok tidak mencukupi untuk pengurangan tersebut.");
            }
        }
    
        public int getStok() {
            return Stok;
        }
    
        public String getNama() {
            return nama;
        }
    }

    



