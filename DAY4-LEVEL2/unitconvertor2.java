import java.util.Scanner;
public class unitconvertor2 {
    public static double convertyardstofeet(double yards){
        double yardstofeet=3;
        double feet = yards*yardstofeet;
        return feet;
    }

    public static double convertfeettoyards(double feet){
        double feettoyards= 0.333333;
        double yards = feet*feettoyards;
        return yards;
    }

    public static double convertmeterstoinches(double meters){
        double meterstoinches = 39.3701;
        double inches = meters*meterstoinches;
        return inches;
    }

    public static double convertinchestometers(double inches){
        double inchestometers = 0.0254;
        double meters = inches*inchestometers;
        return meters;
    }
    
    public static double convertinchestocm(double inches){
        double inchestocm = 2.54;
        double cm = inches*inchestocm;
        return cm;
    }
    
public static void main(String [] args){
Scanner sc = new Scanner(System.in);

System.out.println("Choose one of the conversion methods");
System.out.println("1. yards to feet");
System.out.println("2. feet to yards");
System.out.println("3. meters to inches");
System.out.println("4. inches to meters");
System.out.println("5.inches to cm");

int choice = sc.nextInt();

if(choice==1){
System.out.println("enter yards");
double input = sc.nextInt();
double result = convertyardstofeet(input);
System.out.println(input + " yards= " + result + " feet");
} 

else if(choice==2){
    System.out.println("enter feets");
    double input = sc.nextInt();
    double result = convertfeettoyards(input);
    System.out.println(input + " feets=" + result + " yards");
}

else if(choice==3){
    System.out.println("enter meter");
    double input = sc.nextInt();
    double result= convertmeterstoinches(input);
    System.out.println(input + " meter=" + result + " inches");
}

else if(choice==4){
    System.out.println("enter inches");
    double input = sc.nextInt();
    double result= convertinchestometers(input);
    System.out.println(input + " feets=" + result + " meters");
}

else if(choice==5){
    System.out.println("enter inches");
    double input = sc.nextInt();
    double result= convertinchestocm(input);
    System.out.println(input + " inches=" + result + " cm");
}

else {System.out.println("invalid choice");}    
sc.close();
}
}
