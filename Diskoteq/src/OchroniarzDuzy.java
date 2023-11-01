public class OchroniarzDuzy extends OchroniarzMaly {
    RejestrObcych rejestrObcych = new RejestrObcych();

    @Override
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
        if (u instanceof CzlowiekZZewnatrz) {
            rejestrObcych.dodanieDoRejestru((CzlowiekZZewnatrz) u);
        }
        return true;
    }

    public void printStrangers() {
        System.out.println(rejestrObcych);
    }
}
