package LocalInnerClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("local inner methods should be instantiated in the method itself where it is declared to use it's members");
        OuterClass obj = new OuterClass();
        obj.display();
    }
}
