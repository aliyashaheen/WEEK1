import java.util.Scanner;
public class positiveornegative{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);


int[] nums = new int[5];

for(int i=0; i < nums.length; i++){
System.out.println("enter the number " + (i+1));
nums[i] = sc.nextInt();
}

for(int i=0; i < nums.length; i++){
if (nums[i] == 0 ){System.out.println(nums[i] + " is zero");}
else if (nums[i]>0){
if (nums[i]%2==0){System.out.println(nums[i]+ " is positive and even");}
else {System.out.println(nums[i] + " is positive and odd");}}
else {System.out.println(nums[i] + " is negative");}
}

if (nums[0] == nums[4]){System.out.println("the first and last umbers are equal");}
else if (nums[0] > nums[4]){System.out.println("the first number is greater than the number");}
else {System.out.println("the first number is lesser than the last number");}

sc.close();
}
}