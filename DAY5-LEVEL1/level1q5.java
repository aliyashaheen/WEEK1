import java.util.Scanner;
public class level1q5 {
    public void generate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Emter a string");
        String s = sc.nextLine();
        System.out.println("length of the string is " + s.length() + s.charAt(s.length()) );
    }
    public static void handle(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Emter a string");
            String s = sc.nextLine();
            System.out.println("length of the string is " + s.length() + s.charAt(s.length()) );
        }
        catch (Exception e){
        System.out.println("exception caught " + e.getMessage());
    }
}
    public static void main(String[] args){
    handle();
}
}
