package Kattis;
import java.util.Scanner;
public class IsItHalloween {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String test = input.nextLine();

        if(test.equals("OCT 31")){
            System.out.print("yup");
        }else if(test.equals("DEC 25")){
            System.out.print("yup");
        }else{
            System.out.print("nope");
        }
    }
}