public class practice {

    public static void main(String[] args){
// Beginner
// Print numbers 1–100, but replace multiples of 3 with "Fizz", multiples of 5 with "Buzz", and multiples of both with "FizzBuzz"
        String[] number = new String[100];

        for (int i = 0; i < 100; i++){
            int num = i+1;
            if (num%3 == 0 && num%5 == 0){
               number[i] = "FizzBuzz";
            } else if (num%3==0){
                number[i] = "Fizz";
            } else if (num%5 == 0){
                number[i] = "Buzz";
            } else {
                number[i] = String.valueOf(num);
            }
        }
        for (int i = 0; i < number.length; i++){
            System.out.println(number[i]);
        }
    }
}