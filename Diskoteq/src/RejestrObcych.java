import java.util.HashMap;
import java.util.HashSet;

public class RejestrObcych {

    private HashMap<String, HashSet<CzlowiekZZewnatrz>> rejestr = new HashMap<>();


    public boolean sprawdzCzyWRejestrze(CzlowiekZZewnatrz p){
        if (!rejestr.containsKey(p.imie)) return true;

        return !rejestr.get(p.imie).contains(p);
    }

    public void dodanieDoRejestru(CzlowiekZZewnatrz p) {
        if (sprawdzCzyWRejestrze(p)) {
            if (rejestr.containsKey(p.imie)) {
                rejestr.get(p.imie).add(p);
            } else {
                rejestr.put(p.imie, new HashSet<>());
                rejestr.get(p.imie).add(p);
            }
        }
    }

    @Override
    public String toString() {
        return rejestr.keySet().toString();
    }
}
