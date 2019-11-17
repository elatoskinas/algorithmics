public class TimeAnalysis {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        // <Algorithm>

        long elapsedTimeNs = System.nanoTime() - startTime;

        // Convert to seconds
        double nanoMultiplier = 1e-9;
        double elapsedTime = elapsedTimeNs * nanoMultiplier;

        System.out.println(elapsedTime + "s");
    }
}
