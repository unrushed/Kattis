package Done;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfQuestions = Integer.parseInt(input.next());
        String temp1 = input.next();
        int answer = 0;
        for (int i = 0; i < numberOfQuestions -1; i++) {
            String temp2 = input.next();

            if(temp1.equals(temp2)){
                answer++;
            }
            temp1 = temp2;
        }
        System.out.println(answer);
    }
}
