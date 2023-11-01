import javax.swing.*;
import java.awt.*;

public class Okno extends JFrame {
    private int x = 0, y = 0;
    private int lKlikMysz;
    private int lKlikKlaw;

    public Okno() {
        setSize(500, 500);
        setLocation(500, 200);
        setTitle("O   K   N   O");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        ObslugaMyszy om = new ObslugaMyszy(this);
        ObslugaKlawiatury ok = new ObslugaKlawiatury(this);
        addMouseListener(om);
        addMouseMotionListener(om);
        addKeyListener(ok);

        this.repaint();


    }
    @Override
    public void paint(Graphics g) {
        int x = 0;
        try {
            x = getlKlikMysz();
        } catch (WyjatekSumaKlikniec e){
            setlKlikKlaw(0);
            setlKlikMysz(0);
        } finally {
            super.paint(g);
            g.drawString("wpółrzędne myszy: x = " + getX() + ", y = " + getY(), 150, 150);
            g.drawString("ilość kliknięć klawiatury: " + x, 150, 160);
            g.drawString("ilość kliknięć klawiatury: " + getlKlikKlaw(), 150, 170);
        }

    }
    @Override
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getlKlikMysz() throws WyjatekSumaKlikniec {
        if (lKlikMysz > 10) throw new WyjatekSumaKlikniec();
        return lKlikMysz;
    }

    public void addlKlikMysz() {
        this.lKlikMysz++;
    }

    public int getlKlikKlaw() {
        return lKlikKlaw;
    }

    public void addlKlikKlaw() {
        this.lKlikKlaw++;
    }

    public void setlKlikMysz(int lKlikMysz) {
        this.lKlikMysz = lKlikMysz;
    }

    public void setlKlikKlaw(int lKlikKlaw) {
        this.lKlikKlaw = lKlikKlaw;
    }

    public static void main(String[] args) {
        new Okno();
    }
}
