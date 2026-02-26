import java.util.Scanner;

public class studentProgramFinal {
    // Create a program that:
    // Stores students (ID, name, list of grades)
    // Computes:
    // Average grade per student
    // Highest grade
    // Overall class average
    // Allows searching student by ID
    // Displays students sorted by average (highest to lowest)    
    public static void main(String[] args) {
    
    
    studentMetrics student1 = new studentMetrics("2023-3973-A", "Karl Andrei");
    
    int i = 0;
    while(i < 10){
        System.out.print("Please enter your grades in order: ");
        Scanner scanner = new Scanner(System.in);
        student1.grades[i] = scanner.nextInt();
        i++;
    }

    student1.printGrades(student1.grades);
    float student1_avgGrade = student1.computeAvg(student1.grades);
    System.out.println("The student 1's average grade is: " + student1_avgGrade);
    student1.printMaxGrade();
    }
}
