package Done;

import java.util.Scanner;

public class CupsGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String in = input.nextLine();
        boolean first = true, second = false, third = false;
        for (int i = 0; i < in.length(); i++) {
            switch (in.charAt(i)){
                case 'A':
                    if(!third) {
                        first = opposite(first);
                        second = opposite(second);
                    }
                    break;
                case 'B':
                    if(!first) {
                        second = opposite(second);
                        third = opposite(third);
                    }
                    break;
                case 'C':
                    if(!second) {
                        first = opposite(first);
                        third = opposite(third);
                    }
                    break;
            }
        }
        if(first) System.out.println("1");
        else if (second) System.out.println("2");
        else if (third) System.out.println("3");
    }
    public static boolean opposite(boolean a){
        if(a) return false;
        else return true;
    }
}
