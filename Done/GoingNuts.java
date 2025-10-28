package Done;

import java.util.Scanner;

public class GoingNuts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        String binaryString = Integer.toBinaryString(num);

        int count = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if(binaryString.charAt(i) == '1') count++;
        }
        System.out.println(count);
    }
}
