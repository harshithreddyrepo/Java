package ExceptionHandling;

public class ThrowingException {
    public static void meth1(int x,int y) throws RuntimeException
    {
        try
        {
            int c = x/y;
            System.out.println(c);
        }
        catch(ArithmeticException ae)
        {
            throw new RuntimeException();
        }
    }


    public static void main(String[] args) {
        int a = 120;
        int b = 0;
        try {
            meth1(a, b);
        }
        catch (RuntimeException re)
        {
            System.out.println("meth1 throws runtime exception");
        }

    }
}
