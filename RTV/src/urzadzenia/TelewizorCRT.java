package urzadzenia;

import java.time.LocalDate;

public class TelewizorCRT extends Telewizor{
    String kolor;

    public TelewizorCRT(LocalDate dataProdukcji, int liczbaWlaczen, int przekatna, String kolor) {
        super(dataProdukcji, liczbaWlaczen, przekatna, rodzajSygnalu.ANALOGOWY);
        this.kolor = kolor;
    }

    @Override
    public String toString() {
        return "TelewizorCRT{" +
                "kolor='" + kolor + '\'' +
                ", przekatna=" + przekatna +
                ", rSygnalu=" + rSygnalu +
                ", odbieranyKanal=" + odbieranyKanal +
                ", dataProdukcji=" + dataProdukcji +
                ", nrSeryjny=" + nrSeryjny +
                ", nazwa='" + nazwa + '\'' +
                ", liczbaWlaczen=" + liczbaWlaczen +
                ", wlaczone=" + wlaczone +
                '}';
    }
}
