import java.util.Scanner;
public class powerfoe{
public static void main(String [] args){

Scanner sc = new Scanner(System.in);
System.out.println("enter a number");
int num = sc.nextInt();
System.out.println("enter a power");

int power = sc.nextInt();
int result = 1;

for(int i=1; i<=power; i++){
result*=num;
}

System.out.println(result);
sc.close();
}
}