package Jobsheet10;

public class NFilm {
    int id;
    String judul;
    double rating;
    NFilm prev, next;

    NFilm(int id, String judul, double rating) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}

