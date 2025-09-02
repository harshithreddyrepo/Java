package Generics.CodingWithJohn.genericsDemo;

public class Printer<T> {
    private final T val;
    Printer(T val){
        this.val = val;
    }
    public void printValue(){
        System.out.println(val);
    }
}
