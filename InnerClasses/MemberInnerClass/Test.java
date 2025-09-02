package InnerClasses.MemberInnerClass;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("Tata safari");
        Car.Engine engine = car.new Engine();
        engine.start();
        engine.stop();
    }
}
