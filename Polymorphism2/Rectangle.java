package Polymorphism2;

public class Rectangle extends First {
    double length;
    double height;
    Rectangle(double length, double height){
        this.height=height;
        this.length=length;
    }
    double area(){
        System.out.print("Rectangle : ");
        return length+height;
    }
}
