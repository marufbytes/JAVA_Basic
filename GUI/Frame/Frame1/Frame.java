package GUI.Frame.Frame1;
import javax.swing.JFrame;

public class Frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // frame.setSize(400,300);
        // frame.setLocationRelativeTo(null);
        // frame.setLocation(500,300);

        frame.setBounds(500, 200, 500, 500);
        frame.setTitle("TITLE ");
        frame.setResizable(false);

    }
}