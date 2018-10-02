public class Runner
{
    public static void main (String[]args)
    {
        Shape shape1 = new  Rectangle(18,10);
        Shape shape2 = new Etriangle(5);
        Shape shape3 = new Circle(10);
        Shape shape4= new ScalTriangle(5,6,8);

        //Shape shape1 = new RPentagon(side:5);
        //System.out.println(shape4);
        /*System.out.println("My Perimeter is: "+shape4.getPerimeter());
        System.out.println("My area is: "+ shape4.getArea());*/

        Shape[] shapes={shape1, shape2, shape3,shape4};

        for (Shape cur:shapes)
        {
            System.out.println(cur);
            System.out.println("My area is: "+cur.getArea());
            System.out.println("My perimeter is: "+ cur.getPerimeter());
        }
    }
}
