package AccessModifier.Protected.Pac1;

public class B {
    protected static void show(){
        System.out.println("Protected method inside package:'AccessModifier.Protected.Pac1', Class:'B' ");
    }
    public void pubShow(){
        System.out.println("Public method inside package:'AccessModifier.Protected.Pac1', Class:'B' ");
    }
    void defShow(){
        System.out.println("Default method inside package:'AccessModifier.Protected.Pac1', Class:'B' ");
    }

}
