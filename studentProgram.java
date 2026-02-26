import java.util.Scanner;

public class studentProgram {
    public static void main(String[] args) {
    // Create a program that:
    // Stores students (ID, name, list of grades)
    // Computes:
    // Average grade per student
    // Highest grade
    // Overall class average
    // Allows searching student by ID
    // Displays students sorted by average (highest to lowest)
    int money = 200_000;
    String financialStatus = (money >= 200_000) ? "Very very rich" : "Very very poor";

    System.out.println(financialStatus);
    switch (money){
        case (200_000):
            System.out.println("Your money is: " + money);  
            break;
    }

    String loopOrder = "";
    while (true){
        System.out.print("It's true: ");
        Scanner scanner = new Scanner(System.in);
        loopOrder = scanner.nextLine();
        
        if(loopOrder.equals("pass")){
            System.out.println("You passed the fireball effect!");
            continue;
        } else if(loopOrder.equals("stop")){
            break;
        }
        System.out.println("You've been hit by a stray fireball!");
    }
    }

    // int ID;
    // String name;
    // int[] grades;
    // public void studentInfo(int ID, String name, int[] grades) {
        // this.ID = ID;
        // this.name = name;
        // this.grades = grades;
    // }
}
