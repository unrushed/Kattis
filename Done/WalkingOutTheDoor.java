package Done;

import java.util.Scanner;

public class WalkingOutTheDoor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfItems = input.nextInt();
        int sum = 0;
        boolean key = true, phone = true, wallet = true;

        for (int i = 0; i < numberOfItems; i++) {
            switch (input.next()){
                case "keys":
                    sum++;
                    key = false;
                    break;
                case "phone":
                    sum++;
                    phone = false;
                    break;
                case "wallet":
                    sum++;
                    wallet = false;
                    break;
                default:
                    break;
            }
        }
        if(sum == 3){
            System.out.println("ready");
        }else{
            if(key) System.out.println("keys");
            if(phone) System.out.println("phone");
            if(wallet) System.out.println("wallet");
        }
    }
}
