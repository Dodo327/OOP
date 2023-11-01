package Kontrola;

public interface Pojazd {
    int getIloscPaliwa() throws WyjatekBrakuPaliwa;
    void zuzyciePaliwa(int paliwo);

}
