public class practice {

    public static void main(String[] args){
        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);
        int num1 = 6, num2 = 7;
        System.out.println("The sum is " + num1 + num2);   // Prints: The sum is 56
        System.out.println("The sum is " + (num1 + num2)); // Prints: The sum is 11

        float decimalNum = 9.789f;
        long longNum = 993928390582893L;
        double doubleNum = 87.9023d;
        System.out.println(decimalNum);
        System.out.println(longNum);
        System.out.println(doubleNum);
// Beginner
// Print numbers 1–100, but replace multiples of 3 with "Fizz", multiples of 5 with "Buzz", and multiples of both with "FizzBuzz"
        int[] number = new int[20];

        for (int i = 0; i < 20; i++){
            System.out.println(i);
            number[i] = i+1;
        }
        for (int i = 0; i < number.length; i++){
            if (i == 19){
            System.out.print(number[i]);
            }
            else {
            System.out.print(number[i] + "-");
            }
        }
// Check if a number is even or odd
// Find the largest of three numbers
// Calculate the factorial of a number
// Reverse a string
}
}