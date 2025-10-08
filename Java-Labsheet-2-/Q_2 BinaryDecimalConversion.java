
import java.util.Scanner;
 class BinaryDecimalConversion {
    public static void main(String[] args) {
      try  (Scanner sc = new Scanner(System.in)) {

           System.out.print("Enter a binary number: ");
           String binary = sc.nextLine();
           int decimal = Integer.parseInt(binary, 2);
           System.out.println("Decimal equivalent: " + decimal);

           System.out.print("Enter a decimal number: ");
           int num = sc.nextInt();
           String bin = Integer.toBinaryString(num);
           System.out.println("Binary equivalent: " + bin);

           sc.close();
        }  
    }
}
