package JavaCore09;

public class Circle extends Figure {
    private double circleRadius;
    private String color;

    public Circle(double circleRadius,String color) {
        super(color);
        this.circleRadius = circleRadius;
        this.color = color;
    }

    public double area() {
        return Math.PI*Math.pow(circleRadius,2);
    }

    public double perimeter() {
        return 2*Math.PI*circleRadius;
    }
}
