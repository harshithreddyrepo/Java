package method;
import java.util.Scanner;

public class FindingGCD {
    static int GCD(int n1, int n2){
//        if(n1==n2 || n1%n2==0 || n2%n1==0)
//        {
//            System.out.println(n1 + " is greatest common divisor");
//        }
//        else {
//            int min = n1 > n2 ? n1 : n2;
//            int gcd = 0;
//            for (int i = 1; i <= min; i++) {
//                if (n1 % i == 0 && n2 % i == 0) {
//                    gcd = i;
//                }
//            }
//            System.out.println(gcd + "is greatest common divisor ");
//        }


            while(n1 != n2) {
                if (n1 > n2)
                {
                    n1=n1=n2;
                }
                else
                {
                   n2=n2-n1 ;
                }
            }
            return n1;
        }


    public static void main(String[] args) {
        System.out.println("enter the two numbers");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(GCD(num1,num2) + " is greatest common divisor");


    }
}
