package JavaCore11;

public class Courier implements Worker{
    private double salary;
    private Warehouse ware;
    public Courier(Warehouse ware){
        this.ware = ware;
    }
    public double getSalary(){return salary;}

    @Override
    public void doWork() {
        salary+=80;
        ware.setBalance(ware.getBalance()+1000.0);
    }

    @Override
    public void bonus() {
        if (ware.getBalance()>1000000.0){
            salary*=2;
        }
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary+
                '}';
    }
}
