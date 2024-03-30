import java.util.Scanner;

public class ReadingTheValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");

        if(sc.hasNextInt()) {
            int x = sc.nextInt();
            System.out.println(x);
        }
        else if(sc.hasNextFloat()) {
             float x = sc.nextFloat();
            System.out.println(x);
        }
        else {
            System.out.println("enter the valid input");
        }
    }
}
