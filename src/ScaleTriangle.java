public class ScaleTriangle extends Shape {
    private int side;
    private int base;
    private int height;

    public ScaleTriangle(int side, int base, int height)
    {
        super("ScaleTriangle");
        this.side = side;
        this.base = base;
        this.height = height;
    }
    public double getArea()
    {
        return ((height*base)/2);
    }

    public double getPerimeter()
    {
        return (side+base+height);
    }
}

