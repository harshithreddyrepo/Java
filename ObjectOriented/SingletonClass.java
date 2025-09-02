package ObjectOriented;
// Lets gen an idea about how to create a singleton class that means we can create only one instance of that particular class.
class Unique{
    int a;
    public void display()
    {
        System.out.println("This is singleton class");
    }
    static Unique instance;
    private Unique()
    {

    }
    static public Unique getInstance()
    {
        if(instance==null)
        {
            instance = new Unique();
            return instance;
        }
        return instance;
    }
}

public class SingletonClass {
    public static void main(String[] args) {
        Unique obj1 = Unique.getInstance();
        Unique obj2 = Unique.getInstance();
        obj2.display();
        obj1.a = 20;
        System.out.println(obj2.a);
        System.out.println(obj1.a);
    }
}
