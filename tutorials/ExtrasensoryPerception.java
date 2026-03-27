package tutorials;

import java.util.Random;
import java.util.Scanner;

public class ExtrasensoryPerception {
    public static void main(String[] args){
        Random random = new Random();
        Scanner input = new Scanner(System.in);
    
        String[] colors = {"Red", "Green", "Blue", "Orange", "Yellow"};
        int count =0;
        
        for(int i=0; i < 10; i++){
            int randomNum = random.nextInt(5);
            String rightColor = colors[randomNum];

            System.out.print("Guess the color: ");
            String userGuess = input.next();

            if(userGuess.equalsIgnoreCase(rightColor)){
                count++;
            }
            System.out.println("The system chose: " + rightColor);
        }

        System.out.println("You guessed " + count + " times correctly");
        input.close();
    }
}
