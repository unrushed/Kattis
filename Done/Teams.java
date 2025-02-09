package Done;

import java.math.BigInteger;
import java.util.Scanner;

public class Teams {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger num = new BigInteger(input.nextLine());
        if(num.mod(BigInteger.valueOf(3)).compareTo(BigInteger.valueOf(0)) == 0){
            System.out.println("Jebb");
        }else{
            System.out.println("Neibb");
        }
    }
}
