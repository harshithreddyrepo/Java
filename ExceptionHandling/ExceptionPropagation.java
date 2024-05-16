package ExceptionHandling;
import java.util.Scanner;
public class ExceptionPropagation {

    public static int meth1(int a,int b)
    {
        int c;
        try {
            c = a / b;
        }

        finally {
            System.out.println("This inside meth1 after performing the division operation");

        }

       return c;
    }

    public static void meth2(int a,int b)
    {
        System.out.println("This is inside meth2() before calling meth1()");
        try
        {
            System.out.println(meth1(a,b));
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        System.out.println("This is inside meth2() after calling meth1()");

    }

    public static void meth3(int a, int b)
    {
        System.out.println("This is inside meth3() before calling meth2()");
        meth2(a,b);
        System.out.println("This is inside meth3() after calling meth2()");
    }

    public static void main(String[] args) {

        System.out.println("enter the dividend and divisor ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        meth3(a,b);

    }


}
//important
// CONCLUSION : The code after the exception will be not executed until the exception is handled by try and catch block
//We can solve the above problem with finally block but finally block should be followed by try block
// finally block does not exist independently(i.e without try block)
// * There is compulsory of having finally block after try and catch block in most of the cases.
