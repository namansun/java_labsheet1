
import java.util.Scanner;
 class PrimeCheck {
    public static void main(String[] args) {
      try  (Scanner sc = new Scanner(System.in)) {
           System.out.print("Enter a number: ");
           int num = sc.nextInt();
           sc.close();

            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
            
               for (int i = 2; i * i <= num; i++) {
                   if (num % i == 0) {
                       isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime)
                System.out.println(num + " is a Prime number.");
             else
                System.out.println(num + " is NOT a Prime number.");
        }
    }
}
