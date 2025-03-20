import java.util.Scanner;
public class multipleswhile{
public static void main(String[] arg){

Scanner sc = new Scanner(System.in);
System.out.println("enter a number less than 100");
int num= sc.nextInt();
if (num<=0 || num>=100){System.out.println("please enter a positive number below 100.");}

int counter = 100;

while(counter>1){
if (counter%num==0){System.out.println(counter);}
counter --;
}

sc.close();
}
}