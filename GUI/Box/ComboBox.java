package GUI.Box;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ComboBox extends JFrame{

    private Container c;
    private JComboBox cb;
    private JLabel label;
    private JButton btn;
    private String[] prolan = {"c","C++","Java","Python","HTML","Css","PHP"};
    
    ComboBox(){
        initcomponents();
    }

    public void initcomponents(){

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        cb = new JComboBox(prolan);
        cb.setBounds(50,100,200,50);
        cb.setEditable(true);
        cb.setSelectedIndex(4);//cb.setSelectedItem(Java);
        cb.addItem("Fortran");
        cb.addItem("Basic");
        cb.removeItem(0);
        c.add(cb);

        label = new JLabel();
        label.setBounds(50,300,200,50);
        c.add(label);

        btn = new JButton("Show");
        btn.setBounds(50,200,100,50);
        c.add(btn);

        System.out.println("Total Item : "+cb.getItemCount());

        btn.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){

                String s = cb.getSelectedItem().toString();
                label.setText("You have selected : "+s);
            }
        });
    }

    public static void main (String[] args){

        ComboBox box = new ComboBox();
        box.setVisible(true);
        box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        box.setVisible(true);
        box.setBounds(400,300,600,400);
    }
}