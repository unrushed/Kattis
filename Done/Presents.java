package Done;

import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfPeople = in.nextInt();
        int numberOfPresents = 0;
        String people = "";

        for (int i = 0; i < numberOfPeople; i++) {
            String temp = in.next();
            int tempN = in.nextInt();
            if(tempN > numberOfPresents){
                numberOfPresents = tempN;
                people = temp;
            }
        }
        System.out.println(people);
    }
}
