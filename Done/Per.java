package Done;

import java.util.Scanner;

public class Per {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] arr = {'P','E','R'};

        String a = input.nextLine();
        int arrCount = 0;
        int count = 0;
        for (int i = 0; i < a.length(); i++, arrCount++) {
            if(arrCount == 3) arrCount = 0;
            if(a.charAt(i) != arr[arrCount]) count++;
        }
        System.out.println(count);
    }
}
