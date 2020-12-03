package JavaCore14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList());
    }

    public static List<Person> parseFileToObjList() {
        File file = new File("People");
        try {
            List<Person> spisok = new ArrayList<>();
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] peopleAgeString = line.split(" ");
                int age = Integer.parseInt(peopleAgeString[1]);
                Person person = new Person(peopleAgeString[0], age);
                spisok.add(person);
                if (age < 0) {
                    throw new IllegalArgumentException();
                }
            }
            return spisok;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");

        } catch (IllegalArgumentException p) {
            System.out.println("Некорректный входной файл!");
        }
        return null;
    }
}
