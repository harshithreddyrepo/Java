public class Swapping {
    int a=10;
    int b=20;
    public static void main(String[] args) {
        Swapping obj = new Swapping();
        Swapping.swap(obj.a,obj.b,obj);
        System.out.println("a="+obj.a+" & b="+obj.b);
    }
    static void swap(int a, int b,Swapping obj)
    {
        int temp=a;
        obj.a=b;
        obj.b=temp;

    }
}

/*
public class Swapping {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;



    }
}
*/

