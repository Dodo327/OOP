package Pociag;

import java.util.ArrayList;
import java.util.Random;

public class Wagon {
    Random r = new Random();

    ArrayList<Przedzial> przedzialy = new ArrayList<>();
    ArrayList<Pasazer> korytarz = new ArrayList<>();
    int maxPas = r.nextInt(6, 9);
    int ilPrzedz = r.nextInt(6,11);

    public Wagon() {
        for (int i = 0; i <= ilPrzedz; i++) {
            przedzialy.add(i, new Przedzial(maxPas));
        }
    }

    public Przedzial getKPrzedzial(int n) {
        return przedzialy.get(n);
    }

    public void info() {
        int ilePrzedz = przedzialy.size();
        int pasPrzedz = przedzialy.get(1).przedzial.size();

    }

}
