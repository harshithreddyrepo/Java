package Interfaces.customisedCar;

import Interfaces.customisedCar.BreakingSystems.FrictionalBreak;
import Interfaces.customisedCar.EngineType.DieselEngine;
import Interfaces.customisedCar.EngineType.ElectricEngine;
import Interfaces.customisedCar.MediaSystemType.FmMediaPlayer;

public class Main {
    public static void main(String[] args) {
        CustomCar car = new CustomCar(new FrictionalBreak(),new DieselEngine(),new FmMediaPlayer());
        car.startEngine();
        car.accelerate();
        car.playMusic();
        car.applyBrake();
        car.stopEngine();
        car.pauseMusic();
        // We can modify the car object of the main class itself without disturbing the whole car class
        car.modifyEngine(new ElectricEngine());
        car.startEngine();
        //**---------**//
        car.accelerate();
        car.applyBrake();
        car.releaseBrake();
    }
}
 /*Firstly I do not have the functionality called releaseBrake(), used to release the brake.
   But now if I just declare releaseBrake() inside the Brake interface I have to modify all tbe classes implementing that interface,
   to avoid that problem we have to define the method inside the interface itself such that all the classes implementing the interface can use it.
    - this is the importance of having default method inside an interface.
  */
