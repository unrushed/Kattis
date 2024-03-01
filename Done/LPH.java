package Done;
import java.util.Arrays;
import java.util.Scanner;

public class LPH {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfProblems = input.nextInt();
        int linesPerEvent = input.nextInt() * 5;

        int[] arr = new int[numberOfProblems];

        for (int i = 0; i < numberOfProblems; i++) {
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < numberOfProblems; i++) {
            

            sum += arr[i];
            if(sum > linesPerEvent) break;
            else count++;
        }

        System.out.println(count);
    }
}
