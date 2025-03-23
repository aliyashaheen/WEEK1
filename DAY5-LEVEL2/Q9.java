import java.util.Random;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of games to play: ");
        int rounds = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[][] results = new String[rounds][3];
        int userWins = 0, computerWins = 0;

        for (int i = 0; i < rounds; i++) {
            System.out.print("\nEnter your choice (rock, paper, scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();
            String computerChoice = getComputerChoice();

            String winner = determineWinner(userChoice, computerChoice);
            results[i][0] = userChoice;
            results[i][1] = computerChoice;
            results[i][2] = winner;

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
        }

        String[][] stats = calculateStats(userWins, computerWins, rounds);
        displayResults(results, stats);

        scanner.close();
    }

    static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        Random random = new Random();
        return choices[random.nextInt(3)];
    }

    static String determineWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("scissors") && computer.equals("paper")) ||
            (user.equals("paper") && computer.equals("rock"))) {
            return "User";
        }
        return "Computer";
    }

    static String[][] calculateStats(int userWins, int computerWins, int rounds) {
        String[][] stats = new String[2][2];
        double userWinPercentage = ((double) userWins / rounds) * 100;
        double computerWinPercentage = ((double) computerWins / rounds) * 100;

        stats[0][0] = "User";
        stats[0][1] = String.format("%.2f%%", userWinPercentage);
        stats[1][0] = "Computer";
        stats[1][1] = String.format("%.2f%%", computerWinPercentage);

        return stats;
    }

    static void displayResults(String[][] results, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-10s | %-10s | %-10s%n", "User Choice", "Computer", "Winner");
        System.out.println("--------------------------------------------------");

        for (String[] row : results) {
            System.out.printf("%-10s | %-10s | %-10s%n", row[0], row[1], row[2]);
        }

        System.out.println("\nWin Percentage:");
        System.out.println("----------------------");
        System.out.printf("%-10s | %-10s%n", "Player", "Win %");
        System.out.println("----------------------");
        for (String[] row : stats) {
            System.out.printf("%-10s | %-10s%n", row[0], row[1]);
        }
    }
}
