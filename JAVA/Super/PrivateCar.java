package Super;

public class PrivateCar extends Vehicle {
    
    int gear;

    PrivateCar(String colour, double weight, int gear){
        super(colour,weight);
        this.gear=gear;
    }

    void display1(){
        super.display1();
        System.out.println("Gear : "+gear);
    }
    
}
