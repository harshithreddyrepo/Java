package Reflection.Udemy;

import java.lang.reflect.*;

class MyClass{
    private int a;
    protected int b;
    public int c;
    int d;
    public MyClass(int a,int b){  }
    public MyClass(){   }
    public void display(String s1,String s2){   }
    public int show(int x,int y){return  0;}
}
public class Main {
    public static void main(String[] args) {
        Class cla= MyClass.class;
        System.out.println();
        System.out.println("Name of the class: "+cla.getName());
        System.out.println();
        Field[] fields=cla.getDeclaredFields();
        for(Field field:fields){
            System.out.println(field);
        }
        System.out.println();
        Constructor[] con=cla.getConstructors();
        for(Constructor c:con){
            System.out.println(c);
        }
    }
}
