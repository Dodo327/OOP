package Whatever;

import java.util.Random;

public class Chalkolit extends ObiektyKopalniane{
    int radioakt;

    public Chalkolit(double wartosc) {
        Random random = new Random();
        this.radioakt = random.nextInt(700, 950);
        this.wartosc = wartosc;
    }
}
