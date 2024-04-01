package Jobsheet4;
import java.util.Scanner;
public class MainShowroom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom[] sr = new Showroom[8];

        
        for (int i = 0; i < sr.length; i++) {
            System.out.println("Data Mobil ke-" + (i + 1) + " = ");
            String m = sc.nextLine();
            System.out.print("Tipe: ");
            String typ = sc.nextLine();
            System.out.print("Tahun Produksi: ");
            String thn = sc.nextLine();
            System.out.print("Top Acceleration: ");
            int tA = sc.nextInt();
            System.out.print("Top Power: ");
            int tP = sc.nextInt();
            sc.nextLine();
            System.out.println();
            sr[i] = new Showroom(m, typ, thn, tA, tP);
        }

       //    Menampilkan data mobil
       //for (int i = 0; i < sr.length; i++) {
       //     System.out.println("Data Mobil ke-" + (i + 1));
         //   System.out.println("Merk: " + sr[i].merk());
           // System.out.println("Tipe: " + sr[i].tipe());
          //  System.out.println("Tahun Produksi: " + sr[i].Tahun());
          //  System.out.println("Top Acceleration: " + sr[i].TopAcceleration());
          //  System.out.println("Top Power: " + sr[i].TopPower());
           //  System.out.println();
      // }

        cariMinMaxAccelerationDC(sr, low:0, sr.length -1);
        ratarataTopPowerBF(sr);
        
    }
}