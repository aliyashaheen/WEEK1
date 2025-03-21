import java.util.Scanner;
public class multiplication6to9{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int number = sc.nextInt();
if(number>=6 && number<=9){
int[] multiplicationResult=new int[10];
for(int i=0;i<10;i++){
multiplicationResult[i]= number*(i+1);}
for(int j=0;j<10;j++){
System.out.println(number+" * "+(j+1)+" = " + multiplicationResult[j]);}
}
}
}