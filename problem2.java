import java.util.Scanner;

public class problem2 {
    public static void main(String[] args){
    // Check if a number is even or odd
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter a number: ");
    int number = scanner.nextInt();

    if (number%2 == 0){
    System.out.println("Your number is even: " + number);
    } else if (number%2 != 0){
    System.out.println("Your number is odd: " + number);
    }
}
}