package grafika;

public class Punkt3D extends Punkt {
    private int z;

    void setZ(int z) {
        this.z = z;
    }

    int getZ() {
        return z;
    }

    void setXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void wyswietlWspolrzedne() {
        super.wyswietlWspolrzedne();
        System.out.println("punkt.z = " + this.z);
    }

    Punkt3D(){
        super();
        z = 3;
    }

    Punkt3D(int x, int y, int z){
        super(x, y);
        this.z = z;
    }

    Punkt3D(Punkt3D punkt){
        super(punkt);
        this.z = punkt.z;
    }
}