package Done;

import java.util.Scanner;

public class PangramDetector {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(input.nextLine());

        for (int i = 0; i < numberOfLines; i++) {
            String temp = input.nextLine().toLowerCase();
            boolean[] array = new boolean[26];
            for (int j = 0; j < temp.length(); j++) {
                if(temp.charAt(j) - 97 < 0) continue;
                else {
                    array[(int)temp.charAt(j) - 97] = true;
                }
            }
            int sum = 0;
            String answer = "";
            for (int j = 0; j < array.length; j++) {
                if(!array[j]) {
                    sum++;
                    answer += (char) (j + 97);
                }
            }
            if(sum == 0){
                System.out.println("pangram");
            }else{
                System.out.println("missing " + answer);
            }
        } // 97 - 122
    }
}
