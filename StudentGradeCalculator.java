package StudentGrade;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of Grades: ");
        int numGrades = scanner.nextInt();

        ArrayList<Integer> grades = new ArrayList<>();

        for (int i = 0; i < numGrades; i++) {
            System.out.print("Enter Grade " + (i + 1) + ": ");
            int grade = scanner.nextInt();
            grades.add(grade);
        }

        scanner.close();

        if (grades.isEmpty()) {
            System.out.println("No grades entered.");
        } else {
            int total = 0;
            int highest = Integer.MIN_VALUE;
            int lowest = Integer.MAX_VALUE;

            for (int grade : grades) {
                total += grade;
                if (grade > highest) {
                    highest = grade;
                }
                if (grade < lowest) {
                    lowest = grade;
                }
            }

            System.out.println("*****Students score*****");

            double average = (double) total / grades.size();

            System.out.println("Average Score is: " + average);
            System.out.println("Highest Score is: " + highest);
            System.out.println("Lowest Score is: " + lowest);
        }
    }
}
