package pl.edu.pw.po.roboty;

import pl.edu.pw.po.zasoby.Imiona;

public final class RobotProdukcja extends RobotFabryczny{

    public RobotProdukcja(Imiona nazwa, int zadanie) {
        super(nazwa, zadanie);
    }

    @Override
    public String toString() {
        return "RobotProdukcja{" +
                "zadanie=" + zadanie +
                ", dataProdukcji=" + dataProdukcji +
                ", nazwa='" + nazwa + '\'' +
                ", indentyfikator='" + indentyfikator + '\'' +
                ", ileZadan=" + ileZadan +
                ", nrFabryczny=" + nrFabryczny +
                '}';
    }

    public boolean equals(Robot robot){

        if (robot instanceof RobotProdukcja){
            return super.equals(robot);
        }else {return false;}
    }
}
