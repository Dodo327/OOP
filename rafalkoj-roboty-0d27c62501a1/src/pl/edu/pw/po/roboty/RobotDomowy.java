package pl.edu.pw.po.roboty;

import pl.edu.pw.po.zasoby.Imiona;
import pl.edu.pw.po.zasoby.PorozumieniePlus;

import java.time.LocalDate;

public class RobotDomowy extends Robot implements PorozumieniePlus {
    public RobotDomowy(Imiona nazwa) {
        super(nazwa);
    }

    @Override
    public String toString() {
        return "RobotDomowy{" +
                ", dataProdukcji=" + dataProdukcji +
                ", nazwa='" + nazwa + '\'' +
                ", indentyfikator='" + indentyfikator + '\'' +
                ", ileZadan=" + ileZadan +
                ", si=" + si +
                ", nrFabryczny=" + nrFabryczny +
                '}';
    }

    @Override
    public void meldunek() {
        System.out.println("Robot żyje " + LocalDate.now().compareTo(dataProdukcji) + " dni");
    }

    @Override
    public void przywitanie() {
        System.out.println(nazwa + " o nr fabrycznym " + nrFabryczny + " mówi witaj!");
    }

    public boolean equals(Robot robot){

        if (robot instanceof RobotDomowy){
            return super.equals(robot);
        }else {return false;}
    }
}
