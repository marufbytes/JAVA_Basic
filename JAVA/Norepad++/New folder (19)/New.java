import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.Color;


public class New extends JFrame{

    private Container c;
    private JLabel level;

    New(){
        initComponents();
        }

        public void initComponents(){
            this.setVisible(true);
            this.setBounds(500,300,500,300);
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            this.setTitle("New Frame");

            c = this.getContentPane();
            c.setLayout(null);
            c.setBackground(Color.ORANGE);

            level = new JLabel("SUCCESSFUL !!! ");
            level.setBounds(190,70,300,100);
            c.add(level);

        }

    public static void main (String[] args){
        New fr = new New();
    }
}
