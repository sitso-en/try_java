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
        System.out.println("Q1: " + product);

        int trailJ = 1;
        int trailK = 1;
        for(int i=0; i<k.length; i++){
            trailJ *= j[i][j.length - 1 - i];
            trailK *= k[i][k.length - 1 - i];
        }
        System.out.println("Q2: " + (trailJ - trailK));

        for(int i=0; i<k.length; i++){
            for(int m=0; m<k[i].length; m++){
                int temp = k[i][m];
                k[i][m] = j[i][m];
                j[i][m] = temp;
            }
        }
        System.out.println("Q3: K and J swapped");
        System.out.print("K: ");
        for(int i=0; i<k.length; i++){
            for(int m=0; m<k[i].length; m++){
                System.out.print(k[i][m] + " ");
            }
            System.out.print("| ");
        }
        System.out.println();

        System.out.print("J: ");
        for(int i=0; i<j.length; i++){
            for(int m=0; m<j[i].length; m++){
                System.out.print(j[i][m] + " ");
            }
            System.out.print("| ");
        }
        System.out.println();

        for(int i=0; i<k.length; i++){
            for(int m=0; m<k[i].length; m++){
                int temp = k[i][m];
                k[i][m] = j[i][m];
                j[i][m] = temp;
            }
        }

        int leadK = 1;
        int trailK2 = 1;
        for(int i=0; i<k.length; i++){
            leadK *= k[i][i];
            trailK2 *= k[i][k.length - 1 - i];
        }
        System.out.println("Q4: " + (leadK - trailK2));

        double sumK = 0, sumJ = 0;
        int count = 0;
        for(int i=0; i<k.length; i++){
            for(int m=0; m<k[i].length; m++){
                sumK += k[i][m];
                sumJ += j[i][m];
                count++;
            }
        }
        
        double avgK = sumK / count;
        double avgJ = sumJ / count;
        double mean = (avgK + avgJ) / 2;
        System.out.println("Q5: " + mean);
    }
}
