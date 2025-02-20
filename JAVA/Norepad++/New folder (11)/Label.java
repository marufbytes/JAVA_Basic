import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.Color;
import java.awt.Font;

public class Label extends JFrame{

    private ImageIcon icon,img;
    private Container c;
    private JLabel userLabel, passLabel, imgLabel;
    private Font f;

    Label (){
        initComponents();
    }

    public void initComponents(){

        icon = new ImageIcon(getClass().getResource("image.png"));
        this.setIconImage(icon.getImage());



        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);

        f = new Font("Arial", Font.ITALIC, 14);

        userLabel = new JLabel("Enter Username : ");
        userLabel.setBounds(20,40,300,30);
        userLabel.setFont(f);
        userLabel.setForeground(Color.MAGENTA);
        userLabel.setOpaque(true);
        userLabel.setBackground(Color.CYAN);
        userLabel.setToolTipText("Username");
        c.add(userLabel);

        passLabel = new JLabel("Enter Password : ");
        passLabel.setBounds(20,80,300,30);
        passLabel.setFont(f);
        passLabel.setForeground(Color.MAGENTA);
        passLabel.setOpaque(true);
        passLabel.setBackground(Color.CYAN);
        passLabel.setToolTipText("PASSWORD");
        c.add(passLabel);

    }

    public static void main(String[] args) {

        Label label = new Label();
        label.setVisible(true);
        label.setBounds(600,300,600,400);
        label.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label.setTitle("PHASE 1 ");
        
    }
}