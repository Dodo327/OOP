import java.util.Objects;
import java.util.Random;

public abstract class Uczestnik {
    Random r = new Random();
    protected int id, wiek;
    protected static int nr = 1;
    protected String imie, nazwisko;
    static final String[] imionaZenskie = {"Ola", "Ania", "Zofia", "Natalia", "Zuzanna", "Maja", "Hanna", "Julia", "Oliwia", "Nadia"};
    static final String[] imionaMenskie = {"Paweł", "Miłosz", "Bartek", "Mateusz", "Mikołaj", "Hubert", "Michał", "Krzychu", "Wiktor", "Łukasz"};
    static final String[] nazwiskaZenskie = {"Nowak", "Kowalska", "Lewandowska", "Kamińska", "Kowalczyk", "Wójcik", "Wiśniewska", "Poniatowska", "Sienkiewicz", "Słowacka"};
    static final String[] nazwiskaMenskie = {"Nowak", "Kowalski", "Lewandowski", "Kamiński", "Kowalczyk", "Wójcik", "Wiśniewski", "Poniatowski", "Sienkiewicz", "Słowacki"};


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Uczestnik uczestnik = (Uczestnik) o;
        return id == uczestnik.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
