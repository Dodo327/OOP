package Whatever;

import java.util.Random;

public class Larwa extends ObiektyZiemne{
    double masa;

    public Larwa(int wartoscOd){
        super(wartoscOd);
        Random random = new Random();
        masa = random.nextDouble(2.0, 3.0);
    }
}
