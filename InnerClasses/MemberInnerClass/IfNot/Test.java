package InnerClasses.MemberInnerClass.IfNot;

public class Test {
    public static void main(String[] args) {
        Car car=new Car("Ferrari");
        Engine engine=new Engine(car);
        engine.start();
        engine.stop();
    }
}
