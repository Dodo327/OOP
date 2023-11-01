package urzadzenia;

import java.time.LocalDate;
import java.util.Random;

public abstract class UrzadzenieRTV implements Odbieranie{
    LocalDate dataProdukcji;
    final int nrSeryjny;
    static int liczbaObiektow = 0;
    String nazwa;
    int liczbaWlaczen;
    boolean wlaczone = false;

    public UrzadzenieRTV(LocalDate dataProdukcji, int liczbaWlaczen) {
        liczbaObiektow++;
        Random r = new Random();
        String nazwa = "";
        String alfabet = "abcdefghijklmnopqrtstuwyxz";
        for (int i = 0; i < 5; i++){
            int x = r.nextInt(0,25);
            nazwa += alfabet.charAt(x);
        }

        this.dataProdukcji = dataProdukcji;
        this.nrSeryjny = liczbaObiektow;
        this.liczbaWlaczen = liczbaWlaczen;
        this.nazwa = nazwa + nrSeryjny;
    }

    @Override
    public String toString() {
        return "UrzadzenieRTV{" +
                "dataProdukcji=" + dataProdukcji +
                ", nrSeryjny=" + nrSeryjny +
                ", nazwa='" + nazwa + '\'' +
                ", iloscWlaczen=" + liczbaWlaczen +
                ", wlaczone=" + wlaczone +
                '}';
    }

    public void wlacz() throws Exception {
        if (liczbaWlaczen > 0){
            Random random = new Random();
            if (random.nextInt(1,10) > 1){
                wlaczone = true;
                liczbaWlaczen--;
            }else {
                liczbaWlaczen = 0;
                throw new Exception("Urządzenie się zepsuło");
            }
        }else {
            System.out.println("Urządzenie nie działa");
        }
    }

    public void wylacz(){
        wlaczone = false;
    }
}
