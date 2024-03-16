import java.util.ArrayList;
import java.util.Scanner;

public class HappyPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numbersToFollow = input.nextInt();
        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

        for (int i = 0; i < numbersToFollow; i++) {

            int testCase = input.nextInt();
            int test = input.nextInt();

            boolean testAnswer = false;

            double x = Math.sqrt(test);
            int p = 0;
            while (prime[p] <= x) {
                if (test % prime[p] == 0) {
                    testAnswer = true;
                    break;
                }
                p++;
            }
            int sum = 0;
            int temp = test;
            if(testAnswer || test == 1){
                System.out.println(testCase + " " + test + " " + "NO");
            }else{
                while(true){
                    while(temp != 0){
                        sum += ((temp%10) * (temp%10));
                        temp /= 10;
                    }

                    if(sum == 1){
                        System.out.println(testCase + " " + test + " " + "YES");
                        break;
                    }else if(sum == 4){
                        System.out.println(testCase + " " + test + " " + "NO");
                        break;
                    }else{
                        temp = sum;
                        sum = 0;
                    }
                }
            }
        }
    }
}