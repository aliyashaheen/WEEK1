import java.util.Scanner;

public class temperatureconversion{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
	double c, f;
	System.out.println("enter the tempeerature value in clecius");
	c= sc.nextDouble();
	
	f= c*(9/5) + 32; 
	
	System.out.println("the" + " " + c + " " + "celcius is" + " " + f + " " + "farenheit");
	
	}
}