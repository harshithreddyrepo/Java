package Generics.CodingWithJohn.genericsDemo;

public class DoublePrinter {
    private final Double val;
    DoublePrinter(Double val){
        this.val=val;
    }
    public void printValue(){
        System.out.println(val);
    }
}
