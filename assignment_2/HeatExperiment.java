import java.util.Scanner;

public class HeatExperiment{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double grandTotalAverages =0;
        
        System.out.print("Enter the number of experiments");
        int numExperiments=input.nextInt();

        for (int i = 1; i <= numExperiments; i++) {
            System.out.print("Experiment " + i + " Morning Temp: ");
            double morningTemp = input.nextDouble();
            System.out.print("Experiment " + i + " Evening Temp: ");
            double eveningTemp = input.nextDouble();

            double average = (morningTemp + eveningTemp) / 2;
            grandTotalAverages += average;

            String status = (average > 100) ? "UNSTABLE" : "NORMAL";
            System.out.println("Experiment " + i + ": " + average + "°C - STATUS: " + status);
        }

        input.close();

        double grandAverage = grandTotalAverages / numExperiments;
        System.out.println("\nFinal Grand Average for Lab: " + grandAverage + "°C");
    }
}