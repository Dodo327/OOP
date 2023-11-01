package urzadzenia;

import java.time.LocalDate;

public final class Radio extends UrzadzenieRTV implements Udzwiekowanie{
    String czestotliwosc;

    public Radio(LocalDate dataProdukcji, int iloscWlaczen) {
        super(dataProdukcji, iloscWlaczen);
    }

    @Override
    public String toString() {
        return "Radio{" +
                "czestotliwosc=" + czestotliwosc +
                ", dataProdukcji=" + dataProdukcji +
                ", nrSeryjny=" + nrSeryjny +
                ", nazwa='" + nazwa + '\'' +
                ", liczbaWlaczen=" + liczbaWlaczen +
                ", wlaczone=" + wlaczone +
                '}';
    }

    @Override
    public void wlaczDzwiek() {
        System.out.println("Dźwięk włączony.");
    }

    @Override
    public void wylaczDzwiek() {
        System.out.println("Dźwięk wyłączony.");
    }

    @Override
    public void wybor(int dana) {
        if (1000 < dana & dana <= 20000){
            czestotliwosc = "DŁUGIE";
        } else if (200 < dana & dana <= 1000) {
            czestotliwosc = "ŚREDNIE";
        } else if (10 < dana & dana <= 200) {
            czestotliwosc = "KRÓTKIE";
        }else if (1 <= dana & dana <= 10){
            czestotliwosc = "UHF";
        }
    }
}
