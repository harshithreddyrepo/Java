package Interfaces.customisedCar.BreakingSystems;

import Interfaces.customisedCar.Brake;

public class HydraulicBrake implements Brake {
    public void stop(){
        System.out.println("Hydraulic brakes applied");
    }
}
