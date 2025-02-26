package U9.Classwork.Shapes;

public class Square extends Rectangle{
    public Square(String n, String c, int l){
        super(n,c, l, l);
    }

    public String toString(){
        return super.toString();
    }

    public int findArea(){
        return getLength() * getLength();
    }
}
