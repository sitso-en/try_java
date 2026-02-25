import java.util.Scanner;

public class QualityControl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boardHealth = 100.0;
        int spikeCount = 0;
        int userChoice = 1;

        do {
            spikeCount++;
            System.out.print("Enter damage for Power Spike " + spikeCount + ": ");
            double damage = input.nextDouble();
            
            boardHealth -= damage;
            System.out.println("Remaining Health: " + boardHealth);

            if (boardHealth <= 0) {
                System.out.println("TEST TERMINATED: Component Destroyed.");
                break;
            }

            System.out.print("Continue testing? (1 for Yes, 0 for No): ");
            userChoice = input.nextInt();

        } while (boardHealth > 0 && userChoice == 1);

        input.close();

        System.out.println("Total spikes survived: " + (boardHealth <= 0 ? spikeCount - 1 : spikeCount));
    }
}