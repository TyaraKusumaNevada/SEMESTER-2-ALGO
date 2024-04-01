package QUIZ;
import java.util.ArrayList;

//class Pegawai1 {
    private String nama;
    private int masaKerja; // dalam tahun
    private double gajiPokok; // dalam rupiah per bulan

    public Pegawai1(String nama, int masaKerja, double gajiPokok) {
        this.nama = nama;
        this.masaKerja = masaKerja;
        this.gajiPokok = gajiPokok;
    }

    public String getNama() {
        return nama;
    }

    public int getMasaKerja() {
        return masaKerja;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public double hitungTunjangan() {
        if (masaKerja < 5) {
            return 0.25 * gajiPokok;
        } else {
            return 0.5 * gajiPokok;
        }
    }

    public double hitungGajiLembur() {
        double persentaseLembur = masaKerja < 5 ? 0.05 : 0.1;
        return persentaseLembur * gajiPokok;
    }

    public double hitungGajiTotal() {
        return gajiPokok + hitungTunjangan() + hitungGajiLembur();
    }
}

//public class Main {
    //public static void main(String[] args) {
        // Inisialisasi data pegawai
        ArrayList<Pegawai1> daftarPegawai = new ArrayList<>();
        daftarPegawai.add(new Pegawai("John", 3, 5000000));
        daftarPegawai.add(new Pegawai("Jane", 6, 7000000));
        daftarPegawai.add(new Pegawai("Doe", 2, 6000000));
        daftarPegawai.add(new Pegawai("Smith", 8, 8000000));

        // Menghitung gaji total rata-rata dari pegawai dengan masa kerja > 5 tahun
        double totalGaji = 0;
        int jumlahPegawai = 0;
        for (Pegawai pegawai : daftarPegawai) {
            if (pegawai.getMasaKerja() > 5) {
                totalGaji += pegawai.hitungGajiTotal();
                jumlahPegawai++;
            }
        }
        double rataGaji = totalGaji / jumlahPegawai;
        System.out.println("Rata-rata gaji total dari pegawai dengan masa kerja > 5 tahun: " + rataGaji);

        // Mencari gaji lembur terbesar dari pegawai dengan masa kerja < 5 tahun
        double gajiLemburTerbesar = 0;
        Pegawai pegawaiLemburTerbesar = null;
        for (Pegawai pegawai : daftarPegawai) {
            if (pegawai.getMasaKerja() < 5 && pegawai.hitungGajiLembur() > gajiLemburTerbesar) {
                gajiLemburTerbesar = pegawai.hitungGajiLembur();
                pegawaiLemburTerbesar = pegawai;
            }
        }
        System.out.println("Data pegawai dengan gaji lembur terbesar:");
        System.out.println("Nama: " + pegawaiLemburTerbesar.getNama());
        System.out.println("Gaji Lembur: " + gajiLemburTerbesar.hitungGajiLembur());
    }
}



























package QUIZ;

public class Pegawai {
        private String nama;
        private int masaKerja;
        private double gajiPokok;
    
        public Pegawai(String nama, int masaKerja, double gajiPokok) {
            this.nama = nama;
            this.masaKerja = masaKerja;
            this.gajiPokok = gajiPokok;
        }
    
        public double hitungGajiTotal() {
            double tunjangan;
            double gajiLembur;
            if (masaKerja < 5) {
                tunjangan = 0.25 * gajiPokok;
                gajiLembur = 0.05 * gajiPokok;
            } else {
                tunjangan = 0.5 * gajiPokok;
                gajiLembur = 0.1 * gajiPokok;
            }
            return gajiPokok + gajiLembur;
        }
    
        // Main method program
        public static void main(String[] args) {
            // data pegawai 
            Pegawai[] pegawaiArray = {
                new Pegawai("Neva", 2, 3000),
                new Pegawai("Nanda", 9, 4000),
                new Pegawai("Budi", 3, 3500)
            };
    
            // Hitung gaji total rata-rata dari pegawai masa kerja > 5 thn
            double totalGaji = 0;
            int jumlahPegawai = 0;
            for (Pegawai pegawai : pegawaiArray) {
                if (pegawai.masaKerja > 5) {
                    totalGaji += pegawai.hitungGajiTotal();
                    jumlahPegawai++;
                }
            }
            double rataRataGaji = totalGaji / jumlahPegawai;
            System.out.println("Rata-rata gaji total dari pegawai dengan masa kerja > 5 tahun yaitu: " + rataRataGaji);
    
            // Mencari gajiLemburTerbesar dari pegawai masa kerja < 5 thn
            double gajiLemburTerbesar = 0;
            Pegawai pegawaiDenganGajiLemburTerbesar = null;
            for (Pegawai pegawai : pegawaiArray) {
                if (pegawai.masaKerja < 5) {
                    double gajiLembur = pegawai.hitungGajiTotal() - pegawai.gajiPokok - (pegawai.masaKerja < 5 ? 0.25 * pegawai.gajiPokok : 0.5 * pegawai.gajiPokok);
                    if (gajiLembur > gajiLemburTerbesar) {
                        gajiLemburTerbesar = gajiLembur;
                        pegawaiDenganGajiLemburTerbesar = pegawai;
                    }
                }
            }
            System.out.println("Data pegawai dengan gaji lembur terbesar:");
            System.out.println("Nama: " + pegawaiDenganGajiLemburTerbesar.nama);
            System.out.println("Masa Kerja: " + pegawaiDenganGajiLemburTerbesar.masaKerja);
            System.out.println("Gaji Total: " + pegawaiDenganGajiLemburTerbesar.hitungGajiTotal());
        }
    }
     

