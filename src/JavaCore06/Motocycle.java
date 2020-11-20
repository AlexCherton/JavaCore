package JavaCore06;

class Motocycle {
    // у класса могут быть поля и класс может совершать действия через методы
    private String model;
    private int yearOfManufactory;
    private String color;

    public Motocycle() {
        this.model = "Ява";
        this.yearOfManufactory = 2010;
        this.color = "Красный";
    }

    public Motocycle(String model, String color, int yearOfManufactory) {
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

    public String getInfo() {
        return "Это мотоцикл модели " + "\"" + getModel() + "\"" + " цвета " + "\"" + getColor() + "\"" + " " + getYearOfManufactory() + " года выпуска.";
    }

    public int yearDifference(int year) {
        if (year > 0 && yearOfManufactory > 0 && year >= yearOfManufactory) {
            return year - yearOfManufactory;
        } else {
            return -1;
        }
    }
}