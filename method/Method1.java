package method;
import java.util.Scanner;

public class Method1 {
    //creating a method to find greatest of two numbers
    static int max(int a,int b)
    {
        ++a;
        System.out.println("'a' inside max method:"+a);
        if(a>b)
            return a;
        else
            return b;

    }

    public static void main(String[] args) {
        System.out.println("enter two numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       // Method1 obj = new Method1();
        int result =max(a,b);
        System.out.println("'a' inside main method "+a);
        System.out.println(result);
    }
}
