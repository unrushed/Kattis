package Kattis;
import java.util.Scanner;
public class FlipAndCompare {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String a = input.next(), b = input.next();
        char temp, temp2, temp3;

        temp = a.charAt(0);
        temp2 = a.charAt(1);
        temp3 = a.charAt(2);
        a = "" + temp3 + temp2 + temp;

        temp = b.charAt(0);
        temp2 = b.charAt(1);
        temp3 = b.charAt(2);
        b = "" + temp3 + temp2 + temp;

        if(Integer.parseInt(a)>Integer.parseInt(b)){
            System.out.print(a);
        }else{
            System.out.print(b);
        }
    }
}
