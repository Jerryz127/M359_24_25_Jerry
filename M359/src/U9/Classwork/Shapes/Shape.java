package U9.Classwork.Shapes;

public class Shape {
    private String name;
    private String color;

    public Shape(String n, String c){
        name = n;
        color = c;
    }

    public String toString(){
        return color + " " + name;
    }

    public String getName(){
        return name;
    }

    public String getcolor(){
        return color;
    }

    public void setName(String s){
        name = s;
    }

    public void setColor(String s){
        color = s;
    }

}
