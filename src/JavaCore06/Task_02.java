package JavaCore06;

public class Task_02 {
    public static void main(String[] args) {
        Airplane air1 = new Airplane();
        Airplane air2 = new Airplane("КБ Ильюшина",1980,53194,6100);

        String s1 = air1.getInfo();
        String s2 = air2.getInfo();
        System.out.println(s1);
        System.out.println(s2);

        air2.fillUp(5000);
        s2 = air2.getInfo();
        System.out.println(s2);
        air2.fillUp(5000);
        s2 = air2.getInfo();
        System.out.println(s2);
        air2.fillUp(5000);
        s2 = air2.getInfo();
        System.out.println(s2);

        air1.setLength(22000);
        air1.setYearOfManufactory(1990);
        s1 = air1.getInfo();
        System.out.println(s1);
        air1.setLength(21000);
        air1.setYearOfManufactory(1979);
        s1 = air1.getInfo();
        System.out.println(s1);
    }
}

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



}
