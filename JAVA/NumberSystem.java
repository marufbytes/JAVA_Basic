import java.text.SimpleDateFormat;
import java.util.Date;

public class NumberSystem {
  public static void main(String[] args) {
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
 
    String formattedDate = formatter.format(date);
    System.out.println(formattedDate);
  }
}