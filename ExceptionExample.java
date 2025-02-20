public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int x = 5;
            int y = 0;

            int result = x / y;  
            System.out.println("Result: " + result);  
        } 
        catch (Exception e) { 
            System.out.println("Error: " + e.getMessage()); 
        }
        
        System.out.println("END.......................... ");
    }
}
