import java.util.Scanner;
public class unitconvertor3 {
public static double f2ctemp(double f){
double f2c = (f - 32)*5/9;
return f2c; 
}
    
public static double c2ftemp(double c){
double c2f = (c*9/5)+32;
return c2f;
} 

public static double p2kilo(double p){
    double p2k = 0.453592;
    double k = p*p2k;
    return k;
    } 

public static double kilo2p(double k){
    double k2p = 2.20462; 
    double p = k*k2p;
    return p;
} 

public static double gallon2l(double g){
    double g2l = 3.78541; 
    double l = g*g2l;
    return l;
} 

public static double litres2g(double l){
    double l2g = 0.264172;
    double g= l*l2g;
    return g;
}    

public static void main(String[] main){
    Scanner sc = new Scanner(System.in);
    System.out.println("Choose one of the conversions.");
    System.out.println("1. Farenheit to celcius");
    System.out.println("2. celcius to farenheit");
    System.out.println("3. pounds to kilograms");
    System.out.println("4. kilograms to pounds");
    System.out.println("5. gallons to litres");
    System.out.println("6. litres to gallons");

    int choice= sc.nextInt();
    
    if (choice==1){
        System.out.println("enter farenheit");
        double input =sc.nextDouble();
        double result = f2ctemp(input);
        System.out.println(input + " farenheit = " + result + " celcius");
    }

    else if (choice==2){
        System.out.println("enter clecius");
        double input= sc.nextDouble();
        double result = c2ftemp(input);
        System.out.println(input + " celcius = " + result + " farenheit");
    }

    else if (choice==3){
        System.out.println("enter pounds");
        double input = sc.nextDouble();
        double result = p2kilo(input);
        System.out.println(input + " pounds = " + result + " kilograms");
       }

       else if(choice==4){
        System.out.println("enter kilograms");
        double input = sc.nextDouble();
        double result = kilo2p(input);
        System.out.println(input + " kilos= " + result + " pounds" );
       }

       else if(choice==5){
        System.out.println( " enter gallons");
        double input = sc.nextDouble();
        System.out.println(input +" gallons = " + result + " litres");
       }

       else if(choice==6){
        System.out.println( " enter litres");
        double input = sc.nextDouble();
        System.out.println(input +" litres = " + result + " gallons");
       }

       
    else{System.out.println("select one of the given choices only");}

    sc.close();
}
}
