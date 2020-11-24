package JavaCore09;

public abstract class Figure {
    String color;
    public Figure(String color){
        this.color = color;
    }

    public abstract double area();
    public abstract double perimeter();
    public void setColor(String color){ this.color = color;}
    public String getColor(){return color;}
}
