package Interfaces.customisedCar.BreakingSystems;

import Interfaces.customisedCar.Brake;

public class FrictionalBreak implements Brake {
    public void stop(){
        System.out.println("Frictional brakes applied");
    }
}
