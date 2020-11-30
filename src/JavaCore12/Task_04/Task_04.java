package JavaCore12.Task_04;

import java.util.ArrayList;
import java.util.List;

public class Task_04 {
    public static void main(String[] args) {
        List<String> membersList1 = new ArrayList<>();
        membersList1.add("Иванов Иван");
        membersList1.add("Петров Пётр");
        membersList1.add("Васечкин Василий");
        List<String> membersList2 = new ArrayList<>();
        membersList2.add("Сидоров Сидр");
        membersList2.add("Матроскин Кот");
        membersList2.add("Галелео Галилей");
        MusicBand musicBand1 = new MusicBand("Сектор Газа",1987, membersList1);
        MusicBand musicBand2 = new MusicBand("Король и Шут",1988, membersList2);
        musicBand1.printMembers();
        musicBand2.printMembers();
        MusicBand.transferMembers(musicBand1,musicBand2);
        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
