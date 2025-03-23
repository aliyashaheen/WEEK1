import java.util.Scanner;
public class comparestring{
public static boolean compare(String s1, String s2){

if (s1.length()!=s2.length()){ return false;}  
for (int i=0 ; i<s1.length(); i++){
  if(s1.charAt(i) != s2.charAt(i)){ return false;}
    }
return true;
}
public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     System.out.println("enter the first string");   
     String s1 = sc.nextLine();

     System.out.println("enter the second string");
     String s2 =sc.nextLine();
    if (compare(s1,s2)){
      System.out.println("both the strings are equal");}   
    else {System.out.println("both are not equal");}
     sc.close();
  }
    }

