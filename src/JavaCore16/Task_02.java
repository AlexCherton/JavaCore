package JavaCore16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) throws FileNotFoundException {
    Random rnd = new Random();
    File file1 = new File("file1.txt");
    PrintWriter pw1 = new PrintWriter(file1);
        for (int i = 0; i <= 1000; i++) {
        pw1.println(rnd.nextInt(100));
    }
        pw1.close();
    Scanner scan = new Scanner(file1);
    File file2 = new File("file2.txt");
    PrintWriter pw2 = new PrintWriter(file2);
    int cnt = 0;
    int sum = 0;
        while(scan.hasNextLine()){
        sum += Integer.parseInt(scan.nextLine());
        cnt++;
        if(cnt==20){
            pw2.println((double) sum /20);
            sum = 0;
            cnt = 0;
        }
    }
        pw2.close();
        System.out.println(printResult(file2));
}

    public static int printResult(File file) {
        try {
            Scanner scan = new Scanner(file);
            double sum = 0;
            while (scan.hasNextLine()) {
                sum += Double.parseDouble(scan.nextLine());
            }
            return (int) sum;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return 0;
    }
}
