

public class CzlowiekZZewnatrz extends Uczestnik{

    private final int plec = r.nextInt(0,2);

    public CzlowiekZZewnatrz() {
        if (plec == 0) {
            this.wiek = r.nextInt(16, 41);
            this.imie = imionaMenskie[r.nextInt(0, 10)];
            this.nazwisko = nazwiskaMenskie[r.nextInt(0, 10)];
        } else {
            this.wiek = r.nextInt(16, 41);
            this.imie = imionaZenskie[r.nextInt(0, 10)];
            this.nazwisko = nazwiskaZenskie[r.nextInt(0, 10)];
        }
        id = nr;
        nr++;
    }
}
