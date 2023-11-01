package mini;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class Okno extends JFrame {

    private String tekst = "";
    private int x, y;
    private int[][] punkty = new int[2][100000];
    private int iloscPunktow = 0;

    private Color color;

    public Okno() {

        setSize(500, 500);
        setTitle("O B S L U G A   M Y S Z Y");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(500, 200);
        OblugaMyszy om = new OblugaMyszy(this);
        ObslugaKlawiatury ok = new ObslugaKlawiatury(this);
        addMouseListener(om);
        addMouseMotionListener(om);
        addKeyListener(ok);

    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString(tekst, x, y);
        g.setColor(color);
        g.drawPolyline(punkty[0], punkty[1], iloscPunktow);
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void addPunkt(int x, int y) {
        punkty[0][iloscPunktow] = x;
        punkty[1][iloscPunktow] = y;
        iloscPunktow++;
    }


    public void setColor(Color color) {
        this.color = color;
    }

    public static void main(String[] args) {
        new Okno();

    }

}
