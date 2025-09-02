package Generics.CodingWithJohn.GenericMethodSample;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        List<Integer> intList=new ArrayList<>();
        intList.add(3);
        intList.add(7);
        intList.add(1);
        intList.add(5);
        printList(intList);
        wildPrintList(intList);
    }
    private static <T> T printList(List<T> myList){
        System.out.println(myList);
        return (T) myList;
    }

    private static void wildPrintList(List<?> myList){
        System.out.println(myList);
    }
}
