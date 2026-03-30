package OOPGrade;

public class Output {

    private Input      input;
    private Processing processing;

    public Output(Input input, Processing processing) {
        this.input      = input;
        this.processing = processing;
    }

    public void printGradeFrequencies() {
        System.out.println("\n===== GRADE FREQUENCIES =====");
        System.out.println("A: " + processing.getCountA());
        System.out.println("B: " + processing.getCountB());
        System.out.println("C: " + processing.getCountC());
        System.out.println("D: " + processing.getCountD());
        System.out.println("E: " + processing.getCountE());
        System.out.println("F: " + processing.getCountF());
    }

    public void printAverageScore() {
        System.out.println("\n===== AVERAGE SCORE =====");
        System.out.println("Average: " + processing.getAvgScore());
    }

    public void printMaxMin() {
        System.out.println("\n===== MAX AND MIN =====");
        System.out.println("Maximum: " + processing.getMaxScore());
        System.out.println("Minimum: " + processing.getMinScore());
    }

    public void printFinalScoresAndGrades() {
        System.out.println("\n===== FINAL SCORES AND GRADES =====");
        System.out.printf("%-15s %-15s %-5s%n", "Index No.", "Final Score", "Grade");
        System.out.println("------------------------------------------");

        int[]    indexNo      = input.getIndexNo();
        double[] finalScore   = processing.getFinalScore();
        String[] letterGrades = processing.getLetterGrades();

        for (int i = 0; i < indexNo.length; i++) {
            System.out.printf("%-15d %-15.2f %-5s%n",
                    indexNo[i], finalScore[i], letterGrades[i]);
        }
    }

    public void printAll() {
        printGradeFrequencies();
        printAverageScore();
        printMaxMin();
        printFinalScoresAndGrades();
    }
}