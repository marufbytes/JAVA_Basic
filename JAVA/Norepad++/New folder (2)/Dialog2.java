import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

class Dialog2{
	public static void main (String[] args){
		
		ImageIcon pic = new ImageIcon("pass1.png");
		JOptionPane.showMessageDialog(null, "Enter Correct Password", "Task", JOptionPane.PLAIN_MESSAGE,pic);
	}
	
}