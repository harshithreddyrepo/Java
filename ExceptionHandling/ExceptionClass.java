package ExceptionHandling;

class Sample1
{
    int x=10;
    int y=0;
    public void meth1()
    {
        try{
            int c = x/y;
            System.out.println("result="+c);
        }
        catch (Exception e)
        {
            System.out.println("public String toString() :-\n"+e);
            System.out.println("public String getMessage() :-\n"+e.getMessage());
            System.out.println("public void printStacktrace :-");
            e.printStackTrace();
        }
    }

}

class Sample2 extends Sample1
{
    public void meth2()
    {
        meth1();
    }
}

class Sample3 extends Sample2
{
    public void meth3()
    {
        meth2();
    }

}

public class ExceptionClass {
    public static void main(String[] args) {
        System.out.println("Demonstration on Exception class");
        Sample3 obj = new Sample3();
        obj.meth3();
    }
}
