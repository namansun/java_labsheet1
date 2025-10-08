
import java.util.Scanner;
class RecursiveFibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
           System.out.print("Enter position n: ");
           int n = sc.nextInt();
           sc.close();

           System.out.println("Fibonacci number at position " + n + " = " + fibonacci(n));
       }
    }
}
