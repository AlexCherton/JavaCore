package JavaCore12.Task_05;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> membersList;

    public MusicBand(String name, int year, List<MusicArtist> membersList){
        this.name = name;
        this.year = year;
        this.membersList = membersList;
    }

    public int getYear (){
        return year;
    }

    public List<MusicArtist> getMembersList() {
        return membersList;
    }

    public void setMembersList(List<MusicArtist> membersList) {
        this.membersList = membersList;
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2){
        for (MusicArtist member: musicBand1.getMembersList()){
            musicBand2.getMembersList().add(member);

        }
        musicBand1.getMembersList().clear();
    }

    public void printMembers(){
        System.out.println(membersList);
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
