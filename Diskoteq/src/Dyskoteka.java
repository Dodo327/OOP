import java.util.Iterator;
import java.util.Random;

public class Dyskoteka {
    public static void main(String[] args) {
        Hol hol = new Hol();
        Sala salaMala = new Sala(51);
        Sala salaDuza = new Sala(75);
        OchroniarzMaly ochroniarzMaly = new OchroniarzMaly();
        OchroniarzDuzy ochroniarzDuzy = new OchroniarzDuzy();

        goLive(hol, ochroniarzDuzy, ochroniarzMaly, salaMala, salaDuza);
    }

    public static void invateAll(Hol hol, OchroniarzDuzy od, OchroniarzMaly om, Sala sm, Sala sd) {
        Random r = new Random();
        Iterator<Uczestnik> it = hol.uczestnicy.iterator();
        while (it.hasNext()) {
            int ochrona = r.nextInt(0, 2);

            if (ochrona == 0) {
                if (om.check(it.next(), sm, sd)) it.remove();
            } else {
                if (od.check(it.next(), sm, sd)) it.remove();
            }
        }
    }

    public static void goLive(Hol hol, OchroniarzDuzy od, OchroniarzMaly om, Sala sm, Sala sd) {
        invateAll(hol, od, om, sm, sd);
        od.printStrangers();
    }
}
