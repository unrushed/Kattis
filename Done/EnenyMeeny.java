package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class EnenyMeeny {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String in = input.nextLine();
        String[] u = in.split(" ");
        int numberOfTurns = u.length;

        int numberOfPeople = Integer.parseInt(input.nextLine());
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> teamOne = new ArrayList<>();
        ArrayList<String> teamTwo = new ArrayList<>();

        for (int i = 0; i < numberOfPeople; i++) {
            list.add(input.nextLine());
        }

        int y = 0; // index
        boolean test = true; // true = team One
        while(!list.isEmpty()){

            if(y == list.size()) y = 0;
            for (int i = 0; i < numberOfTurns - 1; i++) { // how many people around
                y++;
                if(y == list.size()) y = 0;
            }

            if(test){
                test = false;
                teamOne.add(list.get(y));
                list.remove(y);

            }else{
                teamTwo.add(list.get(y));
                test = true;
                list.remove(y);
            }
        }
        System.out.println(teamOne.size());
        for (int i = 0; i <teamOne.size(); i++) {
            System.out.println(teamOne.get(i));
        }

        System.out.println(teamTwo.size());
        for (int i = 0; i < teamTwo.size(); i++ ){
            System.out.println(teamTwo.get(i));
        }

    }
}
