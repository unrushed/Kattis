package Kattis;
import java.util.Scanner;
public class DamagedEquations {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt(), d = input.nextInt();

        boolean test = true;
        boolean breaks = false;

        int[] answers = new int[8];
        String[] equations = new String[8];
        equations[0] = a + " * " + b;
        equations[1] = a + " + " + b;

        equations[2] = a + " - " + b;
        equations[3] = a + " / " + b;

        equations[4] = c + " * " + d;
        equations[5] = c + " + " + d;

        equations[6] = c + " - " + d;
        equations[7] = c + " / " + d;
        
        answers[0] = a * b;
        answers[1] = a + b;

        answers[2] = a - b;
        if(b != 0)
            answers[3] = a / b;

        answers[4] = c * d;
        answers[5] = c + d;

        answers[6] = c - d;
        if(d != 0)
            answers[7] = c / d;

        for(int x = 0; x < 4; x++){
            for(int y = 4; y < 8; y++){
                if(answers[x] == answers[y] && x != y && !(x == 7 && d == 0) && !(x == 3 && b == 0) && !(y == 7 && d == 0) && !(y == 3 && b == 0)){
                    System.out.println(equations[x] + " = " + equations[y]);
                    test = false;
                }
            }
        }
        if(test) System.out.print("problems ahead");
    }
}
