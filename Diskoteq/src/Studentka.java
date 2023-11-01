

public class Studentka extends Uczestnik{

    public Studentka() {
        this.wiek = r.nextInt(18, 27);
        this.imie = imionaZenskie[r.nextInt(0, 10)];
        this.nazwisko = nazwiskaZenskie[r.nextInt(0, 10)];
        this.id = nr;
        nr++;
    }
}
