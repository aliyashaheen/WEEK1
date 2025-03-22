import java.util.Scanner;
public class positivenegative{
public static int pn(int num){

if (num>0){ return 1;}
else if(num<0){return -1;}
else {return 0;}

}

public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.println("enter a number to check if it is negative, positive or zero");
int num = sc.nextInt();

int result = pn(num);
System.out.println("result: " + result);
sc.close();
}
}