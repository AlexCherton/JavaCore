package JavaCore06;

public class Task_01 {
    public static void main(String[] args) {
        Motocycle m1 = new Motocycle("БМВ", "Электрик", 2020);
        String s1 = m1.getInfo();
        Car a1 = new Car();
        a1.setModel("Лада седан");
        a1.setColor("Баклажан");
        a1.setYearOfManufactory(2015);
        String s2 = a1.getInfo();
        int y_a1 = a1.yearDifference(2020);
        if (y_a1>=0){
            System.out.println("Автомобилю уже "+y_a1+" лет");
        }else {
            System.out.println("Вы что-то напутали с датами!");
        }
        int y_m1 = m1.yearDifference(2020);
        if (y_a1>=0){
            System.out.println("Мотоциклу уже "+y_m1+" лет");
        }else {
            System.out.println("Вы что-то напутали с датами!");
        }
        System.out.println(s1);
        System.out.println(s2);

    }
}
