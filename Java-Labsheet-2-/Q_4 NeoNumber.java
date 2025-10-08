
import java.util.Scanner;
 class NeonNumber {
    public static void main(String[] args) {
      try  (Scanner sc = new Scanner(System.in)) {
         System.out.print("Enter a number: ");
         int num = sc.nextInt();
         sc.close();

         int square = num * num;
         int sum = 0;

         while (square > 0) {
             sum += square % 10;
             square /= 10;
         }

         if (sum == num)
             System.out.println(num + " is a Neon number.");
         else
             System.out.println(num + " is NOT a Neon number.");
      }
    }
}
