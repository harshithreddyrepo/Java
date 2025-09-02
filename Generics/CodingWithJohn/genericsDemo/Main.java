package Generics.CodingWithJohn.genericsDemo;

public class Main {
    public static void main(String[] args) {
        IntegerPrinter obj1 = new IntegerPrinter(17);
        obj1.printValue();
        DoublePrinter obj2 = new DoublePrinter(13.5);
        obj2.printValue();
        StringPrinter obj3 = new StringPrinter("Hello");
        obj3.printValue();

        Printer<Integer> print1 = new Printer<>(17);
        print1.printValue();
        Printer<Double> print2 = new Printer<>(13.5);
        print2.printValue();
        Printer<String> print3 = new Printer<>("Hello");
        print3.printValue();

        GenericDemo<Integer> obj = new GenericDemo<>("harshith");
        obj.print();
        GenericDemo<Double> newObj = new GenericDemo<>("Chinnu");
        newObj.print();

        printValue(17);
        printValue(13.5);
        printValue("Hello");

    }

    public static  <T>void printValue(T thingToPrint){
        System.out.println(thingToPrint +"!!!!");
    }

}
