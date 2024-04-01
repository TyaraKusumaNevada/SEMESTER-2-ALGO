package Cobacoba;

public class book{
    // Atribut
    private String title;
    private String author;
    private int year;
    private int pages;

    // Konstruktor
    public book(String title, String author, int year, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    // Metode untuk menampilkan informasi buku
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Pages: " + pages);
    }

    // Method untuk mengecek apakah buku termasuk buku yang panjang
    public boolean isLong() {
        return pages > 300;
    }

    // Method main untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek Book
        book myBook = new book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997, 320);

        // Memanggil metode displayInfo untuk menampilkan informasi buku
        System.out.println("Book Information:");
        myBook.displayInfo();

        // Memanggil metode isLong untuk mengecek apakah buku termasuk buku yang panjang
        if (myBook.isLong()) {
            System.out.println("This book is long.");
        } else {
            System.out.println("This book is not long.");
        }
    }
}
