package Jobsheet12;
import java.util.Scanner;
public class GraphMain29 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // Inisialisasi graf dengan jumlah node
        Graph29 graf = new Graph29(6);
        // Menambahkan edge (koneksi antar node)
        graf.addEdge(0, 1, 50);
        graf.addEdge(0, 2, 100);
        graf.addEdge(1, 3, 70);
        graf.addEdge(2, 3, 40);
        graf.addEdge(3, 4, 60);
        graf.addEdge(4, 5, 80);

        // Menampilkan graf
        graf.printGraph();

        // Input node asal dan tujuan dari pengguna
        System.out.print("Masukkan gedung asal : ");
        int asal = scanner.nextInt();
        System.out.print("Masukkan gedung tujuan : ");
        int tujuan = scanner.nextInt();

        // Cek apakah node asal dan tujuan saling bertetangga
        boolean isNeighbour = graf.isNeighbour(asal, tujuan);
        if (isNeighbour) {

            System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan)+ " bertetangga ");

        } else {

            System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan)+ "tidak bertetangga");

        }

        scanner.close();

    }

}
    
