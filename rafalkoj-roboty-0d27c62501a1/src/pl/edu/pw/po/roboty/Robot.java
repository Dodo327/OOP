package pl.edu.pw.po.roboty;

import pl.edu.pw.po.zasoby.Imiona;

import javax.swing.*;
import java.time.LocalDate;
import java.util.Random;


public abstract class Robot {
    protected Random r = new Random();
    protected LocalDate dataProdukcji;
    protected String nazwa;
    protected String indentyfikator;
    protected int ileZadan = 0;
    SztucznaInteligencja si;
    static int iloscRobotow = 1;
    final int nrFabryczny = iloscRobotow;

    public Robot(Imiona nazwa) {
        iloscRobotow ++;
        this.nazwa = String.valueOf(nazwa);

        int miesiac = r.nextInt(1,12);
        int dzien;
        if (miesiac == 1 | miesiac == 3 | miesiac == 5 | miesiac == 7 | miesiac == 8 | miesiac == 10| miesiac == 12){
            dzien = r.nextInt(1,31);
        } else if (miesiac == 4 | miesiac == 6 | miesiac == 9 | miesiac == 11){
            dzien = r.nextInt(1,31);
        } else {dzien = r.nextInt(1,28);}
        dataProdukcji = LocalDate.of(r.nextInt(2000, 2021), miesiac, dzien);

        String alfabet = "abcdefghijklmnopqrtstuwyxz";
        String ind = "";
        for (int i = 0; i < 5; i++){
            int j = r.nextInt(0,25);
            ind += alfabet.charAt(j);
        }
        indentyfikator = ind;
    }

    public void zadanieWykonaj(){
        ileZadan += r.nextInt(1,20);
    }

    public LocalDate getDataProdukcji() {
        return dataProdukcji;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getIndentyfikator() {
        return indentyfikator;
    }

    public int getIleZadan() {
        return ileZadan;
    }

    public int getNrFabryczny() {
        return nrFabryczny;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setIleZadan(int ileZadan) {
        this.ileZadan = ileZadan;
    }

    public void setSi(SztucznaInteligencja si) {
        this.si = si;
    }

    @Override
    public String toString() {
        return "Robot{" +
                ", dataProdukcji=" + dataProdukcji +
                ", nazwa='" + nazwa + '\'' +
                ", indentyfikator='" + indentyfikator + '\'' +
                ", ileZadan=" + ileZadan +
                ", si=" + si +
                ", nrFabryczny=" + nrFabryczny +
                '}';
    }

    public boolean equals(Robot robot){

        if (robot.dataProdukcji != dataProdukcji){
            return false;
        }
        if (robot.nazwa != nazwa){
            return false;
        }
        if (robot.indentyfikator != indentyfikator){
            return false;
        }
        return true;
    }
}
