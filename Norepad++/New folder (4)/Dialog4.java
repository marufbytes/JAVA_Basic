import javax.swing.JOptionPane;

class Dialog4{
    public static void main(String[] args) {
        int choice = JOptionPane.showConfirmDialog(null, "Do you want quit ? ", "TITLE", JOptionPane.YES_NO_OPTION);

        if (choice==JOptionPane.YES_OPTION){
            System.exit(0);
        }
        else {
            System.out.println("Loading......");
        }
    }
}