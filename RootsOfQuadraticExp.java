import java.util.Scanner;
public class RootsOfQuadraticExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ax^2+bx+c=0");
        System.out.println("enter the value of 'a'");
        float a = sc.nextFloat();
        System.out.println("enter the value of 'b'");
        float b = sc.nextFloat();
        System.out.println("enterr the value of 'c'");
        float c = sc.nextFloat();

        double root1=(-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
        double root2=(-b-Math.sqrt((b*b)-(4*a*c)))/(2*a);

        System.out.println("Roots of the given Quadratic Expression is "+root1+" and "+root2);
    }
}
