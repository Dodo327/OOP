package Pociag;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Pociag {
    Lokomotywa lokomotywa = new Lokomotywa();;
    KierownikPociagu kierownik = new KierownikPociagu();;
    HashSet<Konduktor> konduktorzy = new HashSet<>();;
    ArrayList<Wagon> wagony = new ArrayList<>();;

    public Pociag() {
        Random r = new Random();
        int lWag = r.nextInt(5, 16);
        for (int i = 0; i < lWag; i++) {
            wagony.add(new Wagon());
        }

        int lKon = r.nextInt(1, 5);
        for (int i = 0; i < lKon; i++) {
            konduktorzy.add(new Konduktor());
        }

    }
}
