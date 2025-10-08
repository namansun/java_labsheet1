
import java.util.Scanner;

 class PrimeInterval {
    public static void main(String[] args) {
      try  (Scanner sc = new Scanner(System.in)) {
           System.out.print("Enter start of interval: ");
           int start = sc.nextInt();
           System.out.print("Enter end of interval: ");
           int end = sc.nextInt();
           sc.close();

           System.out.println("Prime numbers between " + start + " and " + end + ":");
           for (int i = start; i <= end; i++) {
              if (isPrime(i)) {
                  System.out.print(i + " ");
            
                }
           }
        }
    }


    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
