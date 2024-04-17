package Done;

import java.util.Scanner;

public class BigParty {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String age = in.nextLine();

        if(age.charAt(age.length() - 1) == '0'){
            System.out.println("Jebb");
        }else{
            System.out.println("Neibb");
        }
    }
}
