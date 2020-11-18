package JavaCore03;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=0;
        while (i<=4) {
            System.out.println("Введите два числа - делимое и делитель:");
            double number1 = scanner.nextDouble();
            double number2 = scanner.nextDouble();
            if (number2 == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            i++;
            System.out.println("Результат деления делимого на делитель: "+number1 / number2);
        }
        System.out.println("Процесс достиг максимального количества итераций, программа завершена...");
    }
}
