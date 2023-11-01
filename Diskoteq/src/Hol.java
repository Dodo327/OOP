import java.util.ArrayList;
import java.util.Collection;

public class Hol {
    Collection<Uczestnik> uczestnicy = new ArrayList<>();

    public Hol() {
        for (int i = 0; i < 30; i++) {
            uczestnicy.add(new Student());
            uczestnicy.add(new Studentka());
            uczestnicy.add(new CzlowiekZZewnatrz());
        }
    }
}
