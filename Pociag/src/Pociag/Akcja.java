package Pociag;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Akcja {
    public static void main(String[] args) {
        Pociag pociag = new Pociag();
        Peron peron = new Peron();
        Random r = new Random();

        for (Pasazer p : peron.peron) {
            pociag.kierownik.ladujPas(p, pociag.wagony.get(r.nextInt(0, pociag.wagony.size())));
        }

        try {
            pociag.lokomotywa.go();


        } catch (RozjebanaLokomotywa e) {
            System.out.println("Koniec Jazdy!");
            for (int i = 0; i < pociag.wagony.size(); i++) {
                Wagon w = pociag.wagony.get(i);
                for (int j = 0; j < w.przedzialy.size(); j++) {
                    Przedzial p = w.przedzialy.get(j);
                    p.przedzial.clear();
                    p.polkaBagaze.clear();
                }
            }
        }

        Konduktor k = pociag.konduktorzy[r.nextInt(0, pociag.konduktorzy.size())];


    }
}
