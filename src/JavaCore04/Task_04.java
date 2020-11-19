package JavaCore04;

import java.util.Random;

public class Task_04 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int sum;
        int max = 0;
        int numstr = 0;
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(10000);
        }
        for (int number: numbers) {
            System.out.print(number+" ");
        }
        System.out.println();
        for (int i = 0; i < numbers.length - 2; i++) {
            sum = numbers[i] + numbers[i + 1] + numbers[i + 2];
            if (sum > max) {
                max = sum;
                numstr = i;
            }

        }
        System.out.println(numstr+"-й индекс в массиве, сумма из 3 чисел " +"["+ numbers[numstr] +", "+ numbers[numstr + 1] +", "+ numbers[numstr + 2] +"]"+" начиная с которого максимальна и равняется - "+max);
    }
}
