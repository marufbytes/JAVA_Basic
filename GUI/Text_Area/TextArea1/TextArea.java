package GUI.Text_Area.TextArea1;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JScrollPane;

public class TextArea extends JFrame{

    private Container c;
    private JTextArea ta;
    private Font f;
    private JScrollPane scrool;

    TextArea(){
        initComponents();
    }

    public void initComponents(){

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        f = new Font("Arial",Font.ITALIC,16);

        ta = new JTextArea();  
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        ta.setFont(f);
  

        scrool = new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrool.setBounds(100,50,300,150);
        c.add(scrool);

    }

    public static void main (String[] args){

        TextArea area = new TextArea();
        area.setVisible(true);
        area.setBounds(500,300,500,300);
        area.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        area.setTitle("TEXT AREA ");
    }
}