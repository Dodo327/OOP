package urzadzenia;

import java.time.LocalDate;

public class TelewizorPlaski extends Telewizor implements OdbieranieRozszerzone{
    Matryca matryca;

    public TelewizorPlaski(LocalDate dataProdukcji, int liczbaWlaczen,
                           int przekatna, rodzajSygnalu rSygnalu, Matryca matryca) {
        super(dataProdukcji, liczbaWlaczen, przekatna, rSygnalu);
        this.matryca = matryca;
    }

    @Override
    public String toString() {
        return "TelewizorPlaski{" +
                "matryca=" + matryca +
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

    @Override
    public void odbierzSygnal(rodzajSygnalu sygnal) {
        rSygnalu = sygnal;
    }
}
