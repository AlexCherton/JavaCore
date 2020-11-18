package JavaCore03;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите название города или слово stop:");
            String city = scanner.nextLine();
            if(city.equals("stop")){
                break;
            }
            switch (city) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
            }
        }
        System.out.println("Вы ввели stop, программа завершена...");
    }
}
