package Jobsheet5;

public class HotelMain {
    public static void main(String[] args) {
        HotelService list = new HotelService();
        Hotel h1 = new Hotel("Sumber Makmur", "TulungAgung", 350000, (byte)3);
        Hotel h2 = new Hotel("Kreta Kencana", "Blitar", 145000, (byte)2);
        Hotel h3 = new Hotel("Gudang Garam", "Kediri", 550000, (byte)5);
        Hotel h4 = new Hotel("Mekar Sari", "Probolinggo", 90000, (byte)1);
    
        list.tambahHotel(h1);
        list.tambahHotel(h2);
        list.tambahHotel(h3);
        list.tambahHotel(h4);
    
        System.out.println("Data Harga Hotel sebelum sorting:");
        list.tampil();
    
        System.out.println("Daftar Hotel Berdasarkan Bintang");
        System.out.println("Metode Bubble Sort");
        list.bubbleSortRtHotel();
        list.tampil();
        System.out.println("Metode Selection Sort");
        list.selectionSortRtHotel();;
        list.tampil();
    
        System.out.println("Daftar Hotel Berdasarkan Harga");
        System.out.println("Metode Bubble Sort");
        list.bubbleSortHrgHotel();
        list.tampil();
        System.out.println("Metode Selection Sort");
        list.selectionSortHrgHotel();
        list.tampil();
    }
}

