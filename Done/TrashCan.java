package Done;

import java.util.Scanner;

public class TrashCan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nameOfCity = input.nextLine();
        double percentage = input.nextDouble();
        int n = input.nextInt();
        input.nextLine();
        int numOfNonPlastic = 0;
        int total = 0;
        for (int i = 0; i < n; i++) {
            if(input.nextLine().equals("ekki plast")){
                numOfNonPlastic++;
                total++;
            }
            else total++;
        }
        if((double) numOfNonPlastic/total > percentage) System.out.println("Neibb");
        else System.out.println("Jebb");
    }
}
