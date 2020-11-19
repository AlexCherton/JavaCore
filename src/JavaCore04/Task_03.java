package JavaCore04;

import java.util.Random;

public class Task_03 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int sum = 0;
        int s = 0;
        int max = 0;
        int numstr = 0;
        int[][] numbers = new int[12][8];
        int[] str = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = rnd.nextInt(50);
            }
        }
        for (int[] number: numbers) {
            for (int num: number) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {

                str[i] += numbers[i][j];
            }
        }
        for (int i = 0; i < str.length; i++) {
            if (str[i] > sum) {
                sum = str[i];
                numstr = i;
            }
        }
        System.out.println(numstr+"-я строка, сумма чисел в которой максимальна и равняется- "+sum);
    }
}
