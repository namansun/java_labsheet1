
import java.util.Scanner;
class RecursivePalindrome {
    public static boolean isPalindrome(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return isPalindrome(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { 
            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            if (isPalindrome(str, 0, str.length() - 1))
                System.out.println(str + " is a Palindrome.");
            else
                System.out.println(str + " is NOT a Palindrome.");
        }
    }
}

