package Polymorphism2;

public class Triangle extends First{
    double length,weidth;
    Triangle(double length,double weidth){
        this.length=length;
        this.weidth=weidth;
    }

    double area (){
        System.out.print("Triangle : ");
        return 0.5*length*weidth;
    }
}
