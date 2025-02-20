package GUI.Box;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBox extends JFrame{

    private Container c;
    private JCheckBox javaCheckBox, cCheckBox, mySqlCheckBox;
    private Font f;
    private ButtonGroup grp;
    private JLabel label;

    CheckBox (){
        initcomponents();
    }

    public void initcomponents(){

        this.setVisible(true);
        this.setBounds(500,300,500,350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("CHECK BOX ");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        f = new Font("Times New Roman",Font.BOLD,20);

        javaCheckBox = new JCheckBox("Java");
        javaCheckBox.setBounds(50,50,80,30);
        javaCheckBox.setBackground(Color.PINK);
        javaCheckBox.setFont(f);
        c.add(javaCheckBox);

        cCheckBox = new JCheckBox("C",true);
        cCheckBox.setBounds(50,100,80,30);
        cCheckBox.setBackground(Color.PINK);
        cCheckBox.setFont(f);
        c.add(cCheckBox);

        mySqlCheckBox = new JCheckBox("My SQL");
        mySqlCheckBox.setBounds(50,150,100,30);
        mySqlCheckBox.setBackground(Color.PINK);
        mySqlCheckBox.setFont(f);
        c.add(mySqlCheckBox);

        grp = new ButtonGroup();
        grp.add(javaCheckBox);
        grp.add(cCheckBox);
        grp.add(mySqlCheckBox);

        label = new JLabel("You have selected ...");
        label.setBounds(50,200,300,30);
        label.setFont(f);
        c.add(label);

       /* Handler handler = new Handler();

        javaCheckBox.addActionListener(handler);
        cCheckBox.addActionListener(handler);
        mySqlCheckBox.addActionListener(handler);
         */ 

         //Item Listener :

         Handler handler = new Handler();

         javaCheckBox.addItemListener(handler);
         cCheckBox.addItemListener(handler);
         mySqlCheckBox.addItemListener(handler);
        
    }

    class Handler implements ItemListener{

        public void itemStateChanged(ItemEvent ie){

            if(ie.getSource() == javaCheckBox){
                label.setText("you selected Java");
            }

            else if (ie.getSource()==cCheckBox){
                label.setText("you selected C");
            }

            else{
                label.setText("You havae selected My SQL");
            }

        }
            
    }

    /*class Handler implements ActionListener{

      public void actionPerformed(ActionEvent e){

           if(e.getSource()==javaCheckBox){

            label.setText("You have selected Java");
           }

           else if(cCheckBox.isSelected()){


            label.setText("You have selected C");
           }

           else{

            label.setText("You have selected My SQL");
           }

        }

    }*/

    public static void main(String[] args){

        CheckBox box = new CheckBox();   
        
    }
}