import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {

        while (true) {
            try{

                Scanner input = new Scanner(System.in);
    
                System.out.print("Enter Number 1 : ");
                int num1 = input.nextInt();
        
                System.out.print("Input Number 2 : ");
                int num2 = input.nextInt();
        
                int result = num1/num2;
                System.out.println("Result : "+result);
            }
            catch(Exception e){
                System.out.println("Exception: "+e);
                System.out.println("You nedd to enter an integer .");
            }
        }
        }

        
}
