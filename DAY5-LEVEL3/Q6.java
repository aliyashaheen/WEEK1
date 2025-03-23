import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String[] frequencyArray = findCharacterFrequency(text);

        System.out.println("Character | Frequency");
        for (String entry : frequencyArray) {
            if (entry != null) {
                System.out.println("    " + entry);
            }
        }
        scanner.close();
    }

    static String[] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray();
        int[] frequency = new int[characters.length];
        String[] result = new String[characters.length];

        for (int i = 0; i < characters.length; i++) {
            frequency[i] = 1;
            if (characters[i] == '0') {
                continue;
            }

            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    characters[j] = '0'; // Mark as counted
                }
            }
            result[i] = characters[i] + "     |    " + frequency[i];
        }
        return result;
    }
}
