import java.util.Scanner;

public class fees{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter fees");
double fees = sc.nextDouble();

System.out.println("Enter discount percent");
double discount_percent = sc.nextDouble();

double discount = fees*(discount_percent/100);
double final_fee = fees - discount;

System.out.println("the discount amont is INR" + " " + discount + " " + "and the final discounted fee is INR" + " " + final_fee);

}}
