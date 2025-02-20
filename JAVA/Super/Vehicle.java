package Super;

public class Vehicle {
    String colour;
    double weight;
    
    Vehicle(String colour, double weight){
        this.colour=colour;
        this.weight=weight;
    }

    void display1(){
        System.out.println("Colour : "+colour);
        System.out.println("Weight : "+weight);
    }
}
