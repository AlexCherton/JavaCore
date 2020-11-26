package JavaCore11;

public class Task_01 {
    public static void main(String[] args) {
        Warehouse ware = new Warehouse();
        Picker pick = new Picker(ware);
        Courier cour=new Courier(ware);

        System.out.println(ware+" "+pick+" "+cour);

        for (int i =0 ; i<=1500; i++) {
            pick.doWork();
            cour.doWork();
        }
        if (ware.getCountOrder()>1500){
            pick.bonus();
        }
        if (ware.getBalance()>1000000){
            cour.bonus();
        }
        System.out.println(ware+" "+pick+" "+cour);


        Warehouse ware1 = new Warehouse();
        Picker pick1 = new Picker(ware1);
        Courier cour1=new Courier(ware1);
        System.out.println(ware1+" "+pick1+" "+cour1);
        pick1.doWork();
        cour1.doWork();
        System.out.println(ware+" "+pick+" "+cour);
        System.out.println(ware1+" "+pick1+" "+cour1);
    }
}
