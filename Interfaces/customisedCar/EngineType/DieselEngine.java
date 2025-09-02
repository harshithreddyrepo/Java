package Interfaces.customisedCar.EngineType;

import Interfaces.customisedCar.Engine;

public class DieselEngine implements Engine {
    public void start(){
        System.out.println("Starts like an Diesel engine");
    }
    public void stop(){
        System.out.println("Stops like an Diesel engine");
    }
    public void accelerate(){
        System.out.println("Accelerates like an Diesel engine");
    }
}
