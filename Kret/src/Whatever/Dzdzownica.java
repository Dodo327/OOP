package Whatever;

import java.util.Random;

public class Dzdzownica extends ObiektyZiemne{
    double masa;

    public Dzdzownica(int wartoscOd) {
        super(wartoscOd);
        Random random = new Random();
        masa = random.nextDouble(0.5, 1.0);
    }
}
