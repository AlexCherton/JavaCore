package JavaCore11;

public class Picker implements Worker {
    private double salary;
    private Warehouse ware;

    public Picker(Warehouse ware){
        this.ware = ware;
    }

    public double getSalary(){return salary;}

    @Override
    public void doWork() {
        salary+=100;
        ware.setCountOrder(ware.getCountOrder()+1);
    }

    @Override
    public void bonus() {
        if (ware.getCountOrder()>1000)
            salary*=3;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary+
                '}';
    }
}
