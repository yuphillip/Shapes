/*Matthew Moore*/
/*uifueuf*/
public class Etriangle extends Shape {
    private int side;

    public Etriangle(int side)
    {
        super ("Etriangle");
        this.side = side;
    }
    public double getArea()
    {
        return ((1.732/4)*(side*side));
    }

    public double getPerimeter()
    {
        return (side*3);
    }
}
