package urzadzenia;

import java.time.LocalDate;

public abstract class Telewizor extends UrzadzenieRTV implements Udzwiekowanie, Obrazowanie{
    int przekatna;
    rodzajSygnalu rSygnalu;
    int odbieranyKanal;

    public Telewizor(LocalDate dataProdukcji, int liczbaWlaczen, int przekatna,
                     rodzajSygnalu rSygnalu) {
        super(dataProdukcji, liczbaWlaczen);
        this.przekatna = przekatna;
        this.rSygnalu = rSygnalu;
    }

    @Override
    public String toString() {
        return "Telewizor{" +
                "przekatna=" + przekatna +
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
    public void wlaczObraz() {
        System.out.println("Ekran włączony.");
    }

    @Override
    public void wylaczObraz() {
        System.out.println("Ekran wyłączony.");
    }

    @Override
    public void wybor(int dana) {
        odbieranyKanal = dana;
    }

    @Override
    public void wlaczDzwiek() {
        System.out.println("Dźwięk włączony.");
    }

    @Override
    public void wylaczDzwiek() {
        System.out.println("Dźwięk wyłączony.");
    }
}
