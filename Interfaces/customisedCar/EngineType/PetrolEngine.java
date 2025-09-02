package Interfaces.customisedCar.EngineType;

import Interfaces.customisedCar.Engine;

public class PetrolEngine implements Engine {
    public void start(){
        System.out.println("Starts like an Petrol engine");
    }
    public void stop(){
        System.out.println("Stops like an Petrol engine");
    }
    public void accelerate(){
        System.out.println("Accelerates like an Petrol engine");
    }
}
