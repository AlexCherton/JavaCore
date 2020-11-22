package JavaCore08;

public class Task_01 {
    public static void main(String[] args) {

        long DateTime1 = System.currentTimeMillis();

        String s = "";
        for (int i=0; i<=20000; i++){
            s += i+" ";
        }
        System.out.println(s);

        long DateTime2 = System.currentTimeMillis();
        System.out.println("Итоговое время выполнения программы с использованием String: "+(DateTime2-DateTime1));

        long DateTime3 = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder("");
        for (int i=0; i<=20000; i++){
            sb.append(i).append(" ");
        }
        System.out.println(sb);

        long DateTime4 = System.currentTimeMillis();
        System.out.println("Итоговое время выполнения программы с использованием StringBuilder: "+(DateTime4-DateTime3));
    }
}
