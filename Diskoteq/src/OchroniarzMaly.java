import java.util.Random;

public class OchroniarzMaly {
    Random r = new Random();

    public boolean check(Uczestnik u, Sala sm, Sala sd) {
        if (u.wiek >= 18) {
            int nrSala = r.nextInt(0, 2);
            if (nrSala == 0) {
                try {
                    sm.dodajUczestnika(u);
                } catch (ZaDuzoLudu e) {
                    return false;
                }
            } else if (nrSala == 1) {
                try {
                    sd.dodajUczestnika(u);
                } catch (ZaDuzoLudu e) {
                    return false;
                }

            } else return false;
        }
        return true;
    }
}
