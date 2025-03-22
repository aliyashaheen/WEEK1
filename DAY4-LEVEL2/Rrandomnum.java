import java.util.Random;

public class Rrandomnum {
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            numbers[i] = rand.nextInt(9000) + 1000; // Generates a 4-digit number (1000 to 9999)
        }
        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(5);

        System.out.print("Generated Numbers: ");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        double[] result = findAverageMinMax(randomNumbers);
        System.out.println("Average: " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]);
    }
}
