package U9.Homework;

public class AthleteTester {
    public static void main(String[] args) {
        Athlete a1 = new Athlete("mike", 16);
        a1.setName("Michael");
        TeamAthlete t1 = new TeamAthlete("Rithesh", 18,"Fremd", "Tennis");
        System.out.println(t1.getName() + " " + t1.getAge());
        t1.setName("Dylan");
        t1.setSport("Basketball");
        System.out.println(t1.getName() +   " " + t1.getAge() + " " + t1.getTeamName() + " " + t1.getSport());
    }
}
