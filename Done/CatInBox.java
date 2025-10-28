package Done;

import java.util.Scanner;

public class CatInBox {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int volume = input.nextInt() * input.nextInt() * input.nextInt();
        int volumeOfCat = input.nextInt();
        if(volume == volumeOfCat){
            System.out.println("COZY");
        }else if(volumeOfCat < volume){
            System.out.println("SO MUCH SPACE");
        }else{
            System.out.println("TOO TIGHT");
        }
    }
}
