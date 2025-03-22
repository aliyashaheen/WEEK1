import java.util.Scanner;
public class checkspringseason{
public static boolean springseason(int month, int day){

if ((month==3 && day>=20 ) || (month==4 ) || (month==5) || (month==6 && day<=20)){return true;}
return false;
}


public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.println("enter the month(1-12)");
int month = sc.nextInt();

System.out.println("enter the day(1-30)");
int day = sc.nextInt();


if (springseason(month,day)){
System.out.println("Its a spring season");}
else {System.out.println("Not a spring season");}
sc.close();
}
}