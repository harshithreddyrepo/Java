import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        // Convert decimal to binary
        String binary = Integer.toBinaryString(decimal);

        System.out.println("octal representation: " + binary);
        scanner.close();
    }
}

