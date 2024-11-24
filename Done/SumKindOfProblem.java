package Done;

public class SumKindOfProblem {
    public static void main(String[] args) {
        Kattio input = new Kattio(System.in, System.out);

        int numberOfTestCases = input.getInt();

        for (int i = 0; i < numberOfTestCases; i++) {
            int testCase = input.getInt();
            int n = input.getInt();
            int sumOdd = 0;
            int sumPos = (n*(n+1))/2;;
            int sumEven = 0;

            for (int j = 1, countOdd = 1; j < n + 1; j++, countOdd += 2) {
                sumOdd += countOdd;
            }
            for (int j = 1, countEven = 2; j < n + 1; j++, countEven += 2) {
                sumEven += countEven;
            }
            input.println(testCase + " " + sumPos + " " + sumOdd + " " + sumEven);
        }
        input.close();
    }
}
