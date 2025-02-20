import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Container;
import java.awt.Color;

public class Frame extends JFrame {

    private ImageIcon icon;
    private Container c;

    Frame() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setBackground(Color.YELLOW);  // Set background color

        // Attempt to load the icon
        try {
            icon = new ImageIcon(getClass().getResource("/image.png"));  // Ensure correct path
            this.setIconImage(icon.getImage());
        } catch (NullPointerException e) {
            System.out.println("Image not found");
        }
    }

    public static void main(String[] args) {
        JFrame frame = new Frame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(450, 300, 500, 300);
        frame.setTitle("TITLE");
    }
}
