package Interfaces.customisedCar;

public class CustomCar {
    private Brake brake;
    private Engine  engine;
    private MediaPlayer mediaPlayer;
    CustomCar(Brake brake,Engine engine,MediaPlayer mediaPlayer){
        this.brake = brake;
        this.engine = engine;
        this.mediaPlayer = mediaPlayer;
    }
    public void modifyEngine(Engine engine) {
        this.engine = engine;
    }
    public void modifyBrake(Brake brake){
        this.brake = brake;
    }
    public void modifyMediaPlayer(MediaPlayer mediaPlayer){
        this.mediaPlayer = mediaPlayer;
    }
    // ENGINE FUNCTIONALITIES
    public void stopEngine() {
       engine.stop();
    }
    public void startEngine() {
        engine.start();
    }
    public void accelerate() {
        engine.accelerate();
    }
    // BRAKE FUNCTIONALITIES
    public void applyBrake(){
        brake.stop();
    }
    public void releaseBrake(){
        Brake.release();
    }
    //MEDIA PLAYER FUNCTIONALITIES
    public void playMusic(){
        mediaPlayer.start();
    }
    public void pauseMusic(){
        mediaPlayer.stop();
    }
}
