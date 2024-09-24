package Done;

import java.util.Scanner;

public class Zamka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int l = input.nextInt();
        int d = input.nextInt();
        int x = input.nextInt();

        for (int i = l; i <= d; i++) {
            String temp = i + "";
            int sum = 0;
            for (int j = 0; j < temp.length(); j++) {
                sum += Integer.parseInt(temp.charAt(j) + "");
            }
            if(sum == x) {
                System.out.println(i);
                break;
            }
        }

        for (int i = d; i >= l; i--) {
            String temp = i + "";
            int sum = 0;
            for (int j = 0; j < temp.length(); j++) {
                sum += Integer.parseInt(temp.charAt(j) + "");
            }
            if(sum == x) {
                System.out.println(i);
                break;
            }
        }

    }
}
