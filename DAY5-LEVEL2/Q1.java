import java.util.Scanner;
public class Q1 {
public static int findLength(String s){
int count=0;
try{
while(true){
s.charAt(count);
count++;
}
}catch(IndexOutOfBoundsException e){
return count;
}
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String str=sc.next();
int len1=findLength(str);
int len2=str.length();
System.out.println("Built-in Length: "+len2+" User defined length:"+len1);
}
}