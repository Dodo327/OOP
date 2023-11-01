import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ObslugaKlawiatury implements KeyListener {
    private Okno okno;

    public ObslugaKlawiatury(Okno okno) {
        this.okno = okno;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        okno.addlKlikKlaw();
        okno.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
