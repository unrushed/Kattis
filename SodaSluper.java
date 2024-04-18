import java.util.Scanner;

public class SodaSluper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfEmptyBottles = input.nextInt();
        int numberOfBottlesFound = input.nextInt();
        int cost = input.nextInt();

        int combined = numberOfBottlesFound + numberOfEmptyBottles;
        int firstout = 0;
        int output;

        while(combined >= cost){
            output = combined/cost;
            firstout += output;
            combined = (combined%cost);
            combined += output;

            //System.out.println(combined);
        }
        System.out.println(firstout);
    }
}
