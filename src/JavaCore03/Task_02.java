package JavaCore03;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите два числа - делимое и делитель:");
            double number1 = scanner.nextDouble();
            double number2 = scanner.nextDouble();
            if (number2 == 0) {
                break;
            }
            System.out.println("Результат деления делимого на делитель: "+number1 / number2);
        }
        System.out.println("На ноль делить нельзя, программа завершена...");
    }
}
