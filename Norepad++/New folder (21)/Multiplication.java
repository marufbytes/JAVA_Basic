import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Container;
import java.awt.Color;


public class Multiplication extends JFrame{

    private Container c;
    private JLabel imgLabel,textLabel;
    private JTextField tf;
    private JButton btn;
    private JTextArea ta;
    private ImageIcon img;

    Multiplication (){
        initComponents();
    }

    public void initComponents (){

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(1000,50,500,750);
        setTitle("Multiplication Table ");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);

        img = new ImageIcon(getClass().getResource("cover.png"));

        imgLabel = new JLabel(img);
        imgLabel.setBounds(20,10,350,232);
        c.add(imgLabel);

        textLabel = new JLabel("Enter any number : ");
        textLabel.setBounds(20,350,200,50);
        c.add(textLabel);

    }

    public static void main (String[] args){

        Multiplication multiplication = new Multiplication();
        
    }
}