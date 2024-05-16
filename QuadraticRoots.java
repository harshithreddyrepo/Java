import java.util.Scanner;
public class QuadraticRoots {
    public static void main(String[] args) {
        System.out.println("enter a,b and c values, where QE is 'ax^2+bx+c=0'");
        Scanner sc = new Scanner(System.in);
        System.out.print("a=");
        int a = sc.nextInt();
        System.out.print("b=");
        int b = sc.nextInt();
        System.out.print("c=");
        int c = sc.nextInt();

        double det = Math.sqrt(b*b-(4*a*c)) ;

        System.out.println("1st root:"+ ((-b)+det)/2*a);
        System.out.println("2nd root:"+ ((-b)-det)/2*a);

    }
}
