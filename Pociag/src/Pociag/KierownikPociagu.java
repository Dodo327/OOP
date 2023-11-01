package Pociag;

import java.util.Random;

public class KierownikPociagu {

    public void ladujPas(Pasazer p, Wagon w) {
        for (int i = 0; i < w.ilPrzedz; i++) {
            if (w.przedzialy.get(i).przedzial.size() < w.maxPas) {
                w.przedzialy.get(i).przedzial.add(p);
                w.przedzialy.get(i).polkaBagaze.addAll(p.bagaze);
                return;
            }
        }
        w.korytarz.add(p);
    }
}
