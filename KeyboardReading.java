import java.util.Scanner;
public class KeyboardReading {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner (System.in);
        int num = sc.nextInt();
        System.out.println("you entered:"+num);


    }
}
