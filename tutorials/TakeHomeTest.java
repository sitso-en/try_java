package tutorials;

import java.util.Scanner;

public class TakeHomeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers from 1 to 20:");
        int[] evens = new int[10];
        int evenCount = 0;

        int count = 0;
        while (count < 20) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num < 1 || num > 20) {
                System.out.println("Invalid! Enter a number between 1 and 20.");
                continue;
            }
            if (num % 2 == 0 && evenCount < 10) {
                evens[evenCount] = num;
                evenCount++;
            }
            count++;
        }

        System.out.print("Even integers: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evens[i] + " ");
        }
        System.out.println();

        double sum = 0;
        for (int i = 0; i < evenCount; i++) {
            sum += evens[i];
        }
        double average = sum / evenCount;
        System.out.printf("Average: %.2f%n", average);

        long factorial = 1;
        for (int i = 1; i <= (int) average; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + (int) average + ": " + factorial);

        double sqrtFactorial = Math.sqrt(factorial);
        System.out.printf("Square root of factorial: %.4f%n", sqrtFactorial);

        double mean = (sqrtFactorial + factorial) / 2.0;
        double variance = (Math.pow(sqrtFactorial - mean, 2) + Math.pow(factorial - mean, 2)) / 2.0;
        double stdDev = Math.sqrt(variance);
        System.out.printf("Standard deviation: %.4f%n", stdDev);

        sc.close();
    }
}
