package GUI.Password.Password1;

import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.Font;


public class Password extends JFrame{

    private Container c;
    private JPasswordField pf;
    private Font f;

    Password (){
        initComponents();
    }

    public void initComponents(){

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        f = new Font("Arial",Font.BOLD, 40);


        pf = new JPasswordField();
        pf.setEchoChar('*');
        pf.setBounds(20,20,200,50);
        pf.setForeground(Color.BLUE);
        pf.setBackground(Color.PINK);
        pf.setFont(f);
        c.add(pf);

    }

    public static void main (String[] args){

        Password password = new Password();
        password.setVisible(true);
        password.setBounds(500,200,600,400);
        password.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        password.setTitle("Password");
    }
}