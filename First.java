class A{
    int a;
    A(int a) {
     this.a = a;
    }
    static void display() {
        System.out.println("static method inside the Super class");
    }
     void show() {
         System.out.println("Instance method inside the Super class");
     }
}
class B extends A{
    B(int a) {
        super(a);
    }

    void dispaly(){
        System.out.println("Static method inside the base class B");
    }
    @Override
    void show() {
        System.out.println("Instance method inside the Sub class B");
    }
}

class First{
    public static void main(String[] args) {
        A obj = new B(30);
        B obj2 = (B)obj; //Upcasting
        obj.display(); // ERROR,Dilemma was created that is it was not clear whether the static method
        // inside the parent should be called or display() method inside the Sub class should be called
        // Hence we can say Static methods cannot be overridden.
        B.display(); // it will call the static method inside the parent class since it was referred by the class name.
        obj2.dispaly();//it will call the instance method inside the Sub class since
        // it was referred by the Sub class type reference variable.

    }
}
/*Since it is the static member it does not depend upon the Object being created,whereas the overriding depends upon the
object that is being created i.e., the object is of type class A or B
=>Static members can inherit, but they cannot override.
 */
