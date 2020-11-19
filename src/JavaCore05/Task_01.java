package JavaCore05;

public class Task_01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Лада седан");
        car1.setColor("Баклажан");
        car1.setYearOfManufactory(2015);
        String m1 = car1.getModel();
        String c1 = car1.getColor();
        int y1 = car1.getYearOfManufactory();
        System.out.println("Автомобиль модели " +"\""+ m1 +"\""+ " цвета " +"\""+ c1 +"\""+" "+ y1 + " года выпуска.");
    }
}

class Car {
    // у класса могут быть поля и класс может совершать действия через методы
    private String model;
    private int yearOfManufactory;
    private String color;

    public void setModel(String modelName) {
        if (modelName.isEmpty()) {
            System.out.println("Вы ввели пустое наименование модели");
        } else {
            model = modelName;
        }
    }

    public void setColor(String colorName) {
        if (colorName.isEmpty()) {
            System.out.println("Вы ввели пустое наименование цвета");
        } else {
            color = colorName;
        }
    }


    public void setYearOfManufactory(int manufactoryYear) {
        if (manufactoryYear < 0) {
            System.out.println("Вы ввели отрицательный год выпуска");
        } else {
            yearOfManufactory = manufactoryYear;
        }
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
}

