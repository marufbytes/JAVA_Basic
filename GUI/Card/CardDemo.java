package GUI.Card;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

class CardDemo extends JFrame implements ActionListener{

    private  Container c;
    private  CardLayout cl;
    private  JButton btn1, btn2, btn3;

    CardDemo(){
        initcomponents();
    }

    public void initcomponents(){

        c = this.getContentPane();

        cl = new CardLayout(20,20);
        c.setLayout(cl);

        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");

        c.add(btn1, "First");
        c.add(btn2,"Second");
        c.add(btn3,"Third");

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
       
    }

    public void actionPerformed(ActionEvent e){

        cl.next(c);
    }

    public static void main(String[] args) {
        
        CardDemo frame = new CardDemo();
        frame.setVisible(true);
        frame.setBounds(900,200,600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}