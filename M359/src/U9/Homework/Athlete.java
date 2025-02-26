package U9.Homework;

public class Athlete {
    private String name;
    private int age;

    public Athlete(String n, int a){
        name = n;
        age = a;
    }

    public Athlete(){
        name = "none";
        age = -1;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String s){
        name = s;
    }

    public void setAge(int a){
        age = a;
    }
}
