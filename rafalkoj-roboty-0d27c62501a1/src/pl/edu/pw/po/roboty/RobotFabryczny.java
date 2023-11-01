package pl.edu.pw.po.roboty;

import pl.edu.pw.po.zasoby.Imiona;
import pl.edu.pw.po.zasoby.Zadania;

public abstract class RobotFabryczny extends Robot{
    Zadania zadanie;

    public RobotFabryczny(Imiona nazwa, int zadanie) {
        super(nazwa);
        if (zadanie  == 1) this.zadanie = Zadania.skrawanie;
        else if (zadanie == 2) this.zadanie = Zadania.zgrzewanie;
        else if (zadanie == 3) this.zadanie = Zadania.modelowanie;
        else if (zadanie == 4) this.zadanie = Zadania.podnosnik;
        else if (zadanie == 5) this.zadanie = Zadania.lakierowanie;
        else if (zadanie == 6) this.zadanie = Zadania.sklejanie;
    }

    public Zadania getZadanie() {
        return zadanie;
    }

    public void setZadanie(Zadania zadanie) {
        this.zadanie = zadanie;
    }
    public boolean equals(Robot robot){

        if (robot instanceof RobotFabryczny){
            if (((RobotFabryczny) robot).zadanie != zadanie){
                return false;
            }
            return super.equals(robot);
        }else {return false;}
    }

}
