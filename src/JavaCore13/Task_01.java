package JavaCore13;

public class Task_01 {
    public static void main(String[] args) {
        User user = new User("Коля");
        User user1 = new User("Петя");
        User user2 = new User("Вася");
        user.sendMessage(user1,"Привет! Как дела?");
        user1.sendMessage(user,"Привет, Колян! Дела отлично, как сам?");
        user.sendMessage(user1,"Нормуль!");
        user.sendMessage(user1,"Где Вася, чего-то я его давно не видел?");
        user2.sendMessage(user,"Я тут, всем привет!");
        MessageDatabase.showDialog(user, user1);
        MessageDatabase.showDialog(user, user2);
    }
}
