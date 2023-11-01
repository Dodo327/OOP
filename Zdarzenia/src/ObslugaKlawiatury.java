import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ObslugaKlawiatury implements KeyListener
{
    private Okno okno;
    public ObslugaKlawiatury(Okno okno)
    {
        this.okno = okno;
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e)
    {
        char klawisz = e.getKeyChar();
        switch (klawisz)
        {
            case 'g':
                okno.setKolor(Color.GREEN); break;
            case 'b':
                okno.setKolor(Color.BLUE); break;
            case 'r':
                okno.setKolor(Color.RED); break;
            case 'y':
                okno.setKolor(Color.YELLOW); break;
//            default:
//                okno.setKolor(Color.BLACK);
        }
        okno.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {}
}

