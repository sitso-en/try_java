package OOPGrade;

public class Input {

    private int[] indexNo = {
        10021007, 10021107, 10021207, 10021307, 10021407, 10021507, 10021607, 10021707,
        10021807, 10021907, 10022007, 10022107, 10022207, 10022307, 10022407
    };

    private double[] midSem = {
        65, 48, 22, 32, 80, 12, 45, 25, 33, 67, 23, 45, 56, 34, 81
    };

    private double[] exams = {
        78, 54, 90, 32, 66, 60, 48, 65, 45, 56, 33, 45, 67, 90, 67
    };

    public int[] getIndexNo()    { return indexNo; }
    public double[] getMidSem()  { return midSem;  }
    public double[] getExams()   { return exams;   }

}