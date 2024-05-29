package Done;

import java.util.Scanner;

public class CountingTeacher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean test = true;
        int numberOfNumbers = input.nextInt();
        int x = 1;
        for (int i = 0; i < numberOfNumbers; i++) {
            int temp = input.nextInt();
            if(x != temp){
                while(x < temp) {
                    System.out.println(x);
                    test = false;
                    x++;
                }
            }
            x++;
        }
        if(test) System.out.println("good job");
    }
}
