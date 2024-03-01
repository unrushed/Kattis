package Kattis;

import java.util.Scanner;
public class Price {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String i = input.next();
        int x = Integer.parseInt(i);
        String z = "";
        if(i.length() > 2)
             z = i.substring(i.length()-2);
        if(x <= 148) {
            System.out.println("99");
        }else if(z.equals("49")) {
            System.out.println((((int) Integer.parseInt(i) / 100) * 100) + 99);
        }else if(Integer.parseInt(z) > 49){
            System.out.println((((int) Integer.parseInt(i) / 100) * 100) + 99);
        }else{
            System.out.println(((((int) Integer.parseInt(i) / 100) - 1) * 100) + 99);
        }
    }
}
