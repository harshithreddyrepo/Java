package Interfaces.customisedCar.EngineType;

import Interfaces.customisedCar.Engine;

public class ElectricEngine implements Engine {
    public void start(){
        System.out.println("Starts like an Electric engine");
    }
    public void stop(){
        System.out.println("Stops like an Electric engine");
    }
    public void accelerate(){
        System.out.println("Accelerates like an Electric engine");
    }
}
