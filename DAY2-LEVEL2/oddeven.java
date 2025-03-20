import java.util.Scanner;

public class oddeven{
public static void main(String [] arg){

Scanner sc= new Scanner(System.in);

System.out.println(" Enter a number");
int lastnum = sc.nextInt();

for( int i=1; i<=lastnum; i++){

if (i%2 == 0) {System.out.println(i +  " is even" );}

else {System.out.println(i +  " is odd" );}

} 
}
}