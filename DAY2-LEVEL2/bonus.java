import java.util.Scanner;

public class bonus{
public static void main(String[] arg){

Scanner sc = new Scanner(System.in);

System.out.println("Please enter your years of service");
int years = sc.nextInt();

System.out.println("Please enter your salary");
double salary = sc.nextDouble();

if (years > 5 ) {

double bonus =0.05*salary;

System.out.println("Your binus amount is " + bonus);}

}
}