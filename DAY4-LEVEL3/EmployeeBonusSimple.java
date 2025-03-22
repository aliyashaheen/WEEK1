import java.util.Random;

public class EmployeeBonusSimple {
    public static void main(String[] args) {
        Random rand = new Random();
        int numEmployees = 10;
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.printf("%-5s %-10s %-5s %-12s %-12s\n", "ID", "Salary", "Years", "New Salary", "Bonus");
        System.out.println("---------------------------------------------------");

        for (int i = 1; i <= numEmployees; i++) {
            double salary = 10000 + rand.nextInt(90000); 
            int years = rand.nextInt(11);
            double bonus = salary * (years > 5 ? 0.05 : 0.02);
            double newSalary = salary + bonus;

            totalOldSalary += salary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-5d %-10.2f %-5d %-12.2f %-12.2f\n", i, salary, years, newSalary, bonus);
        }

        System.out.println("---------------------------------------------------");
        System.out.printf("Total  %-10.2f %-5s %-12.2f %-12.2f\n", totalOldSalary, "", totalNewSalary, totalBonus);
    }
}
