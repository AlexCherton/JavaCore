package JavaCore02;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Для определения диапозона целых чисел в котором возможно есть числа, которые делятся на 5 введите два числа:");

        int a = sc1.nextInt();

        int b = sc2.nextInt();
        if (a>=b){
            System.out.println("Некорректный ввод. Первое число из дипозона не может быть больше или равно второму числу!");
        } else {
            for (int i = a; i < b; i++) {
                if (i % 5 == 0 && i % 10 != 0 && i > a) {
                    System.out.println(i);
                }
            }
        }
    }
}
