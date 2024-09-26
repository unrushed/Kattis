import java.util.Scanner;

public class SuperBowlScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // Number of test cases

        for (int i = 0; i < n; i++) {
            int sum = input.nextInt();
            int diff = input.nextInt();

            int score1 = (sum + diff) / 2; // Calculate first score
            int score2 = sum - score1; // Calculate second score

            if ((sum + diff) % 2 == 0 && score1 >= 0 && score2 >= 0) {
                System.out.println(Math.max(score1, score2) + " " + Math.min(score1, score2));
            } else {
                System.out.println("impossible");
            }
        }
    }
}
