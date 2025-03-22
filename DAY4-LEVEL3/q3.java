import java.util.Scanner;

public class q3 {

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

    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrongNumber(int num, int[] digits) {
        int sum = 0, power = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == num;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int digitCount = countDigits(num);
        int[] digits = storeDigits(num);
        boolean duck = isDuckNumber(digits);
        boolean armstrong = isArmstrongNumber(num, digits);
        int[] largestValues = findLargestAndSecondLargest(digits);
        int[] smallestValues = findSmallestAndSecondSmallest(digits);

        System.out.println("\nResults:");
        System.out.println("Count of digits: " + digitCount);
        System.out.println("Is Duck Number: " + (duck ? "Yes" : "No"));
        System.out.println("Is Armstrong Number: " + (armstrong ? "Yes" : "No"));
        System.out.println("Largest digit: " + largestValues[0] + ", Second largest digit: " + (largestValues[1] == Integer.MIN_VALUE ? "N/A" : largestValues[1]));
        System.out.println("Smallest digit: " + smallestValues[0] + ", Second smallest digit: " + (smallestValues[1] == Integer.MAX_VALUE ? "N/A" : smallestValues[1]));
    }
}