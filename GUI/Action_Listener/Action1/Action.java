package GUI.Action_Listener.Action1;

import javax.swing.JFrame;
//import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Container;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Action extends JFrame {


    private Container c;
    private JTextField tf1,tf2;

    Action() {
        initComponents();
    }

    public void initComponents() {
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        tf1 = new JTextField();
        tf1.setBounds(50,50,150,50);
        c.add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(50,110,150,50);
        c.add(tf2);

        tf1.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                String s = tf1.getText();

                if (s.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Enter any word/ Sentense");
                }
                
                else
                {
                    JOptionPane.showMessageDialog(null,"TF 1 = "+s);
                }
               
            }

        });

        tf2.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){

                String d = tf2.getText();
                if(d.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Enter Something");
                }

                else{
                    JOptionPane.showMessageDialog(null,"TF 2 = "+d);
                }


            }
        });

      
  
    }

    public static void main(String[] args) {
        Action textFile = new Action();
        textFile.setVisible(true);
        textFile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textFile.setBounds(500, 250, 600, 400);
        textFile.setTitle("TITLE");
    }
}
