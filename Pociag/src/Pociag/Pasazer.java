package Pociag;

import java.util.ArrayList;
import java.util.Random;

public class Pasazer {
    private Bilet bilet;
    ArrayList<Bagaz> bagaze = new ArrayList<>();
    static int licznik = 1;


    public Pasazer() {
        Random r = new Random();
        licznik++;
        if (licznik % 20 == 0) {
            this.bilet = new Bilet();
        } else this.bilet = null;

        int ileBag = r.nextInt(1, 4);
        for (int i = 0; i < ileBag; i++) {
            bagaze.add(new Bagaz());
        }
    }

    public Bilet getBilet() {
        return this.bilet;
    }
}
