import java.awt.*;
import javax.swing.*;
public class ContainerExample {
    private static void createExemplarGUI() {
// Create and set up the window.
        JFrame frame = new JFrame("Listing 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// menu
        JMenuBar greenMenuBar = new JMenuBar();
        greenMenuBar.setOpaque(true);
        greenMenuBar.setBackground(new Color(204, 204, 255));
        greenMenuBar.setPreferredSize(new Dimension(200, 20));
// label
        JLabel myLabel = new JLabel();
        myLabel.setOpaque(true);
        myLabel.setBackground(new Color(214, 224, 180));
        myLabel.setPreferredSize(new Dimension(200, 180));
        frame.setJMenuBar(greenMenuBar);
        frame.getContentPane().add(myLabel, BorderLayout.CENTER);
// show
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createExemplarGUI();
            }
        });
    }
}