package JavaCore02;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Для определения диапозона целых чисел в котором возможно есть числа, которые делятся на 5 введите два числа через пробел:");

        int a = sc1.nextInt();

        int b = sc1.nextInt();
        if (a>=b){
            System.out.println("Некорректный ввод. Первое число из дипозона не может быть больше или равно второму числу!");
        } else {
            int i = a;
            while (i < b) {
                if (i % 5 == 0 && i % 10 != 0 && i > a) {
                    System.out.println(i);

                }
                i++;
            }
        }
    }
}
