package GUI.Action_Listener.Action3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Action extends JFrame implements ActionListener{

    private Container c;
    private JButton btn1, btn2, btn3;

    Action (){
        initComponents();
    }

    public void initComponents(){

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        btn1 = new JButton("RED");
        btn1.setBounds(50,50,100,50);
        btn1.setBackground(Color.WHITE);
        c.add(btn1);

        btn2 = new JButton("GREEN");
        btn2.setBounds(50,150,100,50);
        btn2.setBackground(Color.WHITE);
        c.add(btn2);

        btn3 = new JButton("BLUE");
        btn3.setBounds(50,250,100,50);
        btn3.setBackground(Color.WHITE);
        c.add(btn3);

        /*
         
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                c.setBackground(Color.RED);
            }
        });

        btn2.addActionListener(new ActionListener(){
           public void  actionPerformed(ActionEvent e){
                c.setBackground(Color.GREEN);
            }
        });

        btn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                c.setBackground(Color.BLUE);
            }
        });
         */

         
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e){

         if(e.getSource()==btn1){

            c.setBackground(Color.RED);
         }
         else if(e.getSource()==btn2){

            c.setBackground(Color.GREEN);
         }
         else{
            c.setBackground(Color.BLUE);
         }
    }
    
    public static void main(String[] args){
        Action action = new Action();
        action.setVisible(true);
        action.setBounds(400,300,600,400);
        action.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
    }
}