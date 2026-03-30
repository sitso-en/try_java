package OOPGrade;

public class Integration {

    public static void main(String[] args) {

        // 1. Load data
        Input input = new Input();

        // 2. Process
        Processing processing = new Processing(input);

        // 3. Display
        Output output = new Output(input, processing);
        output.printAll();
    }
}