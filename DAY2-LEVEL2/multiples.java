import java.util.Scanner;
public class multiples{
public static void main(String[] args){

Scanner sc= new Scanner(System.in);
System.out.println("enter a positive number");
int num = sc.nextInt();

if (num<=0 || num>=100){System.out.println("please enter a positive number below 100.");}

for (int i=1; i<100; i++){
if(i%num==0){System.out.println(i);}}

sc.close();
}
} 