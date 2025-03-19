import java.util.Scanner;

public class doubleoperation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.println("enter value for a");
		a= sc.nextDouble();
		System.out.println("enter value for b");
		b= sc.nextDouble();
		System.out.println("enter value for c");
		c= sc.nextDouble();
		
		double d = a + b*c;
		double e = a*b + c;
		double f = c + a/b;
		double g = a%b + c;
		
System.out.println("the results of Int operations are" + " " + d + " " + e + " " + f + " " + g);

	}
}