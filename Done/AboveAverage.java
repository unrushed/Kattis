package Kattis;
import java.util.Scanner;
public class AboveAverage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numberOfCases = input.nextInt();

        for(int x = 0; x < numberOfCases; x++){
            int numberOfScores = input.nextInt();
            int sumTemp = 0;
            int[] numbersArr = new int[numberOfScores];
            for(int y = 0; y < numberOfScores; y++){
                int scoreTemp = input.nextInt();
                sumTemp += scoreTemp;
                //System.out.println(sumTemp);
                numbersArr[y] = scoreTemp;
            }
            int answer = getNumberAboveAverage(numberOfScores, numbersArr, sumTemp);
            System.out.printf("%.3f", 100*(double)answer/numberOfScores);
            System.out.println("%");
        }
    }

    public static int getNumberAboveAverage(int numberOfScores, int[] numbersArr, int sumTemp){
        int average = getAverage(numberOfScores, sumTemp);
        int count = 0;
        for(int z = 0; z < numberOfScores; z++){
            if(numbersArr[z] > average){
                count++;
            }
        }
        return count;
    }

    public static int getAverage(int numberOfScores, int sumTemp){
        return (sumTemp/numberOfScores);
    }
}
