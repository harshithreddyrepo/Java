package Interfaces.customisedCar.MediaSystemType;

import Interfaces.customisedCar.MediaPlayer;

public class CdPlayer implements MediaPlayer {
    public void start(){
        System.out.println("CD player starts");
    }
    public void stop(){
        System.out.println("CD player stops");
    }
}
