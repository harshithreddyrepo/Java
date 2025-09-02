package Interfaces.customisedCar.MediaSystemType;

import Interfaces.customisedCar.MediaPlayer;

public class FmMediaPlayer implements MediaPlayer {
    public void start(){
        System.out.println("Fm radio starts");
    }
    public void stop(){
        System.out.println("Fm radio stops");
    }
}
