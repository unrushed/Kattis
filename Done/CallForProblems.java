package Done;

import java.util.Scanner;

public class CallForProblems {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int answer = 0;
        for (int i = 0; i < number; i++) {
            if(input.nextInt()%2 != 0) answer++;
        }
        System.out.println(answer);
    }
}
