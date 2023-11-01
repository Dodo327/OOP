package grafika;

public class Punkt {
    int x;
    int y;

    void wyswietlWspolrzedne(){
        System.out.println("punkt.x = " + this.x);
        System.out.println("punkt.y = " + this.y);
    }
    int getX(){
        return x;
    }

    void setX(int wspX){
        x = wspX;
    }
    void setXY(int wspX, int wspY){
        x = wspX;
        y = wspY;
    }
    void setXY(Punkt punkt){
        this.x = punkt.x;
        this.y = punkt.y;
    }
    Punkt getPunkt(){
        Punkt punkt = new Punkt();
        punkt.x = x;
        punkt.y = y;
        return punkt;
    }
    Punkt(){
        x = 1;
        y = 2;
    }
    Punkt(int x, int y){
        this.x = x;
        this.y = y;
    }
    Punkt(Punkt punkt){
        x = punkt.x;
        y = punkt.y;
    }

    @Override
    public String toString(){
        return "Punkt o współrzędnych (" + x + "," + y + ")";
    }
}
