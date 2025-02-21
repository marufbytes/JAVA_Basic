package GUI.Dialog.Dialog2;

import javax.swing.JOptionPane;

class Dialog2{
	public static void main (String [] args){
	
        String s1 = JOptionPane.showInputDialog(null,"Enter your first Name : ", "TITLE ",JOptionPane.DEFAULT_OPTION);
        String s2 = JOptionPane.showInputDialog(null, "Enter your last Name :  ","TITLE ",JOptionPane.DEFAULT_OPTION);

        String name = s1+" "+s2;

        JOptionPane.showMessageDialog(null, "Full Name Is : "+name);
	
	}
}