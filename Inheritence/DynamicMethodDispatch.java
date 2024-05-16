package Inheritence;

// Java Program to Demonstrate that Non-method Members
// are Accessed according to Reference Type
// (Unlike methods that are accessed according
// to the referred object)

// Class 1
// Super class
class Parent {
    int value = 1000;

    // Constructor of super class
    Parent()
    {

        // Print statement
        System.out.println("Parent Constructor");
    }
    public void display()
    {
        System.out.println("Inside the parent class method");
    }
}

// Class 2
// Sub class
class Child extends Parent {

    int value = 10;

    // Constructor of sub class
    Child()
    {

        // Print statement
        System.out.println("Child Constructor");
    }
    public void display()
    {
        System.out.println("Inside child class method ");
    }
}

// Class 3
// Main class
class DynamicMethodDispatch {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating an object of sub class inside main()
        // method
        Child obj = new Child();

        // Printing the reference of child type
        System.out.println("Reference of Child Type :"
                + obj.value);
        obj.display();

        // Note that doing "Parent par = new Child()"
        // would produce same result
        Parent par = obj;


        // Par holding obj will access the value
        // variable of parent class

        // Printing the reference of parent type
        System.out.println("Reference of Parent Type : "
                + par.value);
        obj.display();  //Dynamic Method Dispatch
    }
}

