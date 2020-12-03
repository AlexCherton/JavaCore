package JavaCore16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        File file = new File("test");
        System.out.printf(printResult(file)+"--> %.3f",printResult(file));
    }
    public static double printResult(File file) {
        try {
            Scanner scan = new Scanner(file);
            String line = scan.nextLine();
            String[] numbersString = line.split(" ");
            int sum = 0;
            for (String number : numbersString) {
                sum += Integer.parseInt(number);
            }
            return ((double)sum/numbersString.length);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");

        } return 0;
    }
}
