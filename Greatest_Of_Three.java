import java.util.Scanner;
public class Greatest_Of_Three
 {
     public static void main(String[] args)
      {
        System.out.println("Enter the three numbers:");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if(n1>n2)
        {
            if(n1>n3)
               System.out.println(n1+" is grestest among three numbers");

            else
               System.out.println(n3+" is grestest among three numbers");
        }
        else
           {
              if(n2>n3)
                System.out.println(n2 +" is grestest among three numbers");

                else
                   System.out.println(n3 +" is grestest among three numbers");
           }

     }
}
