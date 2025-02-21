import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("enter number 1 : ");
                int num1 = input.nextInt();

                System.out.print("enter number 2 : ");
                int num2 = input.nextInt();

                int result = num1 / num2;
                System.out.println("result : " + result);
            } catch (java.util.InputMismatchException e) {
                System.out.println("exception: invalid input. you need to enter an integer.");
                input.next(); // clear invalid input
            } catch (java.lang.ArithmeticException e) {
                System.out.println("exception: division by zero is not allowed.");
            } catch (Exception e) {
                System.out.println("exception: " + e);
            }

            System.out.print("do you want to continue? (yes/no): ");
            String choice = input.next().toLowerCase();
            if (choice.equals("no")) {
                break;
            }
        }

        input.close();
    }
}
