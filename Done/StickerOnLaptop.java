package Kattis;
import java.util.Scanner;
public class StickerOnLaptop {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       int wc = input.nextInt(), hc = input.nextInt(), ws = input.nextInt(), hs = input.nextInt();

       if(wc - 2 < ws || hc - 2 < hs){
            System.out.print("0");
       }else{
            System.out.print("1");
       }
    }
}
