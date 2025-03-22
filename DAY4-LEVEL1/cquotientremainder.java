import java.util.Scanner;
public class cquotientremainder{
public static int[] quotientremainder(int n, int d){

int q = n/d;
int r = n%d;

return new int[]{q,r};
}
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("enter the number ");
int n = sc.nextInt();

System.out.println("enter the divisor");
int d = sc.nextInt();

int[] result = quotientremainder(n,d);
System.out.println("quootient " + result[0]);
System.out.println("remainder " + result[1]);


sc.close();
}
}