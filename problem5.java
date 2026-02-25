import java.util.Arrays;
import java.util.Scanner;

public class problem5 {
// Reverse a string
    public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter a string: ");
    String given_string = scanner.nextLine();
    
    String reversed = "";
    for (int i = given_string.length() - 1; i >= 0; i-- ){
        reversed += given_string.charAt(i);
    }
    System.out.println(reversed);
    scanner.close();
}
}