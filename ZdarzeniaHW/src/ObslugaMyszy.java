import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class ObslugaMyszy implements MouseListener, MouseMotionListener {

    private Okno okno;

    public ObslugaMyszy(Okno okno) {
        this.okno = okno;
    }

    @Override
    public void mouseClicked(MouseEvent e){
        okno.addlKlikMysz();
        okno.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        okno.setX(e.getX());
        okno.setY(e.getY());
        okno.repaint();
    }
}
