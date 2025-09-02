package Interfaces.customisedCar.BreakingSystems;

import Interfaces.customisedCar.Brake;

public class ElectromagneticBrake implements Brake {
    public void stop(){
        System.out.println("Electromagnetic brakes applied");
    }
}
