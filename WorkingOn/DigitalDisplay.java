import java.io.*;
import java.util.Scanner;

public class DigitalDisplay {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        while(true){
            String in = io.getWord();
            if(in.equals("end")) break;
            String[][] clock = new String[7][29];

            for (int rows = 0; rows < 7; rows++){
                for (int k = 0; k < 29; k++) {

                    clock[rows][k] = " ";

                }
            }

            String[][] temp = new String[7][5];

            int p = 5;
            int start = 0;
            int startf = 0;
            for(int x = 0; x < 5; x++) {
                if(x == 2) {
                    temp = printColon();
                }else{
                    switch (in.charAt(x) - 48){
                        case 0:
                            temp = copyZero();
                            break;
                        case 1:
                            temp = copyOne();
                            break;
                        case 2:
                            temp = copyTwo();
                            break;
                        case 3:
                            temp = copyThree();
                            break;
                        case 4:
                            temp = copyFour();
                            break;
                        case 5:
                            temp = copyFive();
                            break;
                        case 6:
                            temp = copySix();
                            break;
                        case 7:
                            temp = copySeven();
                            break;
                        case 8:
                            temp = copyEight();
                            break;
                        case 9:
                            temp = copyNine();
                            break;
                    }
                }

                for (int row = 0; row < 7; row++){
                    int column = 0;
                    start = startf;
                    while(start < p){
                        clock[row][start] = temp[row][column];
                        column++;
                        start++;
                    }
                }
                p += 5;
                if(x == 0 || x == 3) {
                    p += 2;
                }
                start = p - 5;
                startf = start;
            }
            printTwoDi(clock);
        }
        io.println("end");
        io.close();
    }
    public static String[][] copyZero(){
        String[][] a = new String[7][5];
        a[0] = new String[]{"+", "-", "-", "-", "+"};
        a[1] = new String[]{"|", " ", " ", " ", "|"};
        a[2] = new String[]{"|", " ", " ", " ", "|"};
        a[3] = new String[]{"+", " ", " ", " ", "+"};
        a[4] = new String[]{"|", " ", " ", " ", "|"};
        a[5] = new String[]{"|", " ", " ", " ", "|"};
        a[6] = new String[]{"+", "-", "-", "-", "+"};
        return a;
    }
    public static String[][] copyOne(){
        String[][] a = new String[7][5];
        a[0] = new String[]{" ", " ", " ", " ", "+"};
        a[1] = new String[]{" ", " ", " ", " ", "|"};
        a[2] = new String[]{" ", " ", " ", " ", "|"};
        a[3] = new String[]{" ", " ", " ", " ", "+"};
        a[4] = new String[]{" ", " ", " ", " ", "|"};
        a[5] = new String[]{" ", " ", " ", " ", "|"};
        a[6] = new String[]{" ", " ", " ", " ", "+"};
        return a;
    }
    public static String[][] copyTwo(){
        String[][] a = new String[7][5];
        a[0] = new String[]{"+", "-", "-", "-", "+"};
        a[1] = new String[]{" ", " ", " ", " ", "|"};
        a[2] = new String[]{" ", " ", " ", " ", "|"};
        a[3] = new String[]{"+", "-", "-", "-", "+"};
        a[4] = new String[]{"|", " ", " ", " ", " "};
        a[5] = new String[]{"|", " ", " ", " ", " "};
        a[6] = new String[]{"+", "-", "-", "-", "+"};
        return a;
    }

    public static String[][] copyThree(){
        String[][] a = new String[7][5];
        a[0] = new String[]{"+", "-", "-", "-", "+"};
        a[1] = new String[]{" ", " ", " ", " ", "|"};
        a[2] = new String[]{" ", " ", " ", " ", "|"};
        a[3] = new String[]{"+", "-", "-", "-", "+"};
        a[4] = new String[]{" ", " ", " ", " ", "|"};
        a[5] = new String[]{" ", " ", " ", " ", "|"};
        a[6] = new String[]{"+", "-", "-", "-", "+"};
        return a;
    }

    public static String[][] copyFour(){
        String[][] a = new String[7][5];
        a[0] = new String[]{"+", " ", " ", " ", "+"};
        a[1] = new String[]{"|", " ", " ", " ", "|"};
        a[2] = new String[]{"|", " ", " ", " ", "|"};
        a[3] = new String[]{"+", "-", "-", "-", "+"};
        a[4] = new String[]{" ", " ", " ", " ", "|"};
        a[5] = new String[]{" ", " ", " ", " ", "|"};
        a[6] = new String[]{" ", " ", " ", " ", "+"};
        return a;
    }

    public static String[][] copyFive(){
        String[][] a = new String[7][5];
        a[0] = new String[]{"+", "-", "-", "-", "+"};
        a[1] = new String[]{"|", " ", " ", " ", " "};
        a[2] = new String[]{"|", " ", " ", " ", " "};
        a[3] = new String[]{"+", "-", "-", "-", "+"};
        a[4] = new String[]{" ", " ", " ", " ", "|"};
        a[5] = new String[]{" ", " ", " ", " ", "|"};
        a[6] = new String[]{"+", "-", "-", "-", "+"};
        return a;
    }

    public static String[][] copySix(){
        String[][] a = new String[7][5];
        a[0] = new String[]{"+", "-", "-", "-", "+"};
        a[1] = new String[]{"|", " ", " ", " ", " "};
        a[2] = new String[]{"|", " ", " ", " ", " "};
        a[3] = new String[]{"+", "-", "-", "-", "+"};
        a[4] = new String[]{"|", " ", " ", " ", "|"};
        a[5] = new String[]{"|", " ", " ", " ", "|"};
        a[6] = new String[]{"+", "-", "-", "-", "+"};
        return a;
    }

    public static String[][] copySeven(){
        String[][] a = new String[7][5];
        a[0] = new String[]{"+", "-", "-", "-", "+"};
        a[1] = new String[]{" ", " ", " ", " ", "|"};
        a[2] = new String[]{" ", " ", " ", " ", "|"};
        a[3] = new String[]{" ", " ", " ", " ", "+"};
        a[4] = new String[]{" ", " ", " ", " ", "|"};
        a[5] = new String[]{" ", " ", " ", " ", "|"};
        a[6] = new String[]{" ", " ", " ", " ", "+"};
        return a;
    }

    public static String[][] copyEight(){
        String[][] a = new String[7][5];
        a[0] = new String[]{"+", "-", "-", "-", "+"};
        a[1] = new String[]{"|", " ", " ", " ", "|"};
        a[2] = new String[]{"|", " ", " ", " ", "|"};
        a[3] = new String[]{"+", "-", "-", "-", "+"};
        a[4] = new String[]{"|", " ", " ", " ", "|"};
        a[5] = new String[]{"|", " ", " ", " ", "|"};
        a[6] = new String[]{"+", "-", "-", "-", "+"};
        return a;
    }

    public static String[][] copyNine(){
        String[][] a = new String[7][5];
        a[0] = new String[]{"+", "-", "-", "-", "+"};
        a[1] = new String[]{"|", " ", " ", " ", "|"};
        a[2] = new String[]{"|", " ", " ", " ", "|"};
        a[3] = new String[]{"+", "-", "-", "-", "+"};
        a[4] = new String[]{" ", " ", " ", " ", "|"};
        a[5] = new String[]{" ", " ", " ", " ", "|"};
        a[6] = new String[]{"+", "-", "-", "-", "+"};
        return a;
    }

    public static String[][] printColon(){
        String[][] a = new String[7][5];
        a[0] = new String[]{" ", " ", " ", " ", " "};
        a[1] = new String[]{" ", " ", " ", " ", " "};
        a[2] = new String[]{" ", " ", "o", " ", " "};
        a[3] = new String[]{" ", " ", " ", " ", " "};
        a[4] = new String[]{" ", " ", "o", " ", " "};
        a[5] = new String[]{" ", " ", " ", " ", " "};
        a[6] = new String[]{" ", " ", " ", " ", " "};
        return a;
    }
    public static void printTwoDi(String[][] copiedArr) { //prints 2d array
        for(int i = 0; i < copiedArr.length; i++) {
            String[] tempArr = copiedArr[i];
            for (int y = 0; y < tempArr.length; y++) {
                System.out.print(tempArr[y]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}