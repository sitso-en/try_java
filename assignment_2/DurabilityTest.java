import java.util.Scanner;

public class DurabilityTest {
    public static void main(String[] args) {
        final double FAILURE_THRESHOLD = 15.0;
        Scanner input = new Scanner(System.in);
        double structuralIntegrity = 100.0;
        int cycleCount = 0;

        while (structuralIntegrity > FAILURE_THRESHOLD) {
            cycleCount++;
            System.out.print("Enter pressure force for Cycle [" + cycleCount + "]: ");
            double pressure = input.nextDouble();

            structuralIntegrity -= pressure;

            // Apply Fatigue Damage
            if (pressure > 20.0) {
                structuralIntegrity -= 5.0;
            }

            System.out.println("Remaining Integrity: " + structuralIntegrity);
        }
        input.close();

        System.out.println("\nMaterial Failure at Cycle " + cycleCount + "!");
        System.out.println("Final Integrity Level: " + structuralIntegrity);
    }
}