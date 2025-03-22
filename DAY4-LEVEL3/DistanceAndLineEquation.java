import java.util.Scanner;

public class DistanceAndLineEquation {

    public static double findDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] findLineEquation(int x1, int y1, int x2, int y2) {
        double m = (double) (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first point (x1 y1): ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.print("Enter second point (x2 y2): ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        double distance = findDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.2f\n", distance);

        double[] equation = findLineEquation(x1, y1, x2, y2);
        System.out.printf("Equation of Line: y = %.2fx + %.2f\n", equation[0], equation[1]);
    }
}
