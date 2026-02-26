import java.util.Random;

public class problem7 {
    public static void main(String[] args) {
    long random_number = Math.round(Math.random() * 100);
    System.out.println("Random Number is: " + random_number);

    Random rand = new Random();

    int randomNumber = rand.nextInt(100) + 1; // 1-100
    double randomDecimal = rand.nextDouble();
    boolean randomBool = rand.nextBoolean();
    
    System.out.println("Random Number (1-100): " + randomNumber);
    randomNumber = rand.nextInt(100) + 1; // 1-100
    System.out.println("Random Number (1-100): " + randomNumber);
    System.out.println("Random Decimal: " + randomDecimal);
    randomDecimal = rand.nextDouble();
    System.out.println("Random Decimal: " + randomDecimal);
    System.out.println("Random Boolean: " + randomBool);
    randomBool = rand.nextBoolean();
    System.out.println("Random Boolean: " + randomBool);
    randomBool = rand.nextBoolean();
    System.out.println("Random Boolean: " + randomBool);
    }    
}
