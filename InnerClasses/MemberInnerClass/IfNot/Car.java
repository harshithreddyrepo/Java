package InnerClasses.MemberInnerClass.IfNot;

public class Car {
    private String model;
    private boolean isEngineOn = false;

    Car(String model){
        this.model=model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }

    public void setEngineOn(boolean engineOn) {
        isEngineOn = engineOn;
    }
}
