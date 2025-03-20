import java.util.Scanner;
public class greatestfactorwhile{
public static void main(String [] args){

Scanner sc = new Scanner(System.in);

System.out.println("enter a number");
int num = sc.nextInt();
int gf= 1;
int counter= num - 1;

while(counter > 1){
if(num%counter==0){
	gf=counter;
	break;	}
	
counter--;}

System.out.println("the greatest factor of " + num + " other than itself is " + gf);
sc.close();
}
}