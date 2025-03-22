import java.util.Scanner;
public class chocolateschildrean{

public static int[] numchocolate(int numofchocolates, int numofchildren){

int chocolateperstudent = numofchocolates/numofchildren;
int remainingchocolates = numofchocolates%numofchildren;

return new int[]{chocolateperstudent, remainingchocolates};
}

public static void main(String[] arg){

Scanner sc = new Scanner(System.in);
System.out.println("enter the number of chocolates");
int numofchocolates = sc.nextInt();

System.out.println("enter the number of children");
int numofchildren = sc.nextInt();

int[] result = numchocolate(numofchocolates, numofchildren);
System.out.println("chocolate per student " + result[0]);
System.out.println("remaining chocolates " + result[1]);

sc.close();
}
}