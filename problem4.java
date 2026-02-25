import java.util.Scanner;

public class problem4 {
    
    public static void main(String[] args){
    // Calculate the factorial of a number
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter a number from 1-10");
    int factorial_num = scanner.nextInt();
    int i = 1;

    int number = 1;
    while (i<=factorial_num) {
    number *= i;
    i++;
    }
    scanner.close();
    System.out.println("Your number is: " + number);
    }  
}
