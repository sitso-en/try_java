package tutorials;
import java.util.Scanner;

public class SquareDisplay {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int num;
        do{
            System.out.print("Enter a number no less than 15: ");
            num = input.nextInt();
        }while(num<1 || num >15);

        for(int i=0; i<num;i++){
            for(int n=0; n< num; n++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        input.close(); 
    }
}
