import javax.swing.*;
import java.awt.*;

public class Okno extends JFrame
{
    private String tekst = "";
    private Color kolor;
    private int x, y;
    private int[][] punkty = new int[2][100000];
    private int iloscPunktow;
    public Okno()
    {
        setSize(500,300);
        setTitle("O B S Ł U G A  M Y S Z Y");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(400,200);
        ObslugaMyszy om = new ObslugaMyszy(this);
        addMouseListener(om);
        addMouseMotionListener(om);
        ObslugaKlawiatury ok = new ObslugaKlawiatury(this);
        addKeyListener(ok);
        this.repaint();
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawString(tekst, x, y);
        g.setColor(kolor);
        g.drawPolyline(punkty[0],punkty[1],iloscPunktow);
    }

    public void addPunkt(int x, int y)
    {
        punkty[0][iloscPunktow] = x;
        punkty[1][iloscPunktow] = y;
        iloscPunktow++;
    }

    public void setTekst(String tekst)
    {
        this.tekst = tekst;
    }

    public void setKolor(Color kolor)
    {
        this.kolor = kolor;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public static void main(String[] args)
    {
        new Okno();
    }
}
