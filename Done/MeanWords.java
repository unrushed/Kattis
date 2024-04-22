package Done;

import java.util.Scanner;

public class MeanWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfWords = Integer.parseInt(input.nextLine());
        String[] arr = new String[numberOfWords];

        int largestSize = 0;
        for (int i = 0; i < numberOfWords; i++) {
            arr[i] = input.nextLine();
            if(arr[i].length() > largestSize) largestSize = arr[i].length();
        }
        int sum = 0;
        int numberOfWordsEffected = 0;

        for (int i = 0; i < largestSize; i++) { // each letter in the array
            sum = 0;
            numberOfWordsEffected = 0;
            for (int j = 0; j < arr.length; j++) { //each word in the array
                if(i >= arr[j].length()) continue;
                else{
                    numberOfWordsEffected++;
                    sum += arr[j].charAt(i);
                }
            }
            System.out.print((char) Math.floor((double) sum /numberOfWordsEffected));
        }
    }
}
