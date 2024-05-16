package Inheritence;

class Circle
{
   private double radius;
   public Circle()
   {
       radius = 1;
   }
    public Circle( int r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI*radius*radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Cylinder extends Circle{
   private int height;

   public Cylinder()
   {
       height=1;
   }

    public Cylinder(int r,int h) {
        super(r);
        height = h;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public double area()
    {
        return 2*Math.PI*getRadius()*height;
    }

    public double volume()
    {
        return Math.PI*getRadius()*getRadius()*height;
    }


}



public class ConstructorCalling {
    public static void main(String ...args) // ... variable length argument(saradha (: )
    {
        Circle obj1 = new Circle(3);
        Cylinder obj2 = new Cylinder(3,5);
        System.out.println( "area of the circle: "+obj1.area());
        System.out.println("perimeter of the circle:"+obj2.perimeter());  // since cylinder class is inherit from Circle class, it
        // will aquire all the properties and methods of Circle class
        System.out.println("area of the Cylinder:"+obj2.area());
        System.out.println("volume of the Cylinder:"+obj2.volume());
    }
}
