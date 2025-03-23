import java.util.Random;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int students = scanner.nextInt();

        int[][] scores = generateScores(students);
        double[][] stats = calculateStats(scores);
        String[][] grades = assignGrades(stats);
        
        displayScorecard(scores, stats, grades);
        scanner.close();
    }

    static int[][] generateScores(int n) {
        Random random = new Random();
        int[][] scores = new int[n][3];

        for (int i = 0; i < n; i++) {
            scores[i][0] = 30 + random.nextInt(71); // Physics (30-100)
            scores[i][1] = 30 + random.nextInt(71); // Chemistry (30-100)
            scores[i][2] = 30 + random.nextInt(71); // Maths (30-100)
        }
        return scores;
    }

    static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][3]; // Total, Average, Percentage

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percentage = Math.round((total / 300.0) * 100 * 100.0) / 100.0;

            stats[i][0] = total;
            stats[i][1] = avg;
            stats[i][2] = percentage;
        }
        return stats;
    }

    static String[][] assignGrades(double[][] stats) {
        String[][] grades = new String[stats.length][1];

        for (int i = 0; i < stats.length; i++) {
            double percentage = stats[i][2];

            if (percentage >= 80) grades[i][0] = "A";
            else if (percentage >= 70) grades[i][0] = "B";
            else if (percentage >= 60) grades[i][0] = "C";
            else if (percentage >= 50) grades[i][0] = "D";
            else if (percentage >= 40) grades[i][0] = "E";
            else grades[i][0] = "R";
        }
        return grades;
    }

    static void displayScorecard(int[][] scores, double[][] stats, String[][] grades) {
        System.out.println("\nStudent Scorecard:");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.printf("%-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-5s%n",
                "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");
        System.out.println("--------------------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d | %-10d | %-10d | %-10d | %-10.0f | %-10.2f | %-10.2f | %-5s%n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    stats[i][0], stats[i][1], stats[i][2], grades[i][0]);
        }
    }
}
