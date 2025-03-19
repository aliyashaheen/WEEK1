import java.util.Scanner;

public class swapnumbers{
public static void main(String[] arg){

Scanner sc = new Scanner(System.in);

System.out.println(" enter number 1");
int num1= sc.nextInt();

System.out.println(" enter number 2");
int num2 = sc.nextInt();

int a;

a=num1;
num1= num2;
num2=a;

System.out.println(" the swapped numbers are" + " " + num1 + " " + "and" + " " + num2);

}
}