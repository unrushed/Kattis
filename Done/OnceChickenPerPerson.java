package Done;

import java.util.Scanner;

public class OnceChickenPerPerson {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int people = input.nextInt();
        int chicken = input.nextInt();

        if((people - chicken) == 1){
            System.out.println("Dr. Chaz needs " + (people - chicken) + " more piece of chicken!");
        }else if((chicken - people) == 1) System.out.println("Dr. Chaz will have " + (chicken - people) + " piece of chicken left over!");
        else if (people > chicken){
            System.out.println("Dr. Chaz needs " + (people - chicken) + " more pieces of chicken!");
        }else {
            System.out.println("Dr. Chaz will have " + (chicken - people) + " pieces of chicken left over!");
        }
    }
}
