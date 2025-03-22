import java.util.Arrays;
import java.util.Scanner;
public class q4 {

    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] storeDigits(int num) {
        String str = String.valueOf(num);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }

    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isPalindrome(int num) {
        int[] digits = storeDigits(num);
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }

    public static boolean isDuckNumber(int num) {
        String str = String.valueOf(num);
        return str.contains("0") && str.charAt(0) != '0';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int digitCount = countDigits(num);
        int[] digits = storeDigits(num);
        int[] reversedDigits = reverseArray(digits);
        boolean palindrome = isPalindrome(num);
        boolean duckNumber = isDuckNumber(num);

        System.out.println("\nResults:");
        System.out.println("Count of digits: " + digitCount);
        System.out.println("Original digits: " + Arrays.toString(digits));
        System.out.println("Reversed digits: " + Arrays.toString(reversedDigits));
        System.out.println("Is Palindrome: " + (palindrome ? "Yes" : "No"));
        System.out.println("Is Duck Number: " + (duckNumber ? "Yes" : "No"));
    }
}

