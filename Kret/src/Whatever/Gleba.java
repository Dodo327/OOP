package Whatever;

import java.util.Random;

public class Gleba extends ObiektyZiemne{
    double gestosc;

    Gleba(int wartoscOd){
        super(wartoscOd);
        Random random = new Random();
        gestosc = random.nextDouble(1.4, 2.4);
    }
}
