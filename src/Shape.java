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

public class Runner
{
    public static void main (String[]args)
    {
        Shape shape1 = new  Rectangle(18,10,4);
        Shape shape2 = new Etriangle(side:5);
        Shape shape3 = new Circle(radius:10);
        
        Shape shape1 = new RPentagon(side:5);
        System.out.println(shape4);
        System.out.println("My Perimeter is: "+shape4.getPerimeter());
        System.out.println("My area is: "+ shape4.getArea());

        Shape[] shapes={shape1, shape2, shape3};

        for (Shape cur:shapes)
        {
            System.out.println(cur);
            System.out.println("My area is: "+cur.getArea());
            System.out.println("My perimeter is: "+ cur.getPerimeter());
        }
    }
}




