import java.util.Scanner;
public class Jumlah {
   
    static Scanner c = new Scanner(System.in);
    static String menu[] = { " Menghitung Kecepatan", " Menghitung jarak", " Menghitung Waktu", "exit"};
    static boolean exit=true;

    public static void main(String[] args) {
        do {
            System.out.println(" Pilih Menu: ");
            for (int i = 1; i < menu.length + 1; i++) {
                System.out.println(i + " " + menu[i - 1]);
            }
            System.out.print(" =");
            char input = c.next().charAt(0);

            switch (input) {
                case '1':
                    hitungjarak();
                    break;
                case '2':
                    hitungkecepatan();
                    break;
                case '3':
                    hitungwaktu();
                    break;
                case '4':
                exit = false;
                    break;
                default:
                    System.out.println("pilihan anda tidak ada di menu");
                    break;
            }
        } while (exit);
    }

    public static void hitungkecepatan() {
        Scanner c = new Scanner(System.in);

        System.out.print("Masukkan jarak(km): ");
        double scale = c.nextDouble();
        System.out.print("Masukkan waktu(jam): ");
        double time = c.nextDouble();
        double velocity = scale / time;
        System.out.println(" Hasilnya adalah: " + velocity);
    }
    public static void hitungjarak() {
        Scanner c = new Scanner(System.in);
        System.out.print("Masukkan kecepatan(km/jam): ");
        double velocity = c.nextDouble();
            System.out.print("Masukkan waktu(jam): ");
        double time = c.nextDouble();
        double scale = velocity * time;
            System.out.println("Hasilnya adalah: " + scale);

    }
    public static void hitungwaktu() {
        Scanner c = new Scanner(System.in);
        System.out.print("Masukkan jarak(km): ");
        double scale = c.nextDouble();
            System.out.print("Masukkan kecepatan(km/jam): ");
        double velocity = c.nextDouble();
        double time = scale / velocity;
            System.out.println("Hasilnya adalah: " + time);

    }

    
}

