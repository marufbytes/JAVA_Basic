package GUI.Layouts.GridLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class GridLayoutDemo extends JFrame{

    private Container c;
    private JButton buttons[];
    private  GridLayout grid;

    GridLayoutDemo(){
        initcomponents();
    }

    public void initcomponents(){

        c = this.getContentPane();
        grid = new GridLayout(3,3,5,5);
        c.setLayout(grid);

        c.setBackground(Color.DARK_GRAY);

        buttons = new JButton[9];
        for(int i=0;i<9;i++){
            buttons[i]=new JButton("  "+(i+1));
            c.add(buttons[i]);
        }
        
       
    }

    public static void main(String[] args) {
        
        GridLayoutDemo frame = new GridLayoutDemo();
        frame.setVisible(true);
        frame.setBounds(900,200,600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}