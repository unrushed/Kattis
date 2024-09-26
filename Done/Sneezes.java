package Done;

import java.util.Scanner;

public class Sneezes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long x = input.nextLong(), numberOfSlimes = input.nextLong();
        int answer = 0;
        int timeProgression = 0;
        while(x > timeProgression){
            if(numberOfSlimes == 1) {
                break;
            }
            if(numberOfSlimes%2 != 0){
                answer++;
                numberOfSlimes--;
            }else {
                numberOfSlimes = numberOfSlimes / 2;
            }
            timeProgression++;
        }

        answer += numberOfSlimes;
        System.out.println(answer);

    }
}
