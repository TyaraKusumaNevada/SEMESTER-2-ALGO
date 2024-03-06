package QUIZ;
import java.util.Scanner;
public class mainPegawai {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Pegawai: ");
        int n = scanner.nextInt();
        Pegawai pgw[] = new Pegawai[n];

        for (int i = 0; i < pgw.length; i++) {
            System.out.printf("Masukkan detail untuk Pegawai %d:\n", i + 1);
            System.out.print("Nama: ");
            String nama = scanner.next();
            System.out.print("Masa Kerja (Tahun): ");
            int masaKerjaThn = scanner.nextInt();
            System.out.print("Jam Lembur: ");
            double jamLembur = scanner.nextDouble();
            System.out.print("Gaji Pokok: ");
            int gajiPokok = scanner.nextInt();

            pgw[i] = new Pegawai (nama, masaKerjaThn, jamLembur, gajiPokok);
        }
        scanner.close();

        double gajiTotalRata = 0;
        int hitungPgwLebih5thn = 0;
        for(Pegawai pegawai : pgw){
            if (pegawai.masaKerjaThn > 5) {
                gajiTotalRata += pegawai.hitungGajiTotal();
                hitungPgwLebih5thn++;
            }
        }
        gajiTotalRata /= hitungPgwLebih5thn;

        double gjLemburTerbesar = 0;
        Pegawai pgwiGJLemburTerbesar = null;
        for(Pegawai pegawai : pgw){
            double gajiLemburPegawai = pegawai.hitungGajiLembur();
            if(gajiLemburPegawai > gjLemburTerbesar){
                gjLemburTerbesar = gajiLemburPegawai;
                pgwiGJLemburTerbesar = pegawai;
            }
        }
        
        for (int i = 0; i < pgw.length; i++){
            System.out.println("Berikut data Pegawai:");
            pgw[i].printData();
        }

        System.out.println("Gaji total rata-rata pegawai (Masa kerja > 5 tahun): "+ gajiTotalRata);
        System.out.println();
        System.out.println("Pegawai dengan gaji lembur terbesar yang bekerja kurang dari 5 tahun: ");
        pgwiGJLemburTerbesar.printData();
    }
}

