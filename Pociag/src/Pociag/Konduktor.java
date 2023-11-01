package Pociag;

public class Konduktor {

    public void sprawdzajBilety(Pociag pociag) throws BrakBiletu{
        for (Wagon w : pociag.wagony) {
            for (Przedzial p : w.przedzialy) {
                for (Pasazer pas : p.przedzial) {
                    if (pas.getBilet() == null) {
                        throw new BrakBiletu();
                    }
                }
            }
        }
    }
}
