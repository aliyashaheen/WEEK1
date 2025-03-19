import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary (INR): ");
        double salary = sc.nextDouble();

        System.out.print("Enter bonus amount (INR): ");
        double bonus = sc.nextDouble();

        double total = salary + bonus;

        System.out.println("The salary in INR " + salary + " and bonus in INR " + bonus + ", hence the total income is INR " + total);

        sc.close(); 
    }
}