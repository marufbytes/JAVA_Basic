import javax.swing.*;
import java.awt.*;

public class Radio extends JFrame{

    private Container c;
    private JRadioButton male, female;
    private ButtonGroup grp;

    Radio (){
        initcomponents();
    }

    public void initcomponents(){

        this.setVisible(true);
        this.setBounds(500,300,500,300);
        this.setTitle("Radio button ");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        Font f = new Font("Arial", Font.BOLD, 20);

        male = new JRadioButton("Male");
        male.setBounds(50,50,100,50);
        male.setFont(f);
        male.setSelected(true);
        //male.setEnable(false);
        c.add(male);

        female = new JRadioButton("Female");
        female.setBounds(250,50,100,50);
        female.setFont(f);
        c.add(female);

        grp = new ButtonGroup();
        grp.add(male);
        grp.add(female);

    }

    public static void main(String[] args){

        Radio radio = new Radio();
    }
    
}