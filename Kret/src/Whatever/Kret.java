package Whatever;

import java.util.Random;

public class Kret implements MoleMotion{
    Gatunek gatunek;
    int wartoscOd;
    ObiektyZiemne[][] environment;

    Kret(Gatunek gatunek, ObiektyZiemne[][] environment){
        this.gatunek = gatunek;
        Random random = new Random();
        wartoscOd = random.nextInt(200, 240);
        this.environment = environment;

    }

    @Override
    public void goMole() {
        Random random = new Random();
        int x = random.nextInt(0, environment.length);
        int y = random.nextInt(0, environment[0].length);

        if (environment[x][y] == null){System.out.println("Pusto");
        }else{
            System.out.println("Mniam");
            System.out.println("Wartość odżywcza: " + environment[x][y].wartoscOd);
            System.out.println("x = " + x + " y = " + y);
            wartoscOd += environment[x][y].wartoscOd;
            environment[x][y] = null;
        }
    }
    @Override
    public int getNutritionalValue() {
        return wartoscOd;
    }
}
