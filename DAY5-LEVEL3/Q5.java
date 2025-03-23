import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        char[] uniqueChars = findUniqueCharacters(text);
        String[][] frequencyArray = findCharacterFrequency(text, uniqueChars);

        System.out.println("Character | Frequency");
        for (String[] entry : frequencyArray) {
            System.out.println("    " + entry[0] + "     |    " + entry[1]);
        }
        scanner.close();
    }

    static char[] findUniqueCharacters(String text) {
        char[] unique = new char[text.length()];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueCount; j++) {
                if (unique[j] == ch) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                unique[uniqueCount++] = ch;
            }
        }

        char[] result = new char[uniqueCount];
        System.arraycopy(unique, 0, result, 0, uniqueCount);
        return result;
    }

    static String[][] findCharacterFrequency(String text, char[] uniqueChars) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }

        return result;
    }
}
