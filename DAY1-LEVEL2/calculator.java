import java.util.Scanner;

public class calculator{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);


System.out.println("enter number 1");
double number1 = sc.nextDouble();

System.out.println("enter number 2");
double number2 = sc.nextDouble();

double add = number1+number2;
double sub = number1-number2;
double multiply = number1*number2;
double divide = number1/number2;

System.out.println("The addition, subtraction,multiplication and division value of 2 numbers" + " " + number1 + " " + "and" + " " + number2 + " " + "is" + " "  + add + ", " + " " + sub + " ," + " " + multiply+ "," + " " + divide);

}
}