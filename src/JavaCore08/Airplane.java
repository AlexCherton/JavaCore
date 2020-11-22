package JavaCore08;

class Airplane {

    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public Airplane() {
        this.producer = "КБ Сухого";
        this.year = 2010;
        this.length = 21900;
        this.weight = 4340;
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void setLength(int length) {
        if (length < 0) {
            System.out.println("Нельзя вводить отрицательную длину!");
        } else {
            this.length = length;
        }
    }

    public void setYearOfManufactory(int year) {
        if (year < 0) {
            System.out.println("Вы ввели отрицательный год выпуска!");
        } else {
            this.year = year;
        }
    }
    public void fillUp(int fuel) {
        if (fuel < 0) {
            System.out.println("Нельзя добавлять в баки отрицательное количество топлива!");
        } else if (fuel+this.fuel>10000) {
            System.out.println("Уже полный бак!");
        }
        else {
            this.fuel += fuel;
        }
    }
    public int setLength() {
        return length;
    }
    public int getYear() {
        return year;
    }
    public String getInfo() {
        return "Изготовитель: "  + producer + ", год выпуска: " + year + ", длина: "+ length + ", вес: "+ weight + ", количество топлива в баке: "+ fuel + ".";
    }

    @Override
    public String toString() {
        return "Изготовитель: "  + producer + ", год выпуска: " + year + ", длина: "+ length + ", вес: "+ weight + ", количество топлива в баке: "+ fuel + ".";
    }


}
