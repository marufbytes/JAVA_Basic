import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ButtonAction extends JFrame{

    private Container c;
    private JTextField tf;
    private JButton btn;

    public ButtonAction(){

        initComponents();

    }

    public void initComponents(){
    
        c = this.getContentPane();    
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        tf = new JTextField();
        tf.setBounds(20,20,100,35);
        c.add(tf);

        btn = new JButton("Sumbmit");
        btn.setBounds(20,65,80,25);
        c.add(btn);

        btn.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                
            tf.setText("");

            }

        });
        
    }


    public static void main(String[] args) {

        ButtonAction ba = new ButtonAction();
        ba.setVisible(true);
        ba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ba.setBounds(500,300,500,300);
        ba.setTitle("Action Button");

    }
}