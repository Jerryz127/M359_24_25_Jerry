package U9.Classwork.Shapes;

public class Circle extends Shape{
    private int radius;

    public Circle(String n, String c, int a){
        super(n, c);
        radius = a;
    }

    public String toString(){
        return super.toString() + " radius: " + radius;
    }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int a){
        radius = a;
    }

    public double findArea(){
        return Math.pow(radius, 2) * Math.PI;
    }
}
