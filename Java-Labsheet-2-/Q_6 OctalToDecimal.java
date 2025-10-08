
import java.util.Scanner;
 class OctalToDecimal {
    public static void main(String[] args) {
     try   (Scanner sc = new Scanner(System.in)) {
           System.out.print("Enter an octal number: ");
           String octal = sc.nextLine();
           sc.close();

           int decimal = Integer.parseInt(octal, 8);
           System.out.println("Decimal equivalent: " + decimal);
        }
    }
}
