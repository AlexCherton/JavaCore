package JavaCore12.Task_05;

import java.util.ArrayList;
import java.util.List;

public class Task_05 {
    public static void main(String[] args) {
        List<MusicArtist> membersList1 = new ArrayList<>();
        membersList1.add(new MusicArtist("Иванов Иван",30));
        membersList1.add(new MusicArtist("Петров Пётр",50));
        membersList1.add(new MusicArtist("Васечкин Василий",53));
        List<MusicArtist> membersList2 = new ArrayList<>();
        membersList2.add(new MusicArtist("Сидоров Сидр",35));
        membersList2.add(new MusicArtist("Матроскин Кот",38));
        membersList2.add(new MusicArtist("Галелео Галилей",42));
        MusicBand musicBand1 = new MusicBand("Сектор Газа",1987, membersList1);
        MusicBand musicBand2 = new MusicBand("Король и Шут",1988, membersList2);
        musicBand1.printMembers();
        musicBand2.printMembers();
        MusicBand.transferMembers(musicBand1,musicBand2);
        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
