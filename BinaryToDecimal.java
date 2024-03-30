import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sc.useRadix(2);
        System.out.println("Enter the Binary Value:");
        float x = sc.nextFloat();
        System.out.println(x);
    }

}
