package urzadzenia;

import java.time.LocalDate;

public final class Radio extends UrzadzenieRTV implements Udzwiekowienie{
    double czestotliwosc;

    public Radio(LocalDate dataProdukcji, String nazwa, int iloscWlaczen, boolean wlaczone, double czestotliwosc) {
        super(dataProdukcji, nazwa, iloscWlaczen, wlaczone);
        this.czestotliwosc = czestotliwosc;
    }
}
