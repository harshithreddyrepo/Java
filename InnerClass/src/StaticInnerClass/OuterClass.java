package StaticInnerClass;

public class OuterClass {
    static int X = 10;

    public static  class InnerClass{
         public void show()
         {
             System.out.println(X);
             System.out.println("Static inner class is jz like a static member of a class");
             System.out.println("we can create the object of static inner class without creating the object for outer class");
         }
     }
}
