import java.text.NumberFormat;
import java.util.Scanner;

class MortgageCalculator{

    public static void main(String[] args) {
    //Principal Amount
    //Annual Interest Rate
    //Period (Years)
    //Mortgage

    System.out.print("Please enter a principal amount: ");
    Scanner scanner1 = new Scanner(System.in);
    float principalAmount = scanner1.nextFloat();

    System.out.print("Please enter an annual interest rate: ");
    Scanner scanner2 = new Scanner(System.in);
    float annualInterestRate = scanner2.nextFloat();
    annualInterestRate /= 100;

    System.out.print("Please enter how many years: ");
    Scanner scanner3 = new Scanner(System.in);
    int yearPeriod = scanner3.nextInt();

    NumberFormat yearlyInterestRate = NumberFormat.getPercentInstance();
    String displayAnnualInterestRate = yearlyInterestRate.format(annualInterestRate);
    
    float displayPrincipalAmount = principalAmount;
    float mortgage = 0;
    for(int i = 0; i < yearPeriod; i++){
    principalAmount += principalAmount * (annualInterestRate);
    mortgage = principalAmount;
    }

    System.out.println("Your Principal Amount is: " + displayPrincipalAmount);
    System.out.println("Your Annual Interest Rate is: " + displayAnnualInterestRate);
    System.out.println("Your Year Period is: " + yearPeriod);
    System.out.println("Your Mortgage is: " + mortgage);

    scanner1.close();
    scanner2.close();
    scanner3.close();
    }
}