package Kattis;
import java.util.Scanner;
public class NewLanguage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String line = input.nextLine().toLowerCase();

        String out = "";

        for(int x = 0; x < line.length(); x++){
            if(line.charAt(x) == ' '){
                out += ' ';
            }else{
                out += getletter(line, x);
            }
        }
        System.out.print(out);
    }
    public static String getletter(String line, int x){
        switch (line.charAt(x)) {
            case 'a':
                return "@";
            case 'b':
                return "8";
            case 'c':
                return "(";
            case 'd':
                return "|)";
            case 'e':
                return "3";
            case 'f':
                return "#";
            case 'g':
                return "6";
            case 'h':
                return "[-]";
            case 'i':
                return "|";
            case 'j':
                return "_|";
            case 'k':
                return "|<";
            case 'l':
                return "1";
            case 'm':
                return "[]\\/[]";
            case 'n':
                return "[]\\[]";
            case 'o':
                return "0";
            case 'p':
                return "|D";
            case 'q':
                return "(,)";
            case 'r':
                return "|z";
            case 's':
                return "$";
            case 't':
                return "']['";
            case 'u':
                return "|_|";
            case 'v':
                return "\\/";
            case 'w':
                return "\\/\\/";
            case 'x':
                return "}{";
            case 'y':
                return "`/";
            case 'z':
                return "2";
            default:
                return line.charAt(x) + "";
        }
    }
}
