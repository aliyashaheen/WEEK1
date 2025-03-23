import java.util.Scanner;
public class level1q6 {
    public static boolean compare(String s1, String s2){
        if(s1.length() != s2.length()){return false;}
        for(int i=0; i<s1.length(); i++){
        if(s1.charAt(i) != s2.charAt(i)){ return false;}
    }

    return true;
        }
    }
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String s = sc.nextLine();


    sc.close();
}
}
