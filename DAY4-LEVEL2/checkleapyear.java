import java.util.Scanner;
public class checkleapyear{
public static int leapyear(int year){

if(year%4==0 && year%400 == 0) {return 1;}
else return -1;
}
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the year ");
int year = sc.nextInt();

if (year<1582){System.out.println("please enter a year that comes after 1582");}

int result= leapyear(year);
if(result ==1){
System.out.println("it is a leap year");}
else {System.out.println("it is not a leap year");}

sc.close();
}
}
