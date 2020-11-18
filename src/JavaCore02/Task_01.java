package JavaCore02;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Для определения типа дома введите количество этажей в здании:");

        int number = sc.nextInt();

        if (number>=1&&number<=4){
            System.out.println("Малоэтажный дом");
        }
        else if (number>=5&&number<=8){
            System.out.println("Среднеэтажный дом");
        }
        else {
            System.out.println("Многоэтажный дом");
        }
    }
}
