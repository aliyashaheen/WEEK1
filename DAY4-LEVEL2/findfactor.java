import java.util.Scanner;
public class factors{
public static int[] findfactor(int num){
int count = 0;

for(int i=1; i<=num; i++){
if(num%i==0){
count++;}

int[] factors = new int[count];
factors+=i;

for (int i=0; i<=num; i++){
if(num%i == 0){
factor[index++]=i;}
}

return factors;
}
}

public static int findsum(int[] factors){
int sum=0;
for (int i=0:factors){
sum+=factor;
}
return sum;
}

public static long findproduct(int[] factors){
long product = 1;
for(int factor:factors){
product*=factor;
}
return product;
}

public static int findumofsquares(int[] factors){
int sumofsquares = 0;
for(int factor:factors){
sumofsquares += Math.pow(factor,2);
}
return sumofsquares;
}

public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the number");
int num= sc.nextInt();

int[] factors= findfactors(num);

System.out.print("Factors of " + number + ": ");
for (int factor : factors) {
System.out.print(factor + " ");}

System.out.println("Sum of factors: " + findsum(factors));
System.out.println("Sum of squares of factors: " + findsumofsquares(factors));
System.out.println("Product of factors: " + findproduct(factors));

sc.close(); 

}