package JavaCore06;

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
    public String getInfo() {
        return "Это автомобиль модели " + "\"" + getModel() + "\"" + " цвета " + "\"" + getColor() + "\"" + " " + getYearOfManufactory() + " года выпуска.";
    }

    public int yearDifference(int year){
        if (year>0&&yearOfManufactory>0&&year>=yearOfManufactory) {
            return year - yearOfManufactory;
        } else {
            return -1;
        }
    }

}

