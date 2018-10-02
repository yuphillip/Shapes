import java.util.*;
public class Circle extends Shape {
    private int radius;
    public Circle(int radius)
    {
        super("Circle");
        this.radius= radius;
    }
    public double getArea()
    {
        return(Math.PI*(radius*radius));
    }


    public double getPerimeter() {
        return (Math.PI*2*radius);
    }
}
