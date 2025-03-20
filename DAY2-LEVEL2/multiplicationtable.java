import java.util.Scanner;
public class multiplicationtable{
public static void main(String[] arg){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int num = sc.nextInt();

for(int i=6; i<=9; i++){
System.out.println(num + " * " + i + " = " + (num*i));
}

}
}