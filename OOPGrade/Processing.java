package OOPGrade;

public class Processing {

    private double[] calculatedMidSem;
    private double[] calculatedExam;
    private double[] finalScore;
    private String[] letterGrades;

    private int countA = 0, countB = 0, countC = 0, countD = 0, countE = 0, countF = 0;
    private double totalScore = 0;
    private double maxScore = 0;
    private double minScore = 100;

    public Processing(Input input) {
        int length = input.getIndexNo().length;

        calculatedMidSem = new double[length];
        calculatedExam   = new double[length];
        finalScore       = new double[length];
        letterGrades     = new String[length];

        double[] midSem = input.getMidSem();
        double[] exams  = input.getExams();

        for (int i = 0; i < length; i++) {

            // Convert raw scores to weighted scores
            calculatedMidSem[i] = (midSem[i] / 100.0) * 30.0;
            calculatedExam[i]   = (exams[i]  / 100.0) * 70.0;
            finalScore[i]       = calculatedMidSem[i] + calculatedExam[i];

            totalScore += finalScore[i];

            // Assign letter grade
            if (finalScore[i] >= 70) {
                letterGrades[i] = "A"; countA++;
            } else if (finalScore[i] >= 65) {
                letterGrades[i] = "B"; countB++;
            } else if (finalScore[i] >= 60) {
                letterGrades[i] = "C"; countC++;
            } else if (finalScore[i] >= 50) {
                letterGrades[i] = "D"; countD++;
            } else if (finalScore[i] >= 40) {
                letterGrades[i] = "E"; countE++;
            } else {
                letterGrades[i] = "F"; countF++;
            }

            // Track max and min
            if (finalScore[i] > maxScore) maxScore = finalScore[i];
            if (finalScore[i] < minScore) minScore = finalScore[i];
        }
    }

    public double getAvgScore() { return totalScore / finalScore.length; }

    public double[] getCalculatedMidSem() { return calculatedMidSem; }
    public double[] getCalculatedExam()   { return calculatedExam;   }
    public double[] getFinalScore()       { return finalScore;       }
    public String[] getLetterGrades()     { return letterGrades;     }
    public int getCountA()  { return countA; }
    public int getCountB()  { return countB; }
    public int getCountC()  { return countC; }
    public int getCountD()  { return countD; }
    public int getCountE()  { return countE; }
    public int getCountF()  { return countF; }
    public double getMaxScore() { return maxScore; }
    public double getMinScore() { return minScore; }
}