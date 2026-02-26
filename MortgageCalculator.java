import java.util.Scanner;

class MortgageCalculator{

    public static void main(String[] args) {
    //Principal Amount
    //Annual Interest Rate
    //Period (Years)
    //Mortgage

    final int percentNum = 100;
    System.out.print("Please enter a principal amount: ");
    Scanner scanner1 = new Scanner(System.in);
    float principalAmount = scanner1.nextFloat();

    System.out.print("Please enter an annual interest rate (write in decimal form only): ");
    Scanner scanner2 = new Scanner(System.in);
    float annualInterestRate = scanner2.nextFloat();
    annualInterestRate += 1;

    System.out.print("Please enter how many years: ");
    Scanner scanner3 = new Scanner(System.in);
    int yearPeriod = scanner3.nextInt();

    
    float mortgage = principalAmount * annualInterestRate * yearPeriod;
    int displayAnnualInterestRate = Math.round((annualInterestRate - 1) * percentNum);

    System.out.println("Your Principal Amount is: " + principalAmount);
    System.out.println("Your Annual Interest Rate is: " + displayAnnualInterestRate + "%");
    System.out.println("Your Year Period is: " + yearPeriod);
    System.out.println("Your Mortgage is: " + mortgage);

    scanner1.close();
    scanner2.close();
    scanner3.close();
    }
}