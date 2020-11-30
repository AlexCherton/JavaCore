package JavaCore12;
import java.util.ArrayList;
import java.util.List;
public class Task_01 {
    public static void main(String[] args) {
    List<String> auto = new ArrayList<>();
        auto.add("БМВ");
        auto.add("Мерседес");
        auto.add("Шевроле");
        auto.add("Сузуки");
        auto.add("Мазда");
        System.out.println(auto);
        auto.add(2, "Лада");
        System.out.println(auto);
        auto.remove(0);
        System.out.println(auto);
    }
}
