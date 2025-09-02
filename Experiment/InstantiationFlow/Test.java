package Experiment.InstantiationFlow;

public class Test {
    private String str;
  //  private String lowerStr=str.toLowerCase();
  private String lowerStr;

    public Test(){
        System.out.println("Zero parameterized constructor is invoked to initialize the instance variables with the default values");
    }
    public Test(String str){
        System.out.println("Parameterized constructor is invoked");
        this.str=str;
    }
    public String display(){
        lowerStr=this.str.toLowerCase();
        return lowerStr;
    }
}
