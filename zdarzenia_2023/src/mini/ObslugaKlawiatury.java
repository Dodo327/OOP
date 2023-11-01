package mini;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ObslugaKlawiatury implements KeyListener {
    Okno okno;

    public ObslugaKlawiatury(Okno okno) {
        this.okno = okno;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int przycisk = e.getKeyCode();
        switch (przycisk){
            case KeyEvent.VK_R:
                okno.setColor(Color.RED);
                break;

            case KeyEvent.VK_B:
                okno.setColor(Color.BLUE);
                break;

            case KeyEvent.VK_W:
                okno.setColor(Color.WHITE);
                break;

            case KeyEvent.VK_Y:
                okno.setColor(Color.YELLOW);
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
}
