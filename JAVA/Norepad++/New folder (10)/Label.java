import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Container;
import java.awt.Color;
import java.awt.Font;


public class Label extends JFrame {
  

    private ImageIcon icon; 
    private Container c;
    private JLabel userLabel,passLabel;
    private Font f;

    Label() {
        initcomponents();
    }

    public void initcomponents(){

        icon = new ImageIcon(getClass().getResource("image.png"));
        this.setIconImage(icon.getImage());

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.DARK_GRAY);

        f=new Font("Arial",Font.ITALIC,14);

        userLabel = new JLabel("Enter Username : ");
        userLabel.setBounds(20,40,150,30);
        userLabel.setFont(f);
        userLabel.setForeground(Color.RED);
        userLabel.setOpaque(true);
        userLabel.setBackground(Color.WHITE);
        c.add(userLabel);

        passLabel = new JLabel("Enter password : ");
        passLabel.setBounds(20,100,150,30);
        passLabel.setFont(f);
        passLabel.setForeground(Color.RED);
        passLabel.setOpaque(true);
        passLabel.setBackground(Color.WHITE);
        c.add(passLabel);
    }

    public static void main(String[] args) {
        
        Label level = new Label();
        level.setVisible(true);
        level.setDefaultCloseOperation(EXIT_ON_CLOSE);
        level.setBounds(600,300,500,300);
        level.setTitle("Phase 1 ");
    }
}