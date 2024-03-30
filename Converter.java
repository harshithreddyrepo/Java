import java.util.Scanner;
public class Converter {
    public static void main(String[] args) {
        System.out.println("enter the number in decimal format: ");
        Scanner sc = new Scanner(System.in);
        int dec = sc.nextInt();
        // DECIMAL TO BINARY CONVERSION
        String binary = Integer.toBinaryString(dec);

        //DECIMAL TO OCTAL CONVERSION
        String octal = Integer.toOctalString(dec);

        //DECIMAL TO HEXADECIMAL CONVERSION
        String hexa = Integer.toHexString(dec);
        System.out.println("in Binary format: "+ binary +"\nin Octal format: "+ octal+"\nin Hexadecimal format: "+hexa );


        // BINARY TO DECIMAL CONVERSION
        sc.useRadix(2);
        System.out.println("enter the number in binary format:");
        dec= sc.nextInt();
        System.out.println("in decimal format:"+dec);

        // OCTAL TO DECIMAL CONVERSION
        sc.useRadix(8);
        System.out.println("enter the umber in octal format:");
        dec=sc.nextInt();
        System.out.println("in decimal format:"+dec);

        // HEXADECIMAL TO DECIMAL CONVERSION
        sc.useRadix(16);
        System.out.println("enter the number in hexadecimal format:");
        dec=sc.nextInt();
        System.out.println("in decimal format:"+dec);

      /*  System.out.println("enter the number in binary format:");
        sc.useRadix(2);
        float val = sc.nextFloat();
        System.out.println("in Deccimal form:"+val); */

    }
}
