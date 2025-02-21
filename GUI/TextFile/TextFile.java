package GUI.TextFile;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
//import javax.swing.JTextField;
import java.awt.Font;

public class TextFile extends JFrame {

    private Container c;
    private JTextField tf1, tf2;
    private Font f;

    TextFile() {
        initComponents();
    }

    public void initComponents() {

        f = new Font("Arial", Font.ITALIC + Font.BOLD, 18);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        tf1 = new JTextField("Maruf ");
        tf1.setBounds(50, 50, 200, 50);
        tf1.setFont(f);
        tf1.setForeground(Color.CYAN);
        tf1.setOpaque(true);
        tf1.setBackground(Color.BLUE);
        c.add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(50, 110, 200, 50);
        tf2.setFont(f);
        tf2.setForeground(Color.CYAN);
        tf2.setOpaque(true);
        tf2.setBackground(Color.BLUE);
        c.add(tf2);

    }

    public static void main(String[] args) {
        TextFile textFile = new TextFile();
        textFile.setVisible(true);
        textFile.setBounds(500, 300, 600, 400);
        textFile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textFile.setTitle("TITLE ");
    }

}