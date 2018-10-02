import java.util.*;

   public class SemiCircle extends Shape
   {
       private int radius;
       public SemiCircle(int radius)
       {
           super("SemiCircle");
           this.radius=radius;
       }


       public double getArea() {
           return ((Math.PI*radius*radius)/2);
       }


       public double getPerimeter() {
           return ((2*radius*Math.PI)+(2*radius));
       }
   }