import java.util.Scanner;
public class amarakbaranthony{
public static void main(String[] arg){

Scanner sc= new Scanner(System.in);

System.out.println("enter amars age");
int ageamar = sc.nextInt();
System.out.println("enter amars height");
double heightamar = sc.nextDouble();

System.out.println("enter akbars age");
int ageakbar = sc.nextInt();
System.out.println("enter akbars height");
double heightakbar = sc.nextDouble();

System.out.println("enter anthony age");
int ageanthony = sc.nextInt();
System.out.println("enter anthony height");
double heightanthony = sc.nextDouble();

String youngest;
if(ageamar <=ageakbar && ageamar <= ageanthony){youngest = "Amar ";}
else if (ageakbar <= ageamar && ageakbar <= ageanthony){youngest = "Akbar";}
else {youngest="Anthony";}

String tallest;
if(heightamar >= heightakbar && heightamar >= heightanthony){tallest = "Amar";}
else if(heightakbar >= heightamar && heightakbar >= heightanthony){tallest = "Akbar";}
else {tallest ="Anthony ";}

System.out.println("the youngest friend is " + youngest);
System.out.println("the tallest friend is " + tallest);

sc.close();
}
}
