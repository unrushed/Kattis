package Kattis;
import java.util.Scanner;
public class autori {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String fullname, initials = "";
        char temp;
        int grab = 0;
        fullname = input.next().toUpperCase();
        do{
            temp = fullname.charAt(grab);
            initials = initials + String.valueOf(temp);
            grab = fullname.indexOf('-', grab) + 1;
        }while(grab > 0);
        System.out.print(initials);
    }
}
