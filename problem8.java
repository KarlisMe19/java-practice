import java.util.Scanner;
import java.text.NumberFormat;

public class problem8 {
    public static void main(String[] args) {
    System.out.print("Please enter a number: ");
    Scanner scanner = new Scanner(System.in);
    String textSample = scanner.nextLine();

    System.out.println("Your typed text is: " + textSample.trim());

    // float percentNumber = scanner.nextFloat();
    // String result = NumberFormat.getPercentInstance().format(percentNumber/100);
    // System.out.println("Your number in percentage is: " + result);

    scanner.close();
    }
}
