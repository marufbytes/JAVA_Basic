package Final;

public class University {
    final String NAME = "AIUB";
    static final int fees ;
    static{
        fees = 118000;
    }
    void display(){
        System.out.println(NAME);
        System.out.println(fees);
    }

}
