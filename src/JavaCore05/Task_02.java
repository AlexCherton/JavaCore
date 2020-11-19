package JavaCore05;

public class Task_02 {
    public static void main(String[] args) {
        Motocycle moto1 = new Motocycle();
        String s1 = moto1.getInfo();
        System.out.println(s1);
        Motocycle moto2 = new Motocycle("БМВ","Электрик",2020);
        String s2 = moto2.getInfo();
        System.out.println(s2);
    }
}

class Motocycle {
    private String model;
    private int yearOfManufactory;
    private String color;

    public Motocycle(){
        this.model = "Ява";
        this.yearOfManufactory = 2010;
        this.color = "Красный";
    }

    public Motocycle(String model, String color, int yearOfManufactory){
        this.model = model;
        this.yearOfManufactory = yearOfManufactory;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfManufactory() {
        return yearOfManufactory;
    }

    public String getInfo(){
        return "Мотоцикл модели " +"\""+getModel()+"\""+ " цвета " +"\""+getColor()+"\""+" "+getYearOfManufactory() + " года выпуска.";
    }
}
