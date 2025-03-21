import java.util.Scanner;
public class multiplicationtable{
public static void main(String[] arg){

Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int num = sc.nextInt();

int [] table = new int[12];

for(int i = 0; i< 10 ; i++){
table[i] = num*(i+1);}

for(int i=1; i<=10; i++){System.out.println(num + " * " + i + " = " + table[i-1]);}

sc.close();
}
}
