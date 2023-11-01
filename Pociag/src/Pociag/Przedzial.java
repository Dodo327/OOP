package Pociag;

import java.util.ArrayList;
import java.util.LinkedList;

public class Przedzial {
    ArrayList<Pasazer> przedzial = new ArrayList<>();
    LinkedList<Bagaz> polkaBagaze = new LinkedList<>();
    int maxPas;

    public Przedzial(int maxPas) {
        this.maxPas = maxPas;
    }

}
