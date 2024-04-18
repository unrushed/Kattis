package Done;

import java.util.Scanner;

public class Moose {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int l = input.nextInt();
        int r = input.nextInt();
        if(l == 0 && r == 0){
            System.out.println("Not a moose");
        } else if(l == r){
            System.out.println("Even " + (2*l));
        }else{
            if(l>r) System.out.println("Odd " + 2*l);
            else System.out.println("Odd " + 2*r);
        }
    }
}
