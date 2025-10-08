
import java.util.Scanner;
 class RecursiveSum {
    public static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
      try  (Scanner sc = new Scanner(System.in)){
           System.out.print("Enter n: ");
           int n = sc.nextInt();
           sc.close();

           System.out.println("Sum of numbers from 1 to " + n + " = " + sum(n));
        }
    }
}
