package JavaCore09;

public class Teacher extends Human {
    private String name;
    private String subject;

    public Teacher(String name,String subject) {
        super(name);
        this.name = name;
        this.subject = subject;

    }

    public void setSubject(String subject){this.subject = subject;}

    public String getSubject(){return subject;}

    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем "+this.name);
    }
}
