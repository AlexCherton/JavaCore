package JavaCore09;

public class Task_02 {
    public static void main(String[] args) {
    Figure[] figures = {
            new Triangle(10, 10, 10, "Red"),
            new Triangle(10, 20, 30, "Green"),
            new Triangle(10, 20, 15, "Red"),
            new Rectangle(5, 10, "Red"),
            new Rectangle(40, 15, "Orange"),
            new Circle(4, "Red"),
            new Circle(10, "Red"),
            new Circle(5, "Blue")
    };
        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));
}


    public static double calculateRedPerimeter(Figure[] figures) {

        double RedPerimeter = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                RedPerimeter += figure.perimeter();
            }
        }
        return RedPerimeter;
    }

    public static double calculateRedArea(Figure[] figures) {
        double RedArea = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                RedArea += figure.area();
            }
        }
        return RedArea;
    }
}
