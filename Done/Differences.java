package Kattis;
import java.util.Scanner;
public class Differences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testCases = input.nextInt();
        int z = 0;
        while(z < testCases){
            String lineOne = input.next();
            String lineTwo = input.next();
            String[] lineTwoArr = lineTwo.split("");
            String[] lineOneArr = lineOne.split("");
            String out = "";
            for (int i = 0; i < lineOneArr.length; i++) {
                if(lineOneArr[i].equals(lineTwoArr[i])) out += ".";
                else out += "*";
            }
            System.out.println(lineOne);
            System.out.println(lineTwo);
            System.out.println(out);
            System.out.println();
            z++;
        }
    }
}
