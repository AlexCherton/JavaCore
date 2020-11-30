package JavaCore12.Task_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_03 {
    public static void main(String[] args) {
        List<MusicBand> musicBandList = new ArrayList<>();
        musicBandList.add(new MusicBand("Кино",1982));
        musicBandList.add(new MusicBand("Сектор Газа",1987));
        musicBandList.add(new MusicBand("The Killers",2001));
        musicBandList.add(new MusicBand("My Chemical Romance",2001));
        musicBandList.add(new MusicBand("OneRepublic",2002));
        musicBandList.add(new MusicBand("Nickelback",1995));
        musicBandList.add(new MusicBand("Franz Ferdinand",2002));
        musicBandList.add(new MusicBand("Metallica",1981));
        musicBandList.add(new MusicBand("AC/DC",1973));
        musicBandList.add(new MusicBand("Король и Шут",1988));
        System.out.println(musicBandList);

        Collections.shuffle(musicBandList);
        System.out.println(musicBandList);


        System.out.println(groupsAfter2000(musicBandList));
    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> musicBandList) {
        List<MusicBand> bands = new ArrayList<>();
        for (MusicBand band : musicBandList) {
            if (band.getYear() > 2000) {
                bands.add(band);
            }
        }
        return bands;
    }
}
