package tutorials;

import java.util.Scanner;

public class Pay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numStaff = 15;
        String[] staff = new String[numStaff];
        int[] hoursWorked = new int[numStaff];
        int[] numChildren = new int[numStaff];

        for (int i = 0; i < numStaff; i++) {
            System.out.print("Enter staff name: ");
            staff[i] = input.next();
            System.out.print("Enter hours worked for " + staff[i] + ": ");
            hoursWorked[i] = input.nextInt();
            System.out.print("Enter number of children for " + staff[i] + ": ");
            numChildren[i] = input.nextInt();
        }

        double[] grossPay = new double[15];
        double[] incomeTax = new double[15];
        double[] nhil = new double[15];
        double[] districtTax = new double[15];
        double[] getFund = new double[15];
        double[] netPay = new double[15];
        double totalNetPay = 0.0;

        double seniorRate = 50.0;
        double juniorRate = 0.7 * seniorRate;

        for (int i = 0; i < staff.length; i++) {
            boolean isSenior = staff[i].equals("John") || staff[i].equals("Rose") ||
                               staff[i].equals("Cynthia") || staff[i].equals("George") ||
                               staff[i].equals("Emmanuel") || staff[i].equals("Stephen") ||
                               staff[i].equals("Alfred");

            double regularRate = isSenior ? seniorRate : juniorRate;
            double overtimeRate;
            if (isSenior) {
                overtimeRate = regularRate * 1.5;
            } else {
                overtimeRate = regularRate * 1.25;
            }

            if (hoursWorked[i] <= 40) {
                grossPay[i] = hoursWorked[i] * regularRate;
            } else {
                int regularHours = 40;
                int overtimeHours = hoursWorked[i] - 40;
                grossPay[i] = (regularHours * regularRate) + (overtimeHours * overtimeRate);
            }

            // Deductions
            incomeTax[i] = 0.15 * grossPay[i];
            nhil[i] = 0.01 * grossPay[i];
            districtTax[i] = 0.03 * grossPay[i];

            // GetFund: 1 GHC per child in excess of 3
            if (numChildren[i] > 3) {
                getFund[i] = numChildren[i] - 3;
            } else {
                getFund[i] = 0;
            }

            // Net Pay
            netPay[i] = grossPay[i] - incomeTax[i] - nhil[i] - districtTax[i] - getFund[i];
            totalNetPay += netPay[i];
        }

        double averageNetPay = totalNetPay / staff.length;

        // Display output
        System.out.printf("%-12s %-6s %-10s %-10s %-10s %-8s %-12s %-10s %-10s%n",
            "Staff", "Hours", "Children", "Gross Pay", "Income Tax", "NHIL", "District Tax", "GetFund", "Net Pay");
        System.out.println("-----------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < staff.length; i++) {
            System.out.printf("%-12s %-6d %-10d %-10.2f %-10.2f %-8.2f %-12.2f %-10.2f %-10.2f%n",
                staff[i], hoursWorked[i], numChildren[i], grossPay[i], incomeTax[i], nhil[i], districtTax[i], getFund[i], netPay[i]);
        }

        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.printf("Total Net Pay:   %.2f%n", totalNetPay);
        System.out.printf("Average Net Pay: %.2f%n", averageNetPay);

        input.close();
    }
}
