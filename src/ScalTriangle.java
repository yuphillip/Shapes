public class ScalTriangle {
    private int side;
    priva

    public ScalTriangle(int side)
    {
        super ("ScalTriangle");
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
}
