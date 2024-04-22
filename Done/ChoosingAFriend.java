package Done;

import java.util.Scanner;

public class ChoosingAFriend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfFriends = Integer.parseInt(input.next());

        String[] friends = new String[numberOfFriends];

        for (int i = 0; i < numberOfFriends; i++) {
            friends[i] = input.next();
        }
        int start = 1;
        int index = 0;
        while(true){
            if(index == numberOfFriends) index = 0;
            if(start == 13){
                System.out.println(friends[index]);
                break;
            }
            start++;
            index++;
        }
    }
}
