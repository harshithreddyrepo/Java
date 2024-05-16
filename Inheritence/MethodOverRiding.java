package Inheritence;

class Car{
    int  speed;
    public Car()
    {
        speed=100;
        System.out.println("speed of the normal car:"+speed);
    }
    public Car(int speed)
    {
     this.speed=speed;
    }
    public void startCar()
    {
        System.out.println("turn on the key");
    }
    public void changeGear()
    {
        System.out.println("press clutch and change gear rod");
    }
    public void accelerate()
    {
        System.out.println("change gear and press accelerator");
    }
}
class LuxuryCar extends Car{
    int  speed;
    public LuxuryCar(int speed)
    {
        this.speed=speed;
        System.out.println("speed of the luxury car:"+speed);
    }
    public void startCar()
    {
        System.out.println("press the button");
    }
    public void changeGear()
    {
        System.out.println("Automatic gear change");
    }
    public void accelerate()
    {
        System.out.println("push accelerator");
    }

}

public class MethodOverRiding {
    public static void main(String[] args) {
        // Creating parent class reference to a child class object
        Car obj1 = new LuxuryCar(200);
        System.out.println("speed of the car :"+obj1.speed);
        obj1.startCar();
        obj1.accelerate();
        obj1.changeGear();




    }
}
