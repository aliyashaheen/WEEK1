import java.util.Scanner;
public class level1q8{
public static void generateException(String[] s){
System.out.println(s[5]);
}
public static void handleException(String[] s){
try{
System.out.println(s[5]);
}catch(ArrayIndexOutOfBoundsException e){
System.out.println("ArrayIndexOutOfBoundsException caught:"+e.getMessage());
}catch(Exception e){
System.out.println("Generic Exception:"+e.getMessage());
}
}
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
String[] names=new String[3];
for(int i=0;i<3;i++){
names[i]=sc.next();
}
//generateException(names);
handleException(names);
}}