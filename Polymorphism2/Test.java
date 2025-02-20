package Polymorphism2;

public class Test {
    public static void main(String[] args) {

        First[] s = new First[3];

        s[0] = new First();
        s[1]= new Rectangle(10, 20);
        s[2 ]= new Triangle(10,5);
        
        for(int i=0;i<3;i++){
            System.out.println(s[i].area());
        }
      
}
}
