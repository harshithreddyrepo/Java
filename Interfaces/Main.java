package Interfaces;

interface Super {
    int X = 10;  // by default, they are static and final.
    void display();      // by default, they are abstract and public.
    void show();

    // We can also have the definition of  static method inside the interface
    static void statMethod()
    {
        System.out.println("static methods can be implemented inside the interface");
    }

    // We can also have the definition of default method inside the interface
    // Usage:Assuming that we are working in the big project and when we want to make changes to an interface,
    // it will affect all the classes that are implementing the interface i.e, force them to be abstract classes.
    // to  avoid this conflict defining a default method in interface is allowed
    default void defMethod()
    {
        System.out.println("default methods can be implemented inside the interface");
    }

    // We can also have the definition of private methods inside the interface
    // these are used inside any other default methods inside the interface
    private void pvMethod()
    {
        System.out.println("private methods can be implemented inside the interface");
    }



}

class Sub implements Super {
    public void display()
    {
        System.out.println("Inside display method of Sub class");
    }
    public void show()
    {
        System.out.println("Inside show method of Super class ");
    }
        }

public class Main {
    public static void main(String[] args) {
        Super obj = new Sub();
        obj.display();
        obj.show();
        Super.statMethod();
        obj.defMethod();

    }
}
