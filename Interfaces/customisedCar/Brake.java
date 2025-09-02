package Interfaces.customisedCar;

public interface Brake {
    void stop();
    static void release(){
        System.out.println("Brakes are released");
    }
}
