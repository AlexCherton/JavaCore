package JavaCore07;

import java.util.Random;

public class Task_02 {
    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        Player p4 = new Player();
        Player p5 = new Player();
        Player p6 = new Player();
        System.out.println(Player.getInfo());
        Player p7 = new Player();
        for (int i = p1.getStamina(); i > Player.MIN_STAMINA; i--) {
            Player.run(p1);
        }
        System.out.println(Player.getInfo());

    }
}

class Player {
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    private int stamina;
    public static int countPlayers;

    public Player() {
        Random rnd = new Random();
        stamina = rnd.nextInt(10) + 90;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static String getInfo() {
        String s = "";
        if (countPlayers == 6) {
            s = "На поле нет свободных мест";
        } else if (countPlayers < 6) {
            int i = 6 - countPlayers;
            s = "Команды неполные. На поле еще есть " + i + "\n" +
                    "свободных мест.";
        }
        return s;
    }

    public static void run(Player x) {
        if (x.stamina > MIN_STAMINA) {
            x.stamina--;
            if (x.stamina == MIN_STAMINA) {
                countPlayers--;
            }
        }
    }
}


