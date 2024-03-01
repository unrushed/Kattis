package Kattis;

import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfQuestions = input.nextInt();

        String in = input.next();
        int adrian = testAdrian(in);
        int bruno = testBruno(in);
        int goran = testGoran(in);
        int max = Math.max(Math.max(adrian, bruno), goran);
        System.out.println(max);
        if(max == adrian) System.out.println("Adrian");
        if(max == bruno) System.out.println("Bruno");
        if(max == goran) System.out.println("Goran");
    }
    public static int testAdrian(String input){
        char[] adrian = {'A','B','C'};
        int x = 0;
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == adrian[x]){
                count++;
            }
            x++;
            if(x == 3) {
                x = 0;
            }

        }
        return count;
    }
    public static int testBruno(String input){
        char[] bruno = {'B','A','B','C'};
        int x = 0;
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == bruno[x]){
                count++;
            }
            x++;
            if(x == 4) {
                x = 0;
            }

        }
        return count;
    }
    public static int testGoran(String input){
        char[] goran = {'C','C','A','A','B','B'};
        int x = 0;
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == goran[x]){
                count++;
            }
            x++;
            if(x == 6) {
                x = 0;
            }

        }
        return count;
    }
}
