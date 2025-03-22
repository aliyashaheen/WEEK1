import java.util.Scanner;
public class naturalnums{

public static int sumof(int n){
int sum =0;
for (int i=1; i<=n; i++)
sum += i;
return sum;
}

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter a number");
int n = sc.nextInt();

if(n<1){System.out.println("Please enter a positivr number");}
else {
	int result= sumof(n);
	System.out.println("the sum of the natural numbers is " + result);
	}
	
	
sc.close();
}
}

