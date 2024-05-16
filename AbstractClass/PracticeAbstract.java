package AbstractClass;

abstract class Super{
    public Super(){
        System.out.println("inside the abstract class ");
    }
    abstract public void display();
}

class Sub extends Super{
    public void display()
    {
        System.out.println("WE CAN NOT CREATE OBJECT FOR ABSTRACT CLASS BUT WE CAN HAVE AN REFERENCE OF TYPE ABSTRACT CLASS");
    }
}

public class PracticeAbstract {
    public static void main(String[] args) {
        Super obj = new Sub();
        obj.display();
    }
}
