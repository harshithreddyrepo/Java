import java.util.Scanner;


public class AreaOfTriangle {
    public static void main(String[] args) {
        System.out.println("enter the sides of the triangle:");
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float s=(float)1/2*(a+b+c);
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));  // sqrt() returns double type value.
        System.out.println("Area of the triangle given:"+area);


    }
}
