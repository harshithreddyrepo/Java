package AnonymousInnerrClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("Anonymous inner classes should be defined at the time of object creation");
        AbstractClass obj = new AbstractClass() {
            @Override
            public void display() {
                System.out.println("An anonymous inner class will be created for the Abstract class");
            }
        };

        obj.display();

        Interface obj1 = new Interface() {
            @Override
            public void show() {
                System.out.println("An anonymous inner class will be created for the Interface");
            }
        };

        obj1.show();
    }
}
