package Pociag;

import java.util.LinkedHashSet;

public class Peron {
    LinkedHashSet<Pasazer> peron = new LinkedHashSet<>(500);;

    public Peron() {
        for (int i = 0; i <= 500; i++) {
            peron.add(new Pasazer());
        }
    }
}
