/*Yu Phillip
*/
 */
public class Rectangle extends Shape {
    private int side;

    public Rectangle(int side)
    {
        super("Rectangle");
        this.side = side;
    }
    public double getArea()
    {
        return (height*width);
    }

    public double getPerimeter()
    {
        return side*4;
    }
}
