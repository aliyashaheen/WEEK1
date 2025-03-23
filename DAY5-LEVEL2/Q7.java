import java.util.Scanner;
public class Q7{
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
public static int[] getStartEndIndex(String s){
int start=0, end =findLength(s)-1;
while(start<=end && s.charAt(start)==' '){
start++;
}
while(end>=start && s.charAt(end)==' '){
end--;}
return new int[]{start,end};
}
public static String getSubString(String s,int start,int end){
String result="";
for(int i=start;i<=end;i++){
result+=s.charAt(i);
}
return result;
}
public static boolean compareString(String s1,String s2){
if(s1.length()!=s2.length()) return false;
for(int i=0;i<s1.length();i++){
if(s1.charAt(i)!=s2.charAt(i)) return false;
}
return true;
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int[] index=getStartEndIndex(str);
String result=getSubString(str,index[0],index[1]);
String builtin=str.trim();
System.out.println("User defined: "+result);
System.out.println("Built-in: "+builtin);
if(compareString(result, builtin)) System.out.println("Both methods produce same result");
else System.out.println("Results are not same");
}
}
