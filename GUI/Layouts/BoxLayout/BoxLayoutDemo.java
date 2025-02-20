package GUI.Layouts.BoxLayout;

import java.awt.Color;
import java.awt.Container;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class BoxLayoutDemo extends JFrame{

    private Container c;
    private JButton buttons[];
    private  BoxLayout box;

    BoxLayoutDemo(){
        initcomponents();
    }

    public void initcomponents(){

        c = this.getContentPane();

        c.setBackground(Color.DARK_GRAY);

        buttons = new JButton[5];
        for(int i=0;i<5;i++){
            buttons[i]=new JButton("  "+(i+1));
            c.add(buttons[i]);
            c.add(Box.createVerticalStrut(3));
        }
        
        box = new BoxLayout(c, BoxLayout.Y_AXIS);
        c.setLayout(box);
    }

    public static void main(String[] args) {
        
        BoxLayoutDemo frame = new BoxLayoutDemo();
        frame.setVisible(true);
        frame.setBounds(900,200,600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}