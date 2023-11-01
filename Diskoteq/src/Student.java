

public class Student extends Uczestnik {

    Student() {
        this.wiek = r.nextInt(18, 27);
        this.imie = imionaMenskie[r.nextInt(0, 10)];
        this.nazwisko = nazwiskaMenskie[r.nextInt(0, 10)];
        this.id = nr;
        nr++;
    }

}
