import java.util.Scanner;
public class sumofnatural{
public static int recursivesum(int n){

if(n==1){return 1;}
return n + recursivesum(n-1);
}

public static int sumofnum(int n){
	return n* (n+1) /2;
}

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int n = sc.nextInt();

int sumrec = recursivesum(n);
int sumnum = sumofnum(n);

System.out.println("Sum using recursion " + sumrec);
System.out.println("Sum using formula " + sumnum);

if (sumrec == sumnum){
	System.out.println("both the results match"  );}
else {System.out.println("error ");}

sc.close();
}
}