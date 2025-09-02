package Collections.List.Vector;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        java.util.Vector<Integer> vector = new java.util.Vector<>();
        int capacity = vector.capacity();
        int size = vector.size();
        System.out.println("Vector Capacity:"+capacity);
        System.out.println("Vector Size:"+size);
        vector.add(11);
        vector.add(22);
        vector.add(33);
        vector.add(44);
        vector.add(55);
        System.out.println(vector);
        vector.add(0,10);
        System.out.println(vector);
        System.out.println(vector.get(3));
        vector.add(66);
        vector.add(77);
        vector.add(88);
        vector.add(99);
        vector.add(00);
        System.out.println(vector);
        capacity= vector.capacity();
        System.out.println("Vector Capacity:"+capacity);
        size=vector.size();
        System.out.println("Vector Size:"+size);
        Integer[] arr = new Integer[vector.size()];
        vector.copyInto(arr);
        System.out.println(Arrays.toString(arr));
    }
}
