package JavaCore15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("files\\shoes.csv");
        File file2 = new File("files\\missing_shoes.txt");
        PrintWriter pw = new PrintWriter(file2);
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()){
            String line = scan.nextLine();
            String[] strings = line.split(";");
            int amount = Integer.parseInt(strings[2]);
            if (amount==0) {
                pw.println(line);
            }
        }
        pw.close();
        scan.close();
    }
}
