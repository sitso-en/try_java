package tutorials;
import java.util.Scanner;
import java.util.Random;

public class GuessingGamePlus{
    public static void main(String[] args){
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int randomNum = random.nextInt(200)+1;
        int n;
        int count =0;

        do{
            System.out.print("Guess the number: ");
            n = input.nextInt();

            count++;

            if(n< randomNum){
                System.out.println("Too low, try again");
            }else if(n>randomNum){
                System.out.println("Too high, try again");
            }else{
                System.out.println("You got it");
                System.out.println("You guessed " + count + " times");
            }
        }while(n != randomNum);
        input.close();
    }
}
