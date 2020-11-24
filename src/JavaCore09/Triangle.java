package JavaCore09;

public class Triangle extends Figure {

    private double sideA;
    private double sideB;
    private double sideC;
    private String color;

    public Triangle(double sideA,double sideB,double sideC,String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double area() {
        double halfPerimeter = (sideA+sideB+sideC)/2;
        return Math.sqrt(halfPerimeter*(halfPerimeter-sideA)*(halfPerimeter-sideB)*(halfPerimeter-sideC));
    }

    public double perimeter() {
        return sideA+sideB+sideC;
    }
}
