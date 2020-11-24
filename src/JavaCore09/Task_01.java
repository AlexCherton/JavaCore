package JavaCore09;

public class Task_01 {
    public static void main(String[] args) {
        Student student = new Student("Владимир", "ИУ-12-1996");
        Teacher teacher = new Teacher("Нниколай Иванович", "ОТЭЦ (Основы теорииэлектроцепей)");

        String s1 = student.getGroupName();
        System.out.println(s1);
        student.printInfo();

        String t1 = teacher.getSubject();
        System.out.println(t1);
        teacher.printInfo();
    }
}
