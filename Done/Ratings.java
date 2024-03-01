package Kattis;

import java.util.Scanner;
//https://open.kattis.com/problems/ratingproblems
public class Ratings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfJudges = input.nextInt(), judgesRated = input.nextInt();
        int sum = 0;

        for (int i = 0; i < judgesRated; i++) {
            sum += input.nextInt();
        }
        double z = ((double) (sum + (numberOfJudges - judgesRated) * -3) /numberOfJudges);
        double b = ((double) (sum + (numberOfJudges - judgesRated) * 3) /numberOfJudges);
        System.out.println(z + " " + b);
    }
}