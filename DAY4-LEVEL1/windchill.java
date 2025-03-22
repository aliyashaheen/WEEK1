import java.util.Scanner;
public class windchill{

public static double calculatewindchill(double temp, double windspeed){

return 35.74+0.6215*temp + (0.4275*temp - 35.75)* Math.pow(windspeed, 0.16);

}

public static void main(String[] arg){
Scanner sc = new Scanner(System.in);

System.out.println("enter the temperature in farenheit");
double temp = sc.nextDouble();

System.out.println("Enter the wind speed in mph");
double windspeed = sc.nextDouble();

double windchill = calculatewindchill(temp, windspeed);
System.out.println("the wind chill temperature is " + windchill);
sc.close();
}
}