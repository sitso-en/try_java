package tutorials;

public class Grade {
    public static void main(String[] args){

       int[] indexNo = {
        10021007, 10021107, 10021207, 10021307, 10021407, 10021507, 10021607, 10021707,
        10021807, 10021907, 10022007, 10022107, 10022207, 10022307, 10022407
       };

       double[] midSem = {
        65, 48, 22, 32, 80, 12, 45, 25, 33, 67, 23, 45, 56, 34, 81
       };

       double[] exams = {
        78, 54, 90, 32, 66, 60, 48, 65, 45, 56, 33, 45, 67, 90, 67
       };

       double[] calculatedMidSem = new double[indexNo.length];
       double[] calculatedExam = new double[indexNo.length];
       double[] finalScore = new double[indexNo.length];
       String[] letterGrades = new String[indexNo.length];

       double totalScore = 0;

       int countA = 0, countB = 0, countC = 0, countD = 0, countE = 0, countF = 0;

       double maxScore = 0;
       double minScore = 100;

       for(int i = 0; i < indexNo.length; i++){
        calculatedMidSem[i] = (midSem[i] / 100.0) * 30.0;
        calculatedExam[i] = (exams[i] / 100.0) * 70.0;

        finalScore[i] = calculatedMidSem[i] + calculatedExam[i];

        totalScore += finalScore[i];

        if(finalScore[i] >= 70){
            letterGrades[i] = "A";
            countA++;
        } else if(finalScore[i] >= 65){
            letterGrades[i] = "B";
            countB++;
        } else if(finalScore[i] >= 60){
            letterGrades[i] = "C";
            countC++;
        } else if(finalScore[i] >= 50){
            letterGrades[i] = "D";
            countD++;
        } else if(finalScore[i] >= 40){
            letterGrades[i] = "E";
            countE++;
        } else {
            letterGrades[i] = "F";
            countF++;
        }

        if(finalScore[i] > maxScore){
            maxScore = finalScore[i];
        }
        if(finalScore[i] < minScore){
            minScore = finalScore[i];
        }
       }


       System.out.println("\n===== GRADE FREQUENCIES =====");
       System.out.println("A: " + countA);
       System.out.println("B: " + countB);
       System.out.println("C: " + countC);
       System.out.println("D: " + countD);
       System.out.println("E: " + countE);
       System.out.println("F: " + countF);

       double avgScore = totalScore / indexNo.length;
       System.out.println("\n===== AVERAGE SCORE =====");
       System.out.println("Average: " + avgScore);

       System.out.println("\n===== MAX AND MIN =====");
       System.out.println("Maximum: " + maxScore);
       System.out.println("Minimum: " + minScore);

       System.out.println("\n===== FINAL SCORES AND GRADES =====");
       System.out.printf("%-15s %-15s %-5s%n", "Index No.", "Final Score", "Grade");
       System.out.println("------------------------------------------");
       for(int i = 0; i < indexNo.length; i++){
        System.out.printf("%-15d %-15.2f %-5s%n", indexNo[i], finalScore[i], letterGrades[i]);
       }
    }
}
