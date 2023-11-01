import javax.swing.*;
import java.awt.*;

public class Panel extends JFrame {
    public Panel(){
        this.setVisible(true);
        this.setSize(600, 800);
        this.setTitle("PIPI");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        //ImageIcon im = new ImageIcon("logo.png");
        //this.setIconImage(im.getImage());
        this.getContentPane().setBackground(Color.CYAN);
        //this.getContentPane().setBackground(new Color(0, 0, 0));
        this.setLayout(null);


        JPanel yelpanel = new JPanel();
        yelpanel.setBackground(Color.yellow);
        yelpanel.setBounds(0,0,250, 250);
        yelpanel.setLayout(new BorderLayout());
        this.add(yelpanel);

        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(250,0,250, 250);
        redpanel.setLayout(new BorderLayout());
        this.add(redpanel);

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0,250,500, 500);
        greenpanel.setLayout(null);
        this.add(greenpanel);

        JLabel label = new JLabel("PIPIPI");
        greenpanel.add(label);
//        label.setVerticalAlignment(JLabel.BOTTOM);
//        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(50,50, 75, 75);





    }

    public static void main(String[] args) {
        new Panel();
    }
}
