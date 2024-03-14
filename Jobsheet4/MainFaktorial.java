package Jobsheet4;
import java.util.Scanner;
public class MainFaktorial {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("-----------------");
    System.out.println("Masukkan jumlah elemen: ");
    int iJml = sc.nextInt();

    BruteForceDivineConquer[] fk = new BruteForceDivineConquer[10];
    for(int i=0; i< iJml; i++){
        fk[i] = new BruteForceDivineConquer();
        System.out.println("masukkan nilai data ke-" + (i +1)+":");
        fk[i].nilai = sc.nextInt();
    }

    System.out.println("HASIL - BRUTE FORCE");
    for (int i=0; i < iJml; i++) {
        System.out.println("Hasil perhtungan faktorial menggunakan brute force adalah "+fk[i].faktorialBF(fk[i].nilai));
    }
    System.out.println(" HASIL - DIVINE AND CONQUER");
    for (int i=0; i < iJml; i++) {
        System.out.println("Hasil perhiungan faktorial menggunakan divide and conquer adalah "+fk[i].faktorialDC(fk[i].nilai));
    }
    }
}
