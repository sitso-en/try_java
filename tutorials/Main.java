package tutorials;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Date now = new Date();
        System.out.println(now);

        final byte MONTHS_IN_YEAR =12;
        final byte PERCENT  = 100;
        int principal = 0;
        double annualInterest =0.0;
        double monthlyInterest= 0.0;
        int numberOfPayments =0;
        
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.print("Principal($1K - $1M): ");
            principal = input.nextInt();
            if(principal >=1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1,000 and 1,000,000"); 
        }
        
        while(true){
            System.out.print("Annual interest rate: ");
            annualInterest = input.nextFloat();
 
            if (annualInterest >=1 && annualInterest <= 30){
                monthlyInterest = annualInterest/ PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        System.out.print("Period(Years): ");
        int period = input.nextInt();
        numberOfPayments = period * MONTHS_IN_YEAR;


        double numerator = monthlyInterest * Math.pow((1 + monthlyInterest), period);
        double denominator = (Math.pow((1+monthlyInterest), numberOfPayments) - 1);

        double mortage = principal * (numerator/denominator);

        String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.printf("Mortage: " + mortageFormatted);
 
        input.close();
    }
}
 