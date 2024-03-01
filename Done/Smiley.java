package Kattis;
import java.util.Scanner;
public class Smiley {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        if(str.indexOf(":)") != -1 && str.indexOf(":(") == -1){
            System.out.print("alive");
        }else if(str.indexOf(":)") == -1 && str.indexOf(":(") != -1){
            System.out.print("undead");
        }
        else if(str.indexOf(":)") != -1 && str.indexOf(":(") != -1){
            System.out.print("double agent");
        }
        else if(str.indexOf(":)") == -1 && str.indexOf(":(") == -1){
            System.out.print("machine");
        }
    }
}
