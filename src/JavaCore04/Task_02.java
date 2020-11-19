package JavaCore04;

import java.util.Random;

public class Task_02 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int [] numbers = new int[100];
        int maxNum = 0;
        int minNum = 0;
        int cnt  = 0;
        int sum  = 0;
        for (int i = 0; i<numbers.length; i++) {
            numbers[i] = rnd.nextInt(10000);
            if (numbers[i] > numbers[maxNum])
            {
                maxNum = i;
            }
            else if (numbers[i] < numbers[minNum])
            {
                minNum = i;
            }
            if(numbers[i]%10==0){
                cnt++;
                sum = sum + numbers[i];
            }
        }
        System.out.println("Наибольший элемент массива - "                         + maxNum);
        System.out.println("Наименьший элемент массива - "                         + minNum);
        System.out.println("Количество элементов массива, оканчивающихся на 0 - "  + cnt);
        System.out.println("Сумма чисел входящих в массив, оканчивающихся на 0 - " + sum);
    }
}
