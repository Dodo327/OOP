package pl.edu.pw.po.test;

import pl.edu.pw.po.roboty.*;
import pl.edu.pw.po.zasoby.Imiona;

public class Main {

    public static void main(String[] args) {

        Robot[] roboty = new Robot[9];

        roboty[0] = new RobotDomowy(Imiona.Roman2);
        roboty[1] = new RobotDomowy(Imiona.Ala2);
        roboty[2] = new RobotDomowy(Imiona.Ala2);
        roboty[3] = new RobotProdukcja(Imiona.Robert01, 3);
        roboty[4] = new RobotProdukcja(Imiona.ZosiaSamosia, 3);
        roboty[5] = new RobotProdukcja(Imiona.Roman2, 4);
        roboty[6] = new RobotSkladanie(Imiona.Adam1000, 3);
        roboty[7] = new RobotSkladanie(Imiona.Aleks900,5);
        roboty[8] = new RobotSkladanie(Imiona.Adam1000,3);

        for (int i = 0; i < roboty.length; i++){
            System.out.println(roboty[i]);
            if (roboty[i] instanceof RobotDomowy){
                ((RobotDomowy) roboty[i]).przywitanie();
            }
            if (roboty[i] instanceof RobotFabryczny){
                ((RobotSkladanie) roboty[i]).meldunek();
            }
            if (roboty[i] instanceof RobotSkladanie){
                ((RobotSkladanie) roboty[i]).zadanieWykonaj();
            }
        }
        if (roboty[6].equals(roboty[8])){
            System.out.println("Są identyczne roboty");
        }else {
            System.out.println("Brak identycznych robotów" );
        }
        
    }
}
