package GUI.Login;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {

    private Container c;
    private JLabel userLabel, passLabel;
    private JTextField tf;
    private JPasswordField pf;
    private JButton btn1, btn2;
    private Font f;

    Login() {
        initComponents();
    }

    public void initComponents() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        f = new Font("Times New Roman", Font.BOLD, 18);

        userLabel = new JLabel("Username : ");
        userLabel.setBounds(40, 35, 150, 40);
        userLabel.setFont(f);
        c.add(userLabel);

        tf = new JTextField();
        tf.setBounds(140, 35, 150, 40);
        tf.setFont(f);
        c.add(tf);

        passLabel = new JLabel("Password : ");
        passLabel.setBounds(40, 95, 150, 40);
        passLabel.setFont(f);
        c.add(passLabel);

        pf = new JPasswordField();
        pf.setBounds(140, 95, 150, 40);
        pf.setFont(f);
        pf.setEchoChar('*');
        c.add(pf);

        btn1 = new JButton("Login");
        btn1.setBounds(150, 250, 120, 40);
        btn1.setFont(f);
        c.add(btn1);

        btn2 = new JButton("Clear");
        btn2.setBounds(330, 250, 120, 40);
        btn2.setFont(f);
        c.add(btn2);

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = tf.getText().trim();
                String pass = new String(pf.getPassword()).trim();

                if (user.isEmpty() || pass.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Username and password cannot be empty");
                } else if (user.equals("maruf") && pass.equals("1234")) {
                    Dashboard d = new Dashboard();
                    d.setVisible(true);
                    dispose(); // Close the login window
                } else {
                    JOptionPane.showMessageDialog(null, "Try again, invalid username or password");
                }
            }
        });

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
                pf.setText("");
            }
        });
    }

    public static void main(String[] args) {
        Login login = new Login();
        login.setVisible(true);
        login.setBounds(480, 200, 600, 400);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setTitle("LOG IN FRAME");
    }
}

// Assuming you have a Dashboard class
class Dashboard extends JFrame {
    Dashboard() {
        setTitle("Dashboard");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}