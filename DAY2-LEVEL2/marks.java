import java.util.Scanner;
public class marks{
public static void main(String[] arg){

Scanner sc = new Scanner(System.in);
System.out.println("enter your physics marks");
double physics = sc.nextDouble();

System.out.println("enter your chemistry marks");
double chemistry = sc.nextDouble();

System.out.println("enter your maths marks");
double maths = sc.nextDouble();

double total = maths+physics+chemistry;
double percentage = (total/300)*100;

System.out.println("the percentage is " +  percentage);

if (percentage >= 80 ){System.out.println(" Grade : A, Remarks:Excellent ");}
else if (percentage >= 70 && percentage <= 79 ){System.out.println(" Grade : B, Remarks: Very Good");}
else if (percentage >= 60 && percentage <= 69 ){System.out.println(" Grade : C, Remarks: Good");}
else if (percentage >= 50 && percentage <= 59 ){System.out.println(" Grade : D, Remarks: Satisfactory");}
else if (percentage >= 40 && percentage <= 49 ){System.out.println(" Grade : E, Remarks: NeedsImprovment");}
else if (percentage <= 39 ){System.out.println(" Grade : R, Remarks:Fail");}

sc.close();
}

}