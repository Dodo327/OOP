import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Sala {
    Collection<Uczestnik> uczestnicy = new LinkedHashSet<>();
    final int maxPojemnosc;

    public Sala(int maxPojemnosc) {
        this.maxPojemnosc = maxPojemnosc;
    }

    public boolean obecnosc(Uczestnik u) {
        return uczestnicy.contains(u);
    }

    public void dodajUczestnika(Uczestnik u) throws ZaDuzoLudu{
        if (uczestnicy.size() == maxPojemnosc) {
            throw new ZaDuzoLudu();
        } else {
            uczestnicy.add(u);
        }
    }
}
