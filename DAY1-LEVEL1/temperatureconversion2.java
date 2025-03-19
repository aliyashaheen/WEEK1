import java.util.Scanner;

public class temperatureconversion2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
	double c, f;
	System.out.println("enter the tempeerature value in farenheit");
	f= sc.nextDouble();
	
	c= (f-32)*5/9 ; 
	
	System.out.println("the" + " " + f + " " + "farenheit is" + " " + c + " " + "celcius");
	
	}
}