package Strings;

public class Main {
    public static void main(String[] args) {
        String name1 = "Harshith";
        String name2 = "Harshith";
        System.out.println(name1==name2);  // true; because both the reference variables refers to the
         // same object created in the string pool.

        String name_1 = new String("Harshith");
        String name_2 = new String("Harshith");
        System.out.println(name_1==name_2); // false; because both the reference objects refer to
        // the two distinct objects created in the Heap.
    }
}
