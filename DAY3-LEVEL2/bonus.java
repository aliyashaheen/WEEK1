import java.util.Scanner;

public class bonus{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double[] salary = new double[10];
		int[] years = new int[10];
		double[] bonus = new double[10];
		double[] newsalary = new double[10];
		
		double totalsalary = 0; 
		double totalbonus = 0; 
		double totalnewsalary = 0;
		
		for(int i = 0; i < 10; i++){
			System.out.println("Enetr the Salary " +(i + 1) + ": ");
			salary[i] = input.nextDouble();
			System.out.println("Enetr years of service of employee " +(i + 1) + ": ");
			years[i] = input.nextInt();
			
			if(salary[i] <= 0 || years[i] < 0){
				System.out.print("Invalid Input, Please enter details again");
				i--;
				continue;
			}
			bonus[i] = (years[i] >= 5) ? salary[i] * 0.05 : salary[i] * 0.02;
			newsalary[i] = salary[i] + bonus[i];
			
			totalsalary += salary[i];
			totalbonus += bonus[i];
			totalnewsalary += newsalary[i];
		}
		System.out.println("\nTotal Old Salary: " + totalsalary);
        System.out.println("Total Bonus Payout: " + totalbonus);
        System.out.println("Total New Salary: " + totalnewsalary);
		
		input.close();
	}
}
