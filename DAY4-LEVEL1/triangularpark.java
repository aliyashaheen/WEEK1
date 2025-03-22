import java.util.Scanner;
public class triangularpark{
public static double triangle(double p){

return 5/p;
}

public static void main(String[] arg){

Scanner sc = new Scanner(System.in);

System.out.println("enter the length of side 1 in km");
double side1 = sc.nextDouble();
	
System.out.println("enter the length of side 2 in km");
double side2 = sc.nextDouble();

System.out.println("enter the length of side 3 in km");
double side3 = sc.nextDouble();	

if(side1 + side2 > side3 && side1+ side3 > side2 && side2 + side3 > side1){
double p = side1+side2+side3;
double r = triangle(p);
System.out.println("number of rounds = " + r);}

else {System.out.println("the given sides do not form a valid triangle.");}

sc.close();
}
}