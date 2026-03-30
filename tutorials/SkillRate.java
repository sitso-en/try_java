package tutorials;

public class SkillRate {
    public static void main(String[] args){
        int[] ratings = {
            2, 3, 4, 3, 5, 3, 4, 5, 2, 2, 3, 3, 4, 5, 1, 2, 4, 1, 2, 5 
        };
        int[] frequency = new int[5];

        for(int rate: ratings){
            frequency[rate]++;
        }

        System.out.println("Rating Scale\tFrequency");
        for(int i=5; i>=1; i++){
            System.out.println(i + "\t\t"+ frequency[i]);
        }
    }
}
