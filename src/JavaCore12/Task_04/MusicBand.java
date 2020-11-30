package JavaCore12.Task_04;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> membersList;

    public MusicBand(String name, int year, List<String> membersList){
        this.name = name;
        this.year = year;
        this.membersList = membersList;
    }

    public int getYear (){
        return year;
    }

    public List<String> getMembersList() {
        return membersList;
    }

    public void setMembersList(List<String> membersList) {
        this.membersList = membersList;
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2){
        for (String member: musicBand1.getMembersList()){
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

