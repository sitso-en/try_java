package tutorials;

public class Matrices {
    public static void main(String[] args){
        int[][] k = {{2, 3, 4},
                     {5, 6, 7}, 
                     {8, 9, 1}};

        int[][] j = {{3, 4, 5},
                     {7, 8, 9},
                     {3, 1, 3}};

        int product = 1;

        for(int i=0; i<k.length; i++){
                product *= k[i][i] * j[i][i];
            }
        System.out.println(product);
    }
}
