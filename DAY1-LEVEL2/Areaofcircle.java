import java.util.Scanner;

public class Areaofcircle{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the radius in cm");
	double radius = sc.nextDouble();
	
	double area = 3.14159 * radius * radius;
	System.out.println(area);
	
	sc.close();
	
	}
}