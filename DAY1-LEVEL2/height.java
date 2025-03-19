import java.util.Scanner;

public class height{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("enter your height in cm");
double height = sc.nextDouble();

double inches = height/2.54;
double feet = inches/12;


System.out.println("your height in cm is" + " " + height + " " + "while in feet is" + " " + feet + "and inches is" + " " + inches);

}
}