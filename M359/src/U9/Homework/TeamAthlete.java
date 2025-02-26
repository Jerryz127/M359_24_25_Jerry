package U9.Homework;

public class TeamAthlete extends Athlete{
    private String teamName;
    private String sport;

    public TeamAthlete(String n, int a, String t, String s){
        //super(n, a);
        teamName = t;
        sport = s;
    }

    public String getTeamName(){
        return teamName;
    }

    public String getSport(){
        return sport;
    }

    public void setTeamName(String s){
        teamName = s;
    }

    public void setSport(String a){
        sport = a;
    }
}
