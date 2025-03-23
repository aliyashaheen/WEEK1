import java.util.Arrays;
import java.util.Scanner;
public class level1q3 {
    public static char[] storestring(String s){
        char[] charecters = new char[s.length()];
        for (int i=0; i<s.length();i++){
            charecters[i]=s.charAt(i);
        }
        return charecters;
    }
    
    public static boolean check(char[] c1,char[]c2){
        if(Arrays.equals(c1,c2))return true;
            return false;        
    }

    
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.next();
        char[] ch1=storestring(s);
        char[] ch2=s.toCharArray();
        if (check(ch1,ch2)){System.out.println("Both are equal");}
        else {System.out.println("both are not equal");}
        sc.close();
    }
     
}
