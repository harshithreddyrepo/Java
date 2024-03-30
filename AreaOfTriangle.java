import java.util.Scanner;
import java.math.*;

public class AreaOfTriangle {
    public static void main(String[] args) {
        System.out.println("enter the sides of the triangle:");
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float s=(float)1/2*(a+b+c);
        float area=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of the triangle given:"+area);


    }
}
