package JavaCore04;

import java.util.Random;
import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Введите размер массива:");
        int n = scanner.nextInt();
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        int cnt4 = 0;
        int sum  = 0;
        int [] numbers = new int[n];
        for (int i = 0; i<numbers.length; i++){
            numbers[i] = rnd.nextInt(10);
            if(numbers[i]>8){
                cnt1++;
            }
            if(numbers[i]==1){
                cnt2++;
            }
            if(numbers[i]%2==0){
                cnt3++;
            } else {
                cnt4++;
            }
            sum = sum + numbers[i];
        }
        for (int number: numbers) {
            System.out.print(number+" ");
        }
        System.out.println();
        System.out.println("Длинa массива - " + numbers.length);
        System.out.println("Количество чисел больше 8 - "     + cnt1);
        System.out.println("Количество чисел равных 1 - "     + cnt2);
        System.out.println("Количество чётных чисел - "       + cnt3);
        System.out.println("Количество нечётных чисел - "     + cnt4);
        System.out.println("Сумма чисел входящих в массив - " + sum);
    }
}
