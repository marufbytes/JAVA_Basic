import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JLabel;

public class Label extends JFrame {

    private ImageIcon icon;
    private Container c;
    private JLabel userLabel;


   Label(){
    initComponents();
   };

    public void initComponents(){
       
        icon = new ImageIcon(getClass().getResource("image.png"));
        this.setIconImage(icon.getImage());

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.MAGENTA);

        userLabel = new JLabel();
        userLabel.setText("Enter your username : ");
        userLabel.setBounds(20,10,500,50);
        c.add(userLabel);
        
       

 }

 public static void main(String[] args) {

    Label frame = new Label();

    frame.setVisible(true);
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    frame.setBounds(600,300,400,250);
    frame.setTitle("TITLE ");

 }
    
}
