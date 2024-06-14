package Done;

import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            int numberOfIntervals = input.nextInt();
            if(numberOfIntervals == -1) break;
            int previous = 0;
            int answer = 0;
            for (int i = 0; i < numberOfIntervals; i++) {
                int mph = input.nextInt();
                int time = input.nextInt();
                answer += (mph * (time - previous));
                previous = time;
            }
            System.out.println(answer + " miles");
        }
    }
}
