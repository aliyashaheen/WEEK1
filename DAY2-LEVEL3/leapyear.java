import java.util.Scanner;
public class leapyear{
public static void main(String [] args){

Scanner sc = new Scanner(System.in);
System.out.println("enter a year");
int year= sc.nextInt();

if (year<1582){System.out.println("enter year that comes only ater 1582");}

if (year%4==0){System.out.println(year + " is a leap year");}
else if (year%100 != 0) {System.out.println("is not a leap year");}
else if (year%400==0){System.out.println(year + "is a leap year");}
else {System.out.println("not a leap year");}

sc.close();
	
}	
}