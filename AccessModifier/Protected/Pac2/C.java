package AccessModifier.Protected.Pac2;

import AccessModifier.Protected.Pac1.B;

class D extends B {
    public static void main(String[] args) {
        D.show();
    }
    public void display(){
        System.out.println("Accessing inside Different package and Subclass");
        super.show();
    }
}
public class C {
    public static void main(String[] args) {

    }
    public static void display(){
        System.out.println("Accessing inside 'different package and Not SubClass'");
        new D().display();
    }
}
