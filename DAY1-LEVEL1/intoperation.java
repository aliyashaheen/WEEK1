import java.util.Scanner;

public class intoperation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("enter value for a");
		a= sc.nextInt();
		System.out.println("enter value for b");
		b= sc.nextInt();
		System.out.println("enter value for c");
		c= sc.nextInt();
		
		int d = a + b*c;
		int e = a*b + c;
		int f = c + a/b;
		int g = a%b + c;
		
		System.out.println("the results of Int operations are" + " " + d + " " + e + " " + f + " " + g);
				
	}
}

