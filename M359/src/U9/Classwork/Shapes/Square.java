package U9.Classwork.Shapes;

public class Square extends Rectangle{
    public Square(String n, String c, int l){
        super(n,c, l, l);
    }

    public String toString(){
        return getcolor() + " " + getName() + " with side of: " + getLength();
    }

    public double findArea(){
        return super.findArea();
    }
}
