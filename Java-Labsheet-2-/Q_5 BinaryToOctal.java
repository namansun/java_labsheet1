
import java.util.Scanner;
 class BinaryToOctal {
    public static void main(String[] args) {
       try  (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a binary number: ");
            String binary = sc.nextLine();
            sc.close();

             int decimal = Integer.parseInt(binary, 2);
             String octal = Integer.toOctalString(decimal);

             System.out.println("Octal equivalent: " + octal);
        }

    }
}
