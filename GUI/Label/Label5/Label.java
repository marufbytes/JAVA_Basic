package GUI.Label.Label5;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.Color;

public class Label extends JFrame {

    private Container c;
    private JLabel imgLabel;
    private ImageIcon img;


    Label() {
        initComponents();
    }

    public void initComponents() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);

        img = new ImageIcon(getClass().getResource("Back.png"));

        imgLabel = new JLabel(img);
        imgLabel.setBounds(50,30,img.getIconWidth(),img.getIconHeight());
        c.add(imgLabel);

    }

    public static void main(String[] args) {
        Label label = new Label();
        label.setVisible(true);
        label.setBounds(600, 300, 600, 400);
        label.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label.setTitle("PHASE 1");
    }
}
