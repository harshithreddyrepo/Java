package SingleTonClass;

import java.util.Date;

class Object
{

    static private Object my=null;
    static private int count = 0;
    int x = 10;

    static Object getInstance()
    {
        if(count<5) {
            my = new Object();
            count++;
            return my;
        }
        else {
            System.out.println("The maximum limit for the object creation is reached");
            return null;
        }
    }


}


public class _5Objects {
    public static void main(String[] args) {
        Object obj1 = Object.getInstance();
        Object obj2 = Object.getInstance();
        Object obj3 = Object.getInstance();
        Object obj4 = Object.getInstance();
        Object obj5 = Object.getInstance();
        Object obj6 = Object.getInstance();



    }
}
