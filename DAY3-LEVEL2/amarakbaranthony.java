import java.util.Scanner;
public class amarakbaranthony{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String[] names = {"Amar", "Akbar", "Anthony"};
		int[] age = new int[3];
		double[] height = new double[3];
		
		for(int i = 0; i < 3; i++){
			System.out.println("Enter Age for " + names[i] + ": ");
			age[i] = input.nextInt();
			System.out.println("Enter Height for " + names[i] + ": ");
			height[i] = input.nextDouble();
		}
		
		int youngest = 0;
		int tallest = 0;
		
		for(int i = 0; i < 3; i++){
			if(age[i] < age[youngest]){
				youngest = i;
			}
			if(height[i] > height[tallest]){
				tallest = i;
			}
		}
		System.out.println("Youngest Friend : " + names[youngest]);
		System.out.println("Tallest Friend : " + names[tallest]);
		input.close();
	}
}
