import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        String[][] bmiResults = calculateBMIStatus(data);
        displayResults(bmiResults);
        scanner.close();
    }

    static String[][] calculateBMIStatus(double[][] data) {
        String[][] results = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100; // Convert cm to meters
            double bmi = weight / (height * height);
            bmi = Math.round(bmi * 100.0) / 100.0; // Round to 2 decimal places

            String category;
            if (bmi <= 18.4) {
                category = "Underweight";
            } else if (bmi <= 24.9) {
                category = "Normal";
            } else if (bmi <= 39.9) {
                category = "Overweight";
            } else {
                category = "Obese";
            }

            results[i][0] = String.format("%.2f", data[i][1]); // Height
            results[i][1] = String.format("%.2f", data[i][0]); // Weight
            results[i][2] = String.format("%.2f", bmi); // BMI
            results[i][3] = category;
        }
        return results;
    }

    static void displayResults(String[][] bmiResults) {
        System.out.println("\nBMI Report:");
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-10s | %-10s | %-10s | %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Category");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10s | %-10s | %-10s | %-15s%n",
                    bmiResults[i][0], bmiResults[i][1], bmiResults[i][2], bmiResults[i][3]);
        }
    }
}
