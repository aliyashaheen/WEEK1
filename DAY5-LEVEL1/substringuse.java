import java.util.Scanner;
public class substringuse{
public static String substring(String s1, int s, int e){
    String res ="";
    for(int i=s; i<=e; i++){
        res +=s1.charAt(i);     }
        return res;
    }

public static boolean check(String s1, String s2){
if (s1.length()!= s2.length()){   return false;  }
for (int i=0; i<=s1.length(); i++){
    if(s1.charAt(i) != s2.charAt(i)){ return false;}}
return true;
}

public  static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");
    String s = sc.nextLine();
    int start= sc.nextInt();
    int end = sc.nextInt();
    String result = substring(s,start,end);
    System.out.println("Substring is : " + result);

        System.out.println(check(s,result));
    String substr =s.substring(4);
    System.out.println(substr);
    System.out.println(s.equals(substr));

sc.close();
    }}
