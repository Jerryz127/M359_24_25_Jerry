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

    /*
    This method is created soley for the purpose of inheritance/
    We will learn more about this in section 9.5
     */
    public double findArea(){
        return 0.0;
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
