import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        boolean isPalindrome1 = checkPalindromeIterative(text);
        boolean isPalindrome2 = checkPalindromeRecursive(text, 0, text.length() - 1);
        boolean isPalindrome3 = checkPalindromeUsingCharArray(text);

        System.out.println("Using Iterative Method: " + (isPalindrome1 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Recursion: " + (isPalindrome2 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Character Array: " + (isPalindrome3 ? "Palindrome" : "Not a Palindrome"));

        scanner.close();
    }

    // Logic 1: Iterative method (Two-pointer approach)
    static boolean checkPalindromeIterative(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method
    static boolean checkPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return checkPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Using Character Array
    static boolean checkPalindromeUsingCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    // Helper Method to Reverse a String
    static char[] reverseString(String text) {
        char[] reversed = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }
        return reversed;
    }
}
