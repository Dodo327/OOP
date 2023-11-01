package pl.edu.pw.po.roboty;

import pl.edu.pw.po.zasoby.Imiona;
import pl.edu.pw.po.zasoby.PorozumieniePlus;

import java.time.LocalDate;
import java.util.Random;

public final class RobotSkladanie extends RobotFabryczny implements PorozumieniePlus {
    Random r = new Random();
    int limit = r.nextInt(1,10);

    public RobotSkladanie(Imiona nazwa, int zadanie) {
        super(nazwa, zadanie);
    }

    @Override
    public void zadanieWykonaj() {
        super.zadanieWykonaj();
        if (ileZadan > limit){
            ileZadan = limit;
            System.out.println("Za dużo zadań");
        }
    }

    @Override
    public void meldunek() {
        System.out.println("Robot żyje " + LocalDate.now().compareTo(dataProdukcji) + " dni");
        System.out.println("Zostało " + (limit - ileZadan) + " zadań do zrobienia");
    }

    @Override
    public void przywitanie() {
        System.out.println(nazwa + " o nr fabrycznym " + nrFabryczny + " mówi witaj!");
    }

    @Override
    public String toString() {
        return "RobotSkladanie{" +
                ", limit=" + limit +
                ", zadanie=" + zadanie +
                ", dataProdukcji=" + dataProdukcji +
                ", nazwa='" + nazwa + '\'' +
                ", indentyfikator='" + indentyfikator + '\'' +
                ", ileZadan=" + ileZadan +
                ", nrFabryczny=" + nrFabryczny +
                '}';
    }

    public boolean equals(Robot robot){

        if (robot instanceof RobotSkladanie){
            if (((RobotSkladanie) robot).limit != limit){
                return false;
            }
            return super.equals(robot);
        }else {return false;}
    }
}
