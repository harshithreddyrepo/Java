package Generics.CodingWithJohn.genericsDemo;

public class GenericDemo<T> {
    private final String str;
    GenericDemo(String str){
        this.str = str;
    }
    public void print(){
        System.out.println(str);
    }
}
