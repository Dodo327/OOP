package urzadzenia;

import java.time.LocalDate;

public abstract class Telewizor extends UrzadzenieRTV implements Udzwiekowienie, Obrazowanie{

    double przekatna;
    String rodzajSygnalu;
    int odbieranyKanal;

    enum Rodzaj{
        analogowy, cyfrowy
    }

    public Telewizor(LocalDate dataProdukcji, String nazwa, int iloscWlaczen, boolean wlaczone, double przekatna, int odbieranyKanal, Rodzaj syg) {
        super(dataProdukcji, nazwa, iloscWlaczen, wlaczone);
        this.przekatna = przekatna;
        this.odbieranyKanal = odbieranyKanal;
        this.rodzajSygnalu = String.valueOf(syg);
    }
}
