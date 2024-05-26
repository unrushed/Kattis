package Done;

import java.util.Scanner;

public class Turtle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numberOfTestCases = Integer.parseInt(input.nextLine());

        for (int i = 0; i < numberOfTestCases; i++) {
            String[] temp = input.nextLine().split(" ");
            int sum = 0;
            for (int j = 1; j < temp.length; j++) {
                if(Integer.parseInt(temp[j - 1]) * 2 < Integer.parseInt(temp[j])){
                    sum += (Integer.parseInt(temp[j]) - (Integer.parseInt(temp[j - 1]) * 2));
                }
            }
            System.out.println(sum);
        }
    }
}
