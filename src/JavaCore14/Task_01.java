package JavaCore14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        File file = new File("test100");
        printSumDigits(file);
        File file2 = new File("test");
        printSumDigits(file2);
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scan = new Scanner(file);
            String line = scan.nextLine();
            String[] numbersString = line.split(" ");
            int sum = 0;
            if (numbersString.length !=10) {
                throw new IllegalArgumentException();
            }
            for (String number : numbersString) {
                sum += Integer.parseInt(number);
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");

        } catch (IllegalArgumentException p){
            System.out.println("Некорректный входной файл!");
        }
    }
}
