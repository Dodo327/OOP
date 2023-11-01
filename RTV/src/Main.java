import urzadzenia.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        UrzadzenieRTV[] urzadzenia = new UrzadzenieRTV[6];

        urzadzenia[0] = new Radio(LocalDate.of(1944,12,3), 1);
        urzadzenia[1] = new Radio(LocalDate.of(2019,6,12),20);

        urzadzenia[2] = new TelewizorCRT(LocalDate.of(1988,11,30), 100,
                20, "czarno-biały");
        urzadzenia[3] = new TelewizorCRT(LocalDate.of(1990,10,20), 200,
                15, "czarno-biały");

        urzadzenia[4] = new TelewizorPlaski(LocalDate.of(2020, 12,20), 500,
                40,rodzajSygnalu.CYFROWY, Matryca.LED);
        urzadzenia[5] = new TelewizorPlaski(LocalDate.of(2021, 1,10), 600,
                50,rodzajSygnalu.CYFROWY, Matryca.LCD);

        for (int i = 0; i < 6; i++){
            if (urzadzenia[i] instanceof Telewizor){
                try {
                    ((Telewizor)urzadzenia[i]).wlacz();
                }catch (Exception ignored){
                }
            }
        }

        urzadzenia[0].wybor(10000);
        urzadzenia[1].wybor(10);

        for (int i = 0; i < 6; i++){
            System.out.println(urzadzenia[i]);
        }

        urzadzenia[0].wybor(10000);
    }
}