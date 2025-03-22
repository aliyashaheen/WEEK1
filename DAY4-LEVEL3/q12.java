import java.util.Random;
import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[][] scores = new int[n][3];
        double[][] results = new double[n][3];

        System.out.println("\nID\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("------------------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(41) + 60; 
            scores[i][1] = rand.nextInt(41) + 60; 
            scores[i][2] = rand.nextInt(41) + 60; 

            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = Math.round(total / 3.0);
            double percent = Math.round((total / 300) * 100);

            results[i][0] = total;
            results[i][1] = avg;
            results[i][2] = percent;

            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.0f\t%.0f%%\t%s\n", i + 1, scores[i][0], scores[i][1], scores[i][2],
                    total, avg, percent, getGrade(percent));
        }
        sc.close();
    }

    static String getGrade(double percent) {
        if (percent >= 80) return "A";
        if (percent >= 70) return "B";
        if (percent >= 60) return "C";
        if (percent >= 50) return "D";
        if (percent >= 40) return "E";
        return "R";
    }
}
