package NestedInnerClass;

import org.w3c.dom.ls.LSOutput;

public class OuterClass {
    int x = 10;  // instance variable of outer class
    static int y = 20;  // Static variable of outer class
    public void show()
    {
        System.out.println("nested inner classes can access the properties of outer class directly");
    }

    class InnerClass
    {
        int x = 30;

        static  public void demo()
        {
            System.out.println("Hello world...");
        }


        public void display()
        {
            System.out.println(x);
            System.out.println("we can access the properties and methods of inner class in outer class by only creating the object of inner class");
            show();
        }

    }

   // InnerClass obj = new InnerClass();  // OuterClass$InnerClass.class file will be created

    public void demo2()
    {
        InnerClass.demo();  //
        System.out.println("Static members of Inner classes can be accessed jz with the name of inner Class inside outer Class");
    }

}
