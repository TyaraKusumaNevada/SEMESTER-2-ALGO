package Jobsheet3;

import java.util.Scanner;

public class ArrayObjects28 {
    public static class PersegiPanjang {
        public int panjang;
        public int lebar;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan panjang array");
        int length = sc.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[length];

        for (int i = 0; i < 3; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang:");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar:");
            ppArray[i].lebar  = sc.nextInt();

        }

        for (int i = 0; i < 3; i++) {
            System.out.println("persegi panjang ke-" + i);
            System.out.println("panjang "+ ppArray[i].panjang + ppArray[i].lebar); 
        }
    }
}