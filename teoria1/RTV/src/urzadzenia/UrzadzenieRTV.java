package urzadzenia;

import java.time.LocalDate;
import java.util.Random;

public abstract class UrzadzenieRTV {
    LocalDate dataProdukcji;
    final int numerSeryjny;
    static int iloscObiektow = 0;
    String nazwa;
    int iloscWlaczen;
    boolean wlaczone;

    public UrzadzenieRTV(LocalDate dataProdukcji, String nazwa, int iloscWlaczen, boolean wlaczone) {
        Random random = new Random();

        iloscObiektow++;
        this.dataProdukcji = dataProdukcji;
        this.numerSeryjny = iloscObiektow;
        this.nazwa = nazwa;
        this.iloscWlaczen = iloscWlaczen;
        this.wlaczone = wlaczone;
    }
}
