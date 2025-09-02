package Generics.CodingWithJohn.genericsDemo;

public class StringPrinter {
    private final String val;
    StringPrinter(String val){
        this.val=val;
    }
    public void printValue(){
        System.out.println(val);
    }
}
