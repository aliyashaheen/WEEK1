import java.util.Scanner;
public class simpleinterest{
public static int si(int p, int r, int t){

return (p*r*t)/100;
}

public static void main(String[] arg){
Scanner sc = new Scanner(System.in);

System.out.println("Enter principal amount");
int p = sc.nextInt();

System.out.println("Enter rate of interest");
int r = sc.nextInt();

System.out.println("Enter time");
int t = sc.nextInt();

int si1 =  si(p,r,t);
System.out.println(" " + si1 );
sc.close();
}
}