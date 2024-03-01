package Kattis;

import java.util.Scanner;

public class PasswordFun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String password = input.next();
        String find = input.nextLine();
        String[] a = password.split("");
        int x = 0;
        boolean p = false;
        for (int i = 0; i < find.length(); i++) {
            if(find.charAt(i) == password.charAt(x)){
                x++;
            }else{
                for (int j = x; j < password.length(); j++) {
                   if(find.charAt(i) == password.charAt(j)){
                       System.out.println("FAIL");
                       p = true;
                       break;
                   }
                }
            }
            if((p)) break;
            if(x == password.length()) break;
        }
        if(x != password.length() && !p){
            System.out.println("FAIL");
        }else if(!p){
            System.out.println("PASS");
        }
    }
}
