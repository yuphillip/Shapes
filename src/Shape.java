public abstract class Shape {
    private String type;
    public Shape(String type)
    {
        this.type = type;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString()
    {
        return "I am a" + type + ".";
    }
}
/*
public class Runner
{
    public static void main (String[]args)
    {
        Shape shape1 = new  Rectangle()
    }
}
*/