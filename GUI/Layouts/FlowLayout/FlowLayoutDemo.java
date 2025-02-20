package GUI.Layouts.FlowLayout;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class FlowLayoutDemo extends JFrame{

    private Container c;
    private JButton buttons[];
    private  FlowLayout flayout;

    FlowLayoutDemo(){
        initcomponents();
    }

    public void initcomponents(){

        c = this.getContentPane();

        flayout = new FlowLayout(FlowLayout.LEFT,10,15);
        //flayout.setHgap(10);
        //flayout.setVgap(10);
        c.setLayout(flayout);
        c.setBackground(Color.DARK_GRAY);

        buttons = new JButton[9];
        for(int i=0;i<9;i++){

            buttons[i]=new JButton(" "+(i+1));
            c.add(buttons[i]);
        }
    }

    public static void main(String[] args) {
        
        FlowLayoutDemo frame = new FlowLayoutDemo();
        frame.setVisible(true);
        frame.setBounds(900,200,600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}