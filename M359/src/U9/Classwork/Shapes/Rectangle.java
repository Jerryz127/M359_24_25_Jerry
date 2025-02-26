package U9.Classwork.Shapes;

public class Rectangle extends Shape{
    private int length;
    private int width;
    public Rectangle(String n, String c, int l, int w){
        super(n,c);
        length = l;
        width = w;
    }

    public String toString(){
        return super.toString() + " with length: " + length + " and width: " + width;
    }

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }

    public void setLength(int s){
        length = s;
    }

    public void setWidth(int s){
        width = s;
    }

    public int findArea(){
        return width * length;
    }
}
