package Generics.CodingWithJohn.genericsDemo;

public class IntegerPrinter {
    private final Integer val;
    IntegerPrinter(Integer val){
        this.val=val;
    }
    public void printValue(){
        System.out.println(val);
    }
}
