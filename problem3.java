import java.util.Scanner;

public class problem3 {
// Find the largest of three numbers
    public static void main(String[] args) {
    
    Scanner scanner1 = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);
    Scanner scanner3 = new Scanner(System.in);

    int[] num = new int[3];
    System.out.print("Please enter a number: ");
    num[0] = scanner1.nextInt();

    System.out.print("Please enter a 2nd number: ");
    num[1] = scanner2.nextInt();

    System.out.print("Please enter a 3rd number: ");
    num[2] = scanner3.nextInt();

    int i = 0;
    int biggest_number = 0;
    while (i < num.length){
    if (biggest_number < num[i]){
    biggest_number = num[i];
    }
    i++;
    }

    System.out.println("The biggest number is: " + biggest_number);
    }
}
