package NestedInnerClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("NESTED INNER CLASS");

       // OuterClass.InnerClass obj = new OuterClass().new InnerClass();
       // obj.display();


       // OuterClass obj = new OuterClass();
       // obj.obj.display();

       //  OuterClass.InnerClass obj1 = obj.new InnerClass();
        // obj1.display();

        OuterClass.InnerClass.demo();

    }
}
