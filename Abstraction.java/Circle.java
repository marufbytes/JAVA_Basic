public class Circle extends Shape {
    Circle(double r, double u) {
        super(r, r);
    }

    void Area() {
        double result = 3.1416 * dim1 * dim2;
        System.out.println("Area of circle : " + result);
    }
}
