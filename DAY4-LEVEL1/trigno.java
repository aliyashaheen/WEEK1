import java.util.Scanner;
public class trigno{
public static double[] calculatetrignometricfunctions(double angle){
double radians = Math.toRadians(angle);

double sine = Math.sin(radians);
double cos = Math.cos(radians);
double tan = Math.tan(radians);

return new double[] {sine, cos, tan};
}

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("enter the angle in degrees");
double angle = sc.nextDouble();
 
double[] result = calculatetrignometricfunctions(angle);

System.out.println(" sine of " + angle + " = "+ result[0]);
System.out.println(" cos of " + angle + " = " +result[1]);
System.out.println(" tan of " + angle + " = " +result[2]);

sc.close();
}
}