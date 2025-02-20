package GUI.Action_Listener.Action2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Action extends JFrame {

    private Container c;
    private JTextField tf1, tf2;

    Action() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);

        tf1 = new JTextField();
        tf1.setBounds(20, 20, 200, 50);
        c.add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(20, 80, 200, 50);
        c.add(tf2);

        Handler handler = new Handler();
        tf1.addActionListener(handler);
        tf2.addActionListener(handler);
    }

    class Handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==tf1){
                String s = tf1.getText();
                if(s.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Enter something");
                }
                else{
                    JOptionPane.showMessageDialog(null,"TF 1 = "+s);
                }
            }

            else
            {
                String s = tf2.getText();
                if(s.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Enter something");
                }
                else{
                    JOptionPane.showMessageDialog(null,"TF 2 = "+s);
                }
            }
        }
       
    }
        
    public static void main(String[] args) {
        Action textFile = new Action();
        textFile.setVisible(true);
        textFile.setBounds(400, 200, 800, 500);
        textFile.setTitle("Action Listener");
        textFile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
}
