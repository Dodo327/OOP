package Kontrola;

import java.util.Arrays;

public abstract class Samolot implements Pojazd {

    protected int iloscPaliwa, iloscZalogi;
    protected String miejsceOdlotu;
    protected int[] czasPrzylotu;

    public Samolot(int iloscPaliwa, int iloscZalogi, String miejsceOdlotu, int[] czasPrzylotu) throws WyjatekTransportu {
        this.iloscPaliwa = iloscPaliwa;
        this.iloscZalogi = iloscZalogi;
        this.miejsceOdlotu = miejsceOdlotu;
        this.czasPrzylotu = czasPrzylotu;

        if (iloscZalogi < 2) {
            throw new WyjatekTransportu("Wczoraj były urodziny kapiutana, nie polecimy");
        }
        if (iloscPaliwa < 200) {
            throw new WyjatekBrakuPaliwa("Mamy wyciek paliwa, bez paniki proszę");
        }
    }

    @Override
    public int getIloscPaliwa() throws WyjatekBrakuPaliwa {
        if (iloscPaliwa <= 50) {
            iloscPaliwa = 50;
            throw new WyjatekBrakuPaliwa("Samolot został skierowany na lądowanie awaryjne na najbliższe lotnisko");
        }
        return iloscPaliwa;
    }

    @Override
    public void zuzyciePaliwa(int paliwo) {
        this.iloscPaliwa -= paliwo;
    }

    public int getIloscZalogi() {
        return iloscZalogi;
    }

    public String getMiejsceOdlotu() {
        return miejsceOdlotu;
    }

    public int[] getCzasPrzylotu() {
        return czasPrzylotu;
    }

    @Override
    public String toString() {
        return "Kontrola.Samolot{" +
                "iloscPaliwa=" + iloscPaliwa +
                ", iloscZalogi=" + iloscZalogi +
                ", miejsceOdlotu='" + miejsceOdlotu + '\'' +
                ", czasPrzylotu=" + Arrays.toString(czasPrzylotu) +
                '}';
    }
}
