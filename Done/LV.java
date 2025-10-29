package Done;

import java.util.Scanner;

public class LV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int in2 = input.nextInt(); input.nextLine();
        String in = input.nextLine();
        if(in.contains("lv")) System.out.println("0");
        else if(in.contains("l") || in.contains("v")) System.out.println("1");
        else System.out.println("2");
    }
}
