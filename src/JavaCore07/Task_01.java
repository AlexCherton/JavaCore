package JavaCore07;

public class Task_01 {
    public static void main(String[] args) {
        Airplane air1 = new Airplane();
        Airplane air2 = new Airplane("КБ Ильюшина",1980,53194,6100);
        String s1 = Airplane.compareAirplanes(air1,air2);
        System.out.println(s1);
    }
}
