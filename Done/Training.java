package Done;

import java.util.Scanner;

public class Training {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfProblems = input.nextInt();
        int skillLevel = input.nextInt();

        for (int i = 0; i < numberOfProblems; i++) {
            int tempLow = input.nextInt();
            int tempHigh = input.nextInt();
            if(skillLevel >= tempLow && skillLevel <= tempHigh){
                skillLevel++;
            }
        }
        System.out.println(skillLevel);
    }
}
