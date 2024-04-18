package Done;

import java.util.Scanner;

public class MouthFull {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean test = false;
        int numberOfBites = input.nextInt();
        String temp = "";
        for (int i = 1; i < numberOfBites + 1; i++) {
            temp = input.next().trim();
            //System.out.println("!" + temp + "!");
            if(!(temp.equals("mumble") || Integer.parseInt(temp) == i )){
                test = true;
                break;
            }
        }
        if(test) System.out.println("something is fishy");
        else System.out.println("makes sense");
    }
}
