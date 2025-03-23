import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        int length = findLength(text);
        char[] uniqueChars = findUniqueCharacters(text, length);

        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            if (c != '\0') {
                System.out.print(c + " ");
            }
        }
        scanner.close();
    }

    static int findLength(String text) {
        int count = 0;
        try {
            while (text.charAt(count) != '\0') {
                count++;
            }
        } catch (Exception e) {
            return count;
        }
        return count;
    }

    static char[] findUniqueCharacters(String text, int length) {
        char[] uniqueChars = new char[length];
        int uniqueIndex = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueIndex; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[uniqueIndex++] = currentChar;
            }
        }

        char[] finalUniqueArray = new char[uniqueIndex];
        for (int i = 0; i < uniqueIndex; i++) {
            finalUniqueArray[i] = uniqueChars[i];
        }
        return finalUniqueArray;
    }
}
