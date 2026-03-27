package tutorials;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame{
    public static void main(String[] args){
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int randomNum = random.nextInt(200)+1;
        int n;

        do{
            System.out.print("Guess the number: ");
            n = input.nextInt();

            if(n< randomNum){
                System.out.println("Too low, try again");
            }else if(n>randomNum){
                System.out.println("Too high, try again");
            }else{
                System.out.println("You got it");
            }
        }while(n != randomNum);
        input.close();
    }
}
