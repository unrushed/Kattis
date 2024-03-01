package Kattis;
import java.util.Scanner;
public class MumbleRap2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numberOfCharacters = input.nextInt();
        String str = input.next();
        char[] numbersFound = new char[numberOfCharacters];
        String test = "";
        int max = 0;

        numbersFound = str.toCharArray();
        clean(numbersFound, numberOfCharacters);

        for(int y = 0; y < numberOfCharacters; y++){
            if(numbersFound[y] != 'a'){
                test = findWholeNumber(numbersFound, y);
                y = y + test.length();
                max = testLargness(test, max);
            }
        }

        System.out.print(max);
    }


    public static char[] clean(char[] numbersFound, int numberOfCharacters){
        for(int x = 0; x < numberOfCharacters; x++){
            if(numbersFound[x] - 48 >= 0 && numbersFound[x] - 48 < 10){
            }else {
                numbersFound[x] = 'a';
            }
        }
        return numbersFound;
    }

    public static int testLargness(String test, int max){
        int parsedTest = Integer.parseInt(test);
        if (parsedTest > max) {
            return parsedTest;
        }
        return max;
    }

    public static String findWholeNumber(char[] numbersFound, int y){
        String testCase = "";
        while(y < numbersFound.length && numbersFound[y] != 'a'){
            testCase = testCase + numbersFound[y];
            y++;
        }
        return testCase;
    }
}