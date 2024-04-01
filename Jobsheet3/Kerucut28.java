package Jobsheet3;

public class LimasSamaSisi {
    int jarijari;
    int sisialas;

    LimasSamaSisi(int j, int sa){
        jarijari = j;
        sisialas = sa;
    }

    double hitungVolume(){
        double vol = 0;
        double luasAlas = 3.14 *jarijari*jarijari;
        double tinggi = Math.sqrt(Math.pow(sisialas, 2)-
                        Math.pow(jarijari, 2));
        vol= 1.0/3.0*luasAlas*tinggi;
        return vol;
    }
    double hitungLuasPermukaan(){
        double lp =0;
        lp = 3.14*jarijari*
    }
}
