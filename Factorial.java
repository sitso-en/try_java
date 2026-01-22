public class Factorial{
    public static void main(String[] args){
        int roundedStd =(int) Math.round(standardDeviation());
        int result = factorial(roundedStd);
        System.out.println("Factorial: " + result);
    }

    public static double average(){
        int sum =0;
        for (int i=1; i <=10; i++){
            sum+=i;
        }
        double average = sum /10;
        return average;
    }

    public static double sumofSquaredDifferences(){
        double average = average();

        double squaredDiff =0;

        for(int n=1; n<=10;n++){
            squaredDiff+= Math.pow((n-average), 2);
        }
        return squaredDiff;
    }

    public static double standardDeviation(){
        double variance = sumofSquaredDifferences() / 10;
        double std= Math.sqrt(variance);

        return std;
    }

    