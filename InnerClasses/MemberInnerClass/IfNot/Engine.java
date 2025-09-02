package InnerClasses.MemberInnerClass.IfNot;

public class Engine {
    private Car car;
    Engine(Car car){
        this.car=car;
    }
    void start(){
        if(!car.isEngineOn()){
            car.setEngineOn(true);
            System.out.println(car.getModel()+" Engine started.");
        }else {
            System.out.println(car.getModel()+" Engine is already on.");
        }
    }
    void stop(){
        if(car.isEngineOn()){
            car.setEngineOn(false);
            System.out.println(car.getModel()+" Engine stopped");
        }else {
            System.out.println(car.getModel()+" Engine is already off.");
        }
    }
}
