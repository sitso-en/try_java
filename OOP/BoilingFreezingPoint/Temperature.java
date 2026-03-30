package OOP.BoilingFreezingPoint;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a temperature: ");
        int temperature = input.nextInt();

        isEthylFreezing ief = new isEthylFreezing();
        isEthylBoiling ieb = new isEthylBoiling();
        isOxygenBoiling iob = new isOxygenBoiling();
        isOxygenFreezing iof = new isOxygenFreezing();
        isWaterBoiling iwb = new isWaterBoiling();
        isWaterFreezing iwf= new isWaterFreezing();

        if(ief.checkEthylFreezing(temperature)){
            System.out.println("Ethyl will freeze at " + temperature);
        } 
        if(ieb.checkEthylBoiling(temperature)){
            System.out.println("Ethyl will boil at " + temperature);
        } 
        if(iob.checkOxygenBoiling(temperature)){
            System.out.println("Oxygen will boil at " + temperature);
        } 
        if(iof.checkOxygenFreezing(temperature)){
            System.out.println("Oxygen will freeze at " + temperature);
        } 
        if(iwb.checkWaterBoiling(temperature)){
            System.out.println("Water will boil at " + temperature);
        } 
        if(iwf.checkWaterFreezing(temperature)){
            System.out.println("Water will freeze at " + temperature);
        }

        input.close();
    }
}
