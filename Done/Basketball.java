package Done;

import java.util.Scanner;

public class Basketball {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String in = input.nextLine();
        int a = 0;
        int b = 0;
        boolean test = true;
        for (int i = 0; i < in.length(); i += 2) {
            if(in.charAt(i) == 'A') a += Integer.parseInt(in.charAt(i + 1) + "");
            else b += Integer.parseInt(in.charAt(i + 1) + "");

            if(a == 10 && 10 == b){
                test = false;
            }else if(test && (a == 11 || b == 11)){
                if(a == 11) System.out.println("A");
                else System.out.println("B");
                break;
            }else if(a > 11 || b > 11 && (a ==  2 + b || b == a + 2)){
                if(a > b) System.out.println("A");
                else System.out.println("B");
                break;
            }
        }
    }
}
