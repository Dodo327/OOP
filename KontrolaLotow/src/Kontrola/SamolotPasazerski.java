package Kontrola;

import java.util.Arrays;

public final class SamolotPasazerski extends Samolot{
    private final int maxIloscMiejsc;
    private int liczbaPasazerow;

    public SamolotPasazerski(int iloscPaliwa, int iloscZalogi, String miejsceOdlotu, int[] czasPrzylotu, int maxIloscMiejsc, int liczbaPasazerow) throws WyjatekTransportu {
        super(iloscPaliwa, iloscZalogi, miejsceOdlotu, czasPrzylotu);
        this.maxIloscMiejsc = maxIloscMiejsc;
        this.liczbaPasazerow = liczbaPasazerow;

        if (liczbaPasazerow < (maxIloscMiejsc /2)) {
            throw new WyjatekBiznesowy("Za mało pasażerów.");
        }
    }

    public int getMaxIloscMiejsc() {
        return maxIloscMiejsc;
    }

    public int getLiczbaPasazerow() {
        return liczbaPasazerow;
    }

    @Override
    public String toString() {
        return "SamolotPasazerski{" + "iloscPaliwa=" + iloscPaliwa +
                ", iloscZalogi=" + iloscZalogi +
                ", miejsceOdlotu='" + miejsceOdlotu  +
                ", czasPrzylotu=" + Arrays.toString(czasPrzylotu)+
                "maxIloscMiejsc=" + maxIloscMiejsc +
                ", liczbaPasazerow=" + liczbaPasazerow +
                '}';
    }
}
