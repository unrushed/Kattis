package Done;

import java.util.Scanner;

public class Differences2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String in1 = input.nextLine();
        String in2 = input.nextLine();

        System.out.println(countDifferences(in1, in2) + 1);
    }
    public static int countDifferences(String in1, String in2){
        int sum = 0;
        for (int i = 0; i < in1.length(); i++) {
            if(in1.charAt(i) != in2.charAt(i)) sum++;
        }
        return sum;
    }
}
