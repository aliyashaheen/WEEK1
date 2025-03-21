import java.util.Scanner;
public class votingage{
public static void main(String[] arg){

Scanner sc = new Scanner(System.in);
int[] age = new int[10];

for(int i=0; i< age.length; i++){
System.out.println("enter the age of student " + (i+1));
age[i] =sc.nextInt();}

System.out.println("Voting eligibility results are");

for(int i=0 ; i<age.length; i++){
if (age[i]<0){System.out.println("Invalid age entered " + age[i]);}
else if(age[i] >= 18){System.out.println("The student with age entered " + age[i]+ " can vote.");}
else {System.out.println("The student with age entered " + age[i]+ " cannot vote.");}
}

sc.close();
}
}