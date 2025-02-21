package GUI.Frame.Frame2;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class Frame extends JFrame{

    private ImageIcon icon;

    Frame(){
        initComponents();
    }

    public void initComponents(){
        
        icon = new ImageIcon(getClass().getResource("image.png"));
        this.setIconImage(icon.getImage());
        

    }

    public static void main(String[] args) {

     
        JFrame frame = new Frame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(450,300,500,300);
        frame.setTitle("TITLE ");
        frame.setResizable(false);

        
}
}