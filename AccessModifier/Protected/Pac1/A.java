package AccessModifier.Protected.Pac1;

public class A{
    public static void main(String[] args) {
        A.display();
    }
    public static void display(){
        System.out.println("Accessing inside 'Same Package Different Class'");
        System.out.println("Accessing from:-Package:'AccessModifier.Protected.Pac1', Class:'A'");
        new B().show();
    }
}

