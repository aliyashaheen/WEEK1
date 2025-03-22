import java.util.Scanner;
public class handshake{
public static int max(int n){
return (n*(n-1))/2;
}

public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.print("enter the number of students");
int n = sc.nextInt();

if(n<2){
System.out.println("at least 2 students are required");}
else {
int max = max(n);
System.out.println("max possible handshakes " + max);}

sc.close();
}
} 