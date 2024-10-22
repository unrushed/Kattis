package Done;

import java.util.Scanner;

public class Terrance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalNumberAllowed = Integer.parseInt(input.next());
        int events = Integer.parseInt(input.next());
        int counter = 0;
        int rejectedCounter = 0;

        for (int i = 0; i < events; i++) {
            String a = input.next();
            int number = Integer.parseInt(input.next());
            if(a.equals("enter")){
                if (counter + number > totalNumberAllowed) rejectedCounter++;
                else counter += number;
            }else{
                counter -= number;
            }
        }
        System.out.println(rejectedCounter);
    }
}
