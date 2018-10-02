public class Square extends Rectangle {
    private int side;
    public Square(int height, int width) {
        super(height, width);
        this.side = height;
    }
    public double getArea()
    {
        return (side*side);
    }

    public double getPerimeter()
    {
        return side*4;
    }


}
