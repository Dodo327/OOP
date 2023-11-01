package Whatever;

import java.util.Random;

public class Uranit extends ObiektyKopalniane{
    String forma;
    int radioakt;

    public Uranit(double wartosc) {
        Random random = new Random();
        String[] formy = {"uranofan", "torbernit", "foumarieryt"};
        this.forma = formy[random.nextInt(0,2)];
        this.radioakt = random.nextInt(700, 950);
        this.wartosc = wartosc;
    }
}
