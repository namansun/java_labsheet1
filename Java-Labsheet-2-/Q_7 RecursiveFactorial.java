
import java.util.Scanner;
 class RecursiveFactorial {
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
           System.out.print("Enter a positive integer: ");
           int num = sc.nextInt();
           sc.close();

           System.out.println("Factorial of " + num + " = " + factorial(num));
       }
    }
}
