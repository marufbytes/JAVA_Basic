import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Container;

class Label extends JFrame{

    private Container c;
    private ImageIcon icon;
    private JLabel userLabel,passLabel;

    Label(){
        initComponents();
    }

    public void initComponents(){

        
        icon = new ImageIcon(getClass().getResource("image.png"));
        this.setIconImage(icon.getImage());

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        userLabel = new JLabel("Enter your usernaem ");
        userLabel.setBounds(20,5,500,30);
        c.add(userLabel);

        passLabel = new JLabel("Enter your Password : ");
        passLabel.setBounds(20,45,500,30);
        c.add(passLabel);

    }


    public static void main (String [] args){

        Label frame = new Label();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(600,300,300,200);
        frame.setTitle("TITLE");
    }

}