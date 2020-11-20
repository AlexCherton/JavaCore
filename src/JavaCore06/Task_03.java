package JavaCore06;

import java.util.Random;

public class Task_03 {
    public static void main(String[] args) {
        Teacher tc1 = new Teacher();
        Student st1 = new Student();
        tc1.evaluate(st1.getName());
        String s1 = tc1.getInfo();
        System.out.println(s1);

        Teacher tc2 = new Teacher("Николай Николаевич", "Биология");
        Student st2 = new Student("Васечкин");
        tc2.evaluate(st2.getName());
        String s2 = tc2.getInfo();
        System.out.println(s2);

        Teacher tc3 = new Teacher("Иван Фёдорович Крузенштерн", "География");
        Student st3 = new Student();
        st3.setName("Дядя Фёдор");
        tc3.evaluate(st3.getName());
        String s3 = tc3.getInfo();
        System.out.println(s3);

    }
}

class Teacher {

    private String name;
    private String subject;
    private String mark;
    private String studentName;

    public Teacher() {
        this.name = "Мария Ивановна";
        this.subject = "Математика";
    }

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(String studentName) {
        Random rnd = new Random();
        int i = rnd.nextInt(4)+2;
        switch (i) {
            case 5:
                System.out.println("Оценка учтена!");
                this.mark = "отлично";
                break;
            case 4:
                System.out.println("Оценка учтена!");
                this.mark = "хорошо";
                break;
            case 3:
                System.out.println("Оценка учтена!");
                this.mark = "удовлетворительно";
                break;
            case 2:
                System.out.println("Оценка учтена!");
                this.mark = "неудовлетворительно";
                break;
        }
        this.studentName = studentName;
    }

    public String getInfo() {
        return "Преподаватель " + name + " оценил(а) студента с именем " + studentName + " по предмету " + subject + " на оценку " + mark;
    }
}

class Student {

    private String name;

    public Student() {
        this.name = "Иванов";
    }

    public Student(String name) {
        if (name.equals("")) {
            System.out.println("Нельзя вводить пустое имя студента!");
        } else {
            this.name = name;
        }
    }

    public void setName(String name) {
        if (name.equals("")) {
            System.out.println("Нельзя вводить пустое имя студента!");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

}