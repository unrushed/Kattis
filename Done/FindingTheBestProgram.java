package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class FindingTheBestProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfProblems = input.nextInt();

        int numberOfTeams = input.nextInt();
        int[] arr = new int[numberOfProblems];

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < numberOfProblems; i++) {
            list.add(input.next());
        }
        for (int i = 0; i < numberOfTeams; i++) {
            for (int j = 0; j < numberOfProblems; j++) {
                arr[j] += input.nextInt();
            }
        }
        System.out.println(list.get(findTheLargest(arr)));
    }
    public static int findTheLargest(int[] arr){
        int num = -1;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > num){
                num = arr[i];
                index = i;
            }
        }
        return index;
    }
}
