package tutorials;

public class Tough {
    public static void main(String[] args){
        int[] shopA = {42, 48, 50, 52, 58, 60, 46, 49, 58, 50, 51, 61};
        int[] shopB = {57, 63, 60, 70, 67, 73, 67, 65, 62, 72, 69, 75};

        int[] monthlyCombined = new int[shopA.length];
        for(int i=0; i<monthlyCombined.length; i++){
            monthlyCombined[i] = shopA[i] + shopB[i];
        }
    }
}
