import java.util.Scanner;
public class marks2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        double[][] studentData = new double[numStudents][5]; 
        // Columns: 0 - Physics, 1 - Chemistry, 2 - Maths, 3 - Percentage, 4 - Grade (as numeric representation)

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

                do {
                    System.out.print(subject + ": ");
                    studentData[i][j] = sc.nextDouble();

                    if (studentData[i][j] < 0) {
                        System.out.println("Invalid input! Please enter a positive value.");
                    }
                } while (studentData[i][j] < 0);
            }

            double totalMarks = studentData[i][0] + studentData[i][1] + studentData[i][2];
            studentData[i][3] = totalMarks / 3.0; 

            if (studentData[i][3] >= 80) {
                studentData[i][4] = 'A';
            } else if (studentData[i][3] >= 70) {
                studentData[i][4] = 'B';
            } else if (studentData[i][3] >= 60) {
                studentData[i][4] = 'C';
            } else if (studentData[i][3] >= 50) {
                studentData[i][4] = 'D';
            } else if (studentData[i][3] >= 40) {
                studentData[i][4] = 'E';
            } else {
                studentData[i][4] = 'R';
            }
        }

        System.out.println("\nStudent Grades:");
        System.out.println("-----------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        System.out.println("-----------------------------------------------------");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-10.2f %-10c\n", 
                              (i + 1), studentData[i][0], studentData[i][1], studentData[i][2], studentData[i][3], (char)studentData[i][4]);
        }

        sc.close();
    }
