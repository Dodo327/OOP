import javax.swing.*;
import java.awt.*;

public class Label extends JFrame{
    public Label() {
        this.setVisible(true);
        this.setSize(400, 400);
        this.setTitle("PIPI");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        ImageIcon im = new ImageIcon("obrazek.png");
        this.setIconImage(im.getImage());
        this.getContentPane().setBackground(Color.CYAN);
        //this.getContentPane().setBackground(new Color(0, 0, 0));

        JLabel label = new JLabel();
        label.setText("PI PI PI PI");
        this.add(label);
        ImageIcon im2 = new ImageIcon("obrazek.png");
        label.setIcon(im2);
        label.setHorizontalTextPosition(JLabel.RIGHT); //względem obrazka
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.red);
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setIconTextGap(20);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(BorderFactory.createLineBorder(Color.green, 3));
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        this.setLayout(null);
        label.setBounds(75,0, 250,250);
        //this.pack(); //dopasowuje rozmiar do label


    }

    public static void main(String[] args) {
        /*
        JFrame jframe = new JFrame();
        jframe.setVisible(true);
        jframe.setSize(400, 400);
        jframe.setTitle("PIPI");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setResizable(false);
        jframe.setLocation(400, 400);
        //ImageIcon im = new ImageIcon("logo.png");
        //jframe.setIconImage(im.getImage());
        jframe.getContentPane().setBackground(Color.CYAN);
        //jframe.getContentPane().setBackground(new Color(0, 0, 0));
        */

        new Label();
    }
}