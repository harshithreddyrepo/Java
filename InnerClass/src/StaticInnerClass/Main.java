package StaticInnerClass;


public class Main
{
    public static void main(String[] args) {
        System.out.println("Static inner class can access only the static members of outer class");
        OuterClass.InnerClass obj = new OuterClass.InnerClass();
        obj.show();
    }
}
